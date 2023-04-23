package class12;

public class E10StringDemo {
    public static void main(String[] args) {
        String name="LERANDRO";
       // System.out.println(name.charAt(1));
        //System.out.println(name.charAt(i));
        // counter how many R has appeared

        int counter=0;
        for (int i = 0; i <name.length() ; i++) {

            if (name.charAt(i)=='R'){// ==BECAUSE NON-PRIMITIVE char datatype
                counter++;
            }
        }
        System.out.println(counter);
    }
}
