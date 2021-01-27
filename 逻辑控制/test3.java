public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt();

    int b = scanner.nextInt();

    int num = calcGCD(a, b);

    System.out.println(num);

  }



  public static int calcGCD(int a,int b) {

    int min = min(a, b);

    for (int i = min; i >= 1; i--) {

      if(a % i == 0 && b % i == 0){

       return i;

      }

    }

    return 1;

  }



  public static int min(int x,int y){

    if(x > y){

      return x;

    }

    return y;

  }