package class12;

public class Task2 {
    //Print all the indexes wherever the latter 'a' is appearing
    public static void main(String[] args) {
        String name="Today is Saturday";
        for (int i = 0; i <name.length() ; i++) {
            if (name.charAt(i)=='a'){
                System.out.print(i+" ");//indexes
              //  System.out.print(name.charAt(i);a
            }

        }
    }
}
