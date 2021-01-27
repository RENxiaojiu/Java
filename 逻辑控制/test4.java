  public static void main(String[] args) {

    code();

  }



  public static void code() {

    String num = "123456";

    Scanner scanner = new Scanner(System.in);

    int i = 0;

    for (; i < 3; i++) {

      System.out.println("请输入您的密码：");

      String input = scanner.next();

      if(input.equals(num)){

        System.out.println("登录成功");

        break;

      }else {

        System.out.println("登录失败");

      }

    }

    if(i == 3){

      System.out.println("您已经输错三次密码");

  }