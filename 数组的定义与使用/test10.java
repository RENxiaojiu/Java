  public static void main(String[] args) {

    int[] arr = {9, 5, 2, 7, 8, 6, 1 };

    System.out.println(printArray(arr));

  }







  public static String printArray(int[]arr){

    String result = "[";

    for (int i = 0; i < arr.length; i++) {

      result += arr[i];

      if(arr[i] != arr[arr.length - 1]){

        result += ", ";

      }

    }

    result += "]";

    return result;

  }