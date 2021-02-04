  public static void main(String[] args) {

    int[] arr = { 8, 4, 2, 1, 5, 7 };

    double avgValue = avg(arr);

    System.out.println(avgValue);

  }



  public static double avg(int[] arr) {

    double sum = 0;

    for (int i = 0; i < arr.length; i++) {

      sum += arr[i];

    }

    return sum / arr.length;

  }