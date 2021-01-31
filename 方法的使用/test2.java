  public static void main(String[] args) {

      fibonacciNumber();

  }



  public static void fibonacciNumber() {

    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();

    int num1 = 1;

    int num2 = 1;

    int tmp = 0;

    if(n < 3 && n > 0){

      System.out.println(1);

    }else if(n >= 3){

      for (int i = 2; i < n; i++) {

        tmp = num1 + num2;

        num1 = num2;

        num2 = tmp;

      }

      System.out.println(tmp);

    } else{

      System.out.println("错误");

    }

  }