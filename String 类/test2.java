  public static void main(String[] args) {

    replace();

  }



  public static void replace() {

    String a = "hello world";

    String b = "world";

    String c = a.replaceFirst(b, "java");

    System.out.println(c);

  }