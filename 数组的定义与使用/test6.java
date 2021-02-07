  public static void main(String[] args) {

    int[] arr = {9, 5, 2, 7, 8, 6, 1 };

    bubbleSort(arr);

  }



  public static void bubbleSort(int[] arr) {

    for (int bound = 0; bound < arr.length - 1; bound++) {

      for (int cur = arr.length - 1; cur > bound; cur--) {

        if(arr[cur - 1] > arr[cur]){

          int tmp = arr[cur - 1];

          arr[cur - 1] = arr[cur];

          arr[cur] = tmp;

        }

      }

    }

    System.out.println(Arrays.toString(arr));

  }