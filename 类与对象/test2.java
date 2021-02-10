    public static void main(String[] args) {
        int[] arr = {9, 5, 2, 7, 6, 3, 1};
        int[] arr2 = {1, 2, 3, 4, 5, 6};
        change(arr, arr2);
    }

    public static void change(int[] arr, int[] arr2) {
        int[] arr3 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr3[i] = arr[i];
        }
        arr = arr2;
        arr2 = arr3;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }