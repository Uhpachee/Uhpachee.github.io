public class FRQ1 {
  public static int arraySum(int[] arr) {
    int sum = 0;
    for(int a : arr) {
      sum += a;
    }
    return sum;
  }
  
  public static int rowSums(int[][] arr2D) {
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
      if(temp == check[j]) {
        yes = false;
      }
    }
    return yes;
  }
}