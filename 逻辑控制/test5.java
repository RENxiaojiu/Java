  public static void main(String[] args) {

    printMultiplicationTable();

  }



  public static void printMultiplicationTable() {

    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();

    for (int row = 1; row <= n; row++) {

      printLine(row);

    }

  }



  public static void printLine(int row) {

    for (int col = 1; col <= row; col++) {

      System.out.print(col + "x" + row + "=" + row*col + " ");

    }

    System.out.println();

  }