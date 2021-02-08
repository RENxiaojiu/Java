  public static void main(String[] args) {

    int[] arr = {9, 5, 2, 7, 8, 6, 1 };

    int[] result = copyOf(arr);

    System.out.println(Arrays.toString(result));

    System.out.println(Arrays.toString(arr));

    result[0] = 100;

    System.out.println(Arrays.toString(result));

    System.out.println(Arrays.toString(arr));

  }



  public static int[] copyOf(int[] arr) {

    int[] newArr = new int[arr.length];

    for (int i = 0; i < arr.length; i++) {

      newArr[i] = arr[i];

    }

    return newArr;

  }