  public static void main(String[] args) {

    int[] arr = { 8, 4, 2, 1, 5, 7 };

    int sumValue = sum(arr);

    System.out.println(sumValue);

  }



  public static int sum(int[] arr) {

    int sum = 0;

    for (int i = 0; i < arr.length; i++) {

      sum += arr[i];

    }

    return sum;

  }