
package review11;

import java.util.ArrayList;
import java.util.LinkedList;

public class E7ArrayList {
    public static void main(String[] args) {

        //This is an ArrayList of String
       LinkedList<String> student=new LinkedList<>();
        student.add("Adam");
        student.add("Sarah");
        student.add("Halima");
        student.add("Abdul");
        student.add("Semir");
        student.add("Semir");

//ArrayList : take time,very slow  shifting happen when data remove indexes change (shift)
//LinkedList : no indexes very easy to remove or add data not like ArrayList

        //student.remove("Halima");
        student.add(3,"James");
        System.out.println(student);






        
    }
}
