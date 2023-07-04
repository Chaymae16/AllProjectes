package review3;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean loginButtonDisplayed=true;
        boolean loginClickable=false;
        if (loginButtonDisplayed && loginClickable){
            System.out.println("test passed");
        }else {
            System.out.println("Test failed");
        }
        boolean picture=true;
        String accountName="Syntax";
        if (picture || accountName.equals("Syntax")){
            System.out.println("Login was sucessful");
        }else {
            System.out.println("Login was not able to sucessful");

        }
        boolean hungry=!true;
        System.out.println(hungry);

        boolean cold=false;
        System.out.println(!cold);

        String str="Bye";
        if (!str.equals("Hello")){
            System.out.println("Value of the string is not hello");
        }

        boolean confirmSelected=false;
        if (!confirmSelected){
            System.out.println("Let's click on confirm checkbox");
        }
        System.out.println("Click on pay button");
    }
}
