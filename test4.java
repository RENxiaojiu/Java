public class Test {

  public static void main(String[] args) {

    printAllPrime(1, 100);

  }



  public static void printAllPrime(int begin, int end) {

    for (int i = begin; i <= end; i++) {

      if(isPrime(i)){

        System.out.println(i);

      }

    }

  }



  public static boolean isPrime(int num) {

    if (num == 1){

      return false;

    }

    for (int i = 2; i < num; i++) {

      if(num % i == 0){

        return false;

      }

    }

    return true;

  }

}