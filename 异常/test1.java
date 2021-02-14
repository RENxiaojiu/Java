public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("请输入用户名：");

    String name = scanner.next();

    try {

      name(name);

    } catch (NameException e) {

      e.printStackTrace();

    }

    boolean result = !name.equals("admin");

    //判断输入的用户名是否正确，如果不正确抛出异常且结束运行

    if(result) {

      return;

    }

    System.out.println("请输入密码：");

    String password = scanner.next();

    try {

      password(password);

    } catch (PasswordException e) {

      e.printStackTrace();

    }

}



  public static void name(String name) throws NameException {

    if (!name.equals("admin")) {

      throw new NameException("用户名错误");

    }

  }



  public static void password(String password) throws PasswordException {

    if (!password.equals("123456")) {

      throw new PasswordException("密码错误");

    }

  }