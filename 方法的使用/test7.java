  public static void main(String[] args) {

    heavyLoad();

  }



  public static void heavyLoad() {

    Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt();

    int b = scanner.nextInt();

    System.out.println("两个整数的最大值为：" + max1(a,b));

    double m = scanner.nextDouble();

    double n = scanner.nextDouble();

    System.out.println("两个小数的最大值为：" + max4(m,n));

    int k = scanner.nextInt();

    System.out.println("两个小数个一个整数的最大值为：" + max5(m,n,k));

  }



  public static double max5(double m, double n, int k) {

    double max = max4(max4(m,n),k);

    return max;

  }





  public static double max4(double m, double n) {

    double max = m >= n ? m : n;

    return max;

  }



  public static int max1(int a ,int b) {

    int max = a >= b ? a : b;

    return max;

  }