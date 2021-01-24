import java.util.Scanner;

public class Test {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int age = scanner.nextInt();

    if (age <= 18 && age > 0){

      System.out.println("少年");

    } else if(age >= 19 && age <= 28){

      System.out.println("青年");

    } else if(age >= 29 && age <= 55){

      System.out.println("中年");

    } else if (age > 56){

      System.out.println("老年");

    }else{

      System.out.println("输入错误");

    }

  }

}