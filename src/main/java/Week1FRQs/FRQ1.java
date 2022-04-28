package Week1FRQs;

public class FRQ1 {
  public static int arraySum(int[] arr) {
    int sum = 0;
    for(int a : arr) {
      sum += a;
    }
    return sum;
  }
  
  public static int[] rowSums(int[][] arr2D) {
    int[] sum = new int[arr2D.length];
    for (int i = 0; i < arr2D.length; i++) {
      int[] temp = new int[arr2D[i].length];
      for (int j = 0; j < arr2D[i].length; j++) {
        temp[j] = arr2D[i][j];
      }
      sum[i] = arraySum(temp);
    }
    return sum;
  }

  public static boolean isDiverse(int[][] arr2D) {
    boolean yes = true;
    int[] check = rowSums(arr2D);
    int temp = 0;
    for(int i = 0; i < check.length; i++) {
      if(temp == check[i]) {
        yes = false;
      }
    }
    return yes;
  }

  public static void main(String[] args) {
    int[][] test = {
            {1, 2, 3, 4, 5, 6, 7},
            {8, 9, 1, 5, 3, 4, 2},
            {8, 5, 4, 2, 8, 6, 3},
            {1, 9, 5, 2, 9, 6, 4}
    };
    FRQ1 a = new FRQ1();
    System.out.println(a.isDiverse(test));
  }
}