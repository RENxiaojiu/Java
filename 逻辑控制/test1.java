import java.util.Random;

import java.util.Scanner;



public class Test1213 {

  public static void main(String[] args) {

    while (true){

      int choice = menu();

      if(choice == 1){

        game();

      }else if(choice == 2){

        System.out.println("goodbye.");

        break;

      }else {

        System.out.println("您的输入有误，请重新输入：");

      }

    }

  }



  public static void game() {

    Random random = new Random();

    int toGuess = random.nextInt(100) + 1;

    Scanner scanner = new Scanner(System.in);

    while(true){

      int num = scanner.nextInt();

      if(toGuess > num){

        System.out.println("低了");

      }else if (toGuess < num){

        System.out.println("高了");

      }else {

        System.out.println("猜对了");

        break;

      }

    }

  }



  public static int menu() {

    System.out.println("===================");

    System.out.println(" 1. 开始游戏");

    System.out.println(" 2. 退出游戏");

    System.out.println("===================");

    System.out.println("请输入您的选择：");

    Scanner scanner = new Scanner(System.in);

    int choice = scanner.nextInt();

    return choice;

  }