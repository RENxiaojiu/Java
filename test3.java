public class Test {

  public static void main(String[] args) {

    printAllLeapYear(1000, 2000);

  }



  public static void printAllLeapYear(int begin, int end) {

    for (int year = begin; year <= end; year++) {

      if(isLeapYear(year)){

        System.out.println(year);

      }

    }

  }



  public static boolean isLeapYear(int year) {

    if(year % 100 == 0){

      if(year % 400 == 0){

        return true;

      }

      return false;

    }else {

      if(year %4 == 0){

        return true;

      }

      return false;

    }

  }

}