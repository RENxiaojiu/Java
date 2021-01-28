  public static void main(String[] args) {

    change();

  }



  public static void change() {

    Scanner scanner = new Scanner(System.in);

    int input = scanner.nextInt();

    String result = Integer.toBinaryString(input);

    int count = 0;

    for (int i = 0; i < 32; i++) {

      if(((input >> i) & 1) == 1){

        count ++;

      }

    }

    System.out.println(count);

  }