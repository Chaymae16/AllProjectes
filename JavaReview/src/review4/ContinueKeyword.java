package review4;

public class ContinueKeyword {
    public static void main(String[] args) {

        for (int i = 1; i <=5 ; i++){
            if (i==3){
                continue;//skip the number

            }
            System.out.println(i);
            System.out.println("Hi");
            System.out.println("Bye");
        }
    }
}
