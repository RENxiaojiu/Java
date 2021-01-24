import java.util.Scanner;

public class Test {public static void main(String[] args) {
        Scanner num= new Scanner(System.in);
        int a =num.nextInt();
        if(isPrime(a)){
            System.out.println("是素数");
        }else {
            System.out.println("不是素数");
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