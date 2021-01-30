  public static void main(String[] args) {

    printEachAndEvery();

  }



  private static void printEachAndEvery() {

    Scanner scanner = new Scanner(System.in);

    int num = scanner.nextInt();

    int ge = num % 10;

    int tmp = num / 10;

    int shi = tmp % 10;

    tmp = num / 100;

    int bai = tmp % 10;

    System.out.println(bai + "," + shi + "," + ge);

  }