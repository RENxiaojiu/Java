  public static void main(String[] args) {

   int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

   int pos = binarySearch(arr,9);

    System.out.println(pos);

  }



  public static int binarySearch(int[] arr, int toSearch) {

    int left = 0;

    int right = arr.length - 1;

    while (left <= right){

      int mid =(left + right) / 2;

      if(toSearch < arr[mid]){

        right = mid - 1;

      }else if(toSearch > arr[mid]){

        left = mid + 1;

      }else {

        return mid;

      }

    }

    return -1;

  }