public static void main(String[] args) {

    reorder();

  }



  public static void reorder() {

    int[] arr = {1,2,3,4,5,6,7,8,9,10};

    for (int i = 0; i <arr.length ; i++) {

      for (int j = i + 1; j < arr.length; j++) {

        if(arr[i] % 2 == 0){

          int tmp = arr[j];

          arr[j] = arr[i];

          arr[i] = tmp;

        }

      }

      System.out.print(arr[i] + " ");

    }

  }