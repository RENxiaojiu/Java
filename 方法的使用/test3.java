 public static void main(String[] args) {

    factorialSum();

  }



  public static void factorialSum() {

    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();

    int sum = 0;

    for (int i = 1; i <= n; i++) {

      int tmp = 1;

      for (int j = 1; j <= i; j++) {

        tmp *= j;

      }

      sum += tmp;

    }

    System.out.println(sum);

  }