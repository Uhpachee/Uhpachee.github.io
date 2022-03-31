import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Calculator {
    private final String expression;
    private ArrayList<String> tokens;
    private ArrayList<String> reverse_polish;
    private Double result;
    private Double calc;

    public Calculator(String expression) {
        // original input
        this.expression = expression;

        // parse expression into terms
        this.termTokenizer();

        // place terms into reverse polish notation
        this.tokensToReversePolishNotation();

        // calculate reverse polish notation
        this.rpnToResult();
    }

    private void rpnToResult()
    {
        // Stack used to hold calculation while process RPN
        Stack calculation = new Stack();
        for (String token : this.reverse_polish)
        {
            if (!isSeperator(token) && !isOperator(token))
            {
                calculation.push(token);
            }
            else
            {
                Double num2 = Double.valueOf((String)calculation.pop());
                Double num1 = Double.valueOf((String)calculation.pop());
                ArrayList<String> operator = new ArrayList<>();
                ArrayList<String> operator1 = new ArrayList<>();
                ArrayList<String> operator2 = new ArrayList<>();
                if (token.equals("+") || token.equals("-")) {
                    operator.add(token);
                } else if(token.equals("*") || token.equals("/") || token.equals("%")) {
                    operator1.add(token);
                } else if (token.equals("^") || token.equals("sqrt")) {
                    operator2.add(token);
                }

                while(operator.size() != 0 && operator1.size() != 0 && operator2.size() != 0) {
                switch(token) {
                    case "+":
                        calc = num1 + num2;
                    case "-":
                        calc = num1 - num2;
                    case "*":
                        calc = num1 * num2;
                    case "/":
                        calc = num1 / num2;
                    case "%":
                        calc = num1 % num2;
                    case "^":
                        calc = Math.pow(num1,num2);
                    case "sqrt":
                        calc = Math.sqrt(num1);
                    default:
                        calc = 0.0;
                }}
                // Pop the two top entries
                // Based off of Token operator calculate result
                calculation.push(String.valueOf(calc));
                // Push result back onto the stack


            }
        }
        // Pop final result and set as final result for expression
        this.calc = Double.valueOf((String)calculation.pop());
    }

    // Print the expression, terms, and result
    public String toString() {
        return ("Original expression: " + this.expression + "\n" +
                "Tokenized expression: " + this.tokens.toString() + "\n" +
                "Reverse Polish Notation: " +this.reverse_polish.toString() + "\n" +
                "Final result: " + String.format("%.2f", this.result));
    }
    // Helper definition for supported operators
    private final Map<String, Integer> OPERATORS = new HashMap<>();
    {
        // Map<"token", precedence>
        OPERATORS.put("^", 2);
        OPERATORS.put("*", 3);
        OPERATORS.put("/", 3);
        OPERATORS.put("%", 3);
        OPERATORS.put("+", 4);
        OPERATORS.put("-", 4);
    }

    // Helper definition for supported operators
    private final Map<String, Integer> SEPARATORS = new HashMap<>();
    {
        // Map<"separator", not_used>
        SEPARATORS.put(" ", 0);
        SEPARATORS.put("(", 0);
        SEPARATORS.put(")", 0);
    }

    // Test if token is an operator
    private boolean isOperator(String token) {
        // find the token in the hash map
        return OPERATORS.containsKey(token);
    }

    // Test if token is an separator
    private boolean isSeperator(String token) {
        // find the token in the hash map
        return SEPARATORS.containsKey(token);
    }

    // Compare precedence of operators.
    private Boolean isPrecedent(String token1, String token2) {
        // token 1 is precedent if it is greater than token 2
        return (OPERATORS.get(token1) - OPERATORS.get(token2) >= 0) ;
    }

    // Takes tokens and converts to Reverse Polish Notation (RPN), this is one where the operator follows its operands.
    private void tokensToReversePolishNotation () {
        // contains final list of tokens in RPN
        this.reverse_polish = new ArrayList<>();

        // stack is used to reorder for appropriate grouping and precedence
        Stack tokenStack = new Stack();
        for (String token : tokens) {
            switch (token) {
                // If left bracket push token on to stack
                case "(":
                    tokenStack.push(token);
                    break;
                case ")":
                    while (tokenStack.peek() != null && !tokenStack.peek().equals("("))
                    {
                        reverse_polish.add( (String)tokenStack.pop() );
                    }
                    tokenStack.pop();
                    break;
                case "+":

                case "-":
                case "*":
                case "/":
                case "%":
                    // While stack
                    // not empty AND stack top element
                    // and is an operator
                    while (tokenStack.peek() != null && isOperator((String) tokenStack.peek()))
                    {
                        if ( isPrecedent(token, (String) tokenStack.peek() )) {
                            reverse_polish.add((String)tokenStack.pop());
                            continue;
                        }
                        break;
                    }
                    // Push the new operator on the stack
                    tokenStack.push(token);
                    break;
                default:    // Default should be a number, there could be test here
                    this.reverse_polish.add(token);
            }
        }
        // Empty remaining tokens
            while (tokenStack.peek() != null) {
                reverse_polish.add((String)tokenStack.pop());
            }

    }
    // Term Tokenizer takes original expression and converts it to ArrayList of tokens
    private void termTokenizer() {
        // contains final list of tokens
        this.tokens = new ArrayList<>();

        int start = 0;  // term split starting index
        StringBuilder multiCharTerm = new StringBuilder();    // term holder
        for (int i = 0; i < this.expression.length(); i++) {
            Character c = this.expression.charAt(i);
            if ( isOperator(c.toString() ) || isSeperator(c.toString())  ) {
                // 1st check for working term and add if it exists
                if (multiCharTerm.length() > 0) {
                    tokens.add(this.expression.substring(start, i));
                }
                // Add operator or parenthesis term to list
                if (c != ' ') {
                    tokens.add(c.toString());
                }
                // Get ready for next term
                start = i + 1;
                multiCharTerm = new StringBuilder();
            } else {
                // multi character terms: numbers, functions, perhaps non-supported elements
                // Add next character to working term
                multiCharTerm.append(c);
            }

        }
        // Add last term
        if (multiCharTerm.length() > 0) {
            tokens.add(this.expression.substring(start));
        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator("8 ^ 4");
        System.out.println(calculator);
    }
}
