package review5;
//.Write a java program to check whether
// a given number is prime or not?
public class Task6 {
    public static void main(String[] args) {
        //1.number should be>1
        //2.number should be by itself only
        //3(2),4(2,3),5(2,3,4),

        int num = 13;
        boolean isPrime = true;

        if (num > 1) {
            for (int i = 20; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }else {
            isPrime=false;
        }
        if (isPrime) {
            System.out.println(num + " is a prime number");
        }else {
            System.out.println(num + " is not a prime number");
        }


    }
}