  public static void main(String[] args) {

    sumOverloading();

  }



  public static void sumOverloading() {

    Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt();

    int b = scanner.nextInt();

    System.out.println("a + b = " + sum1(a,b));

    double m = scanner.nextDouble();

    double n = scanner.nextDouble();

    double k = scanner.nextDouble();

    System.out.println("m + n + k = " + sum2(m,n,k));

  }



  public static double sum2(double m,double n,double k) {

    double sum = m + n + k;

    return sum;

  }



  public static int sum1(int a, int b) {

    int sum = a + b;

    return sum;

  }