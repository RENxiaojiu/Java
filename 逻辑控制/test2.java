public static void main(String[] args) {

    double result = calcSeries(100);

    System.out.println(result);

  }



  public static double calcSeries(int bound) {

    double sum = 0;

    for (int i = 1; i <= bound; i += 2) {

      sum += calcItem(i);

    }

    return sum;

  }



  public static double calcItem(int i) {

    return 1.0 / i - 1.0 / (i + 1);

  }