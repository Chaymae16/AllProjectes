package review11;

import java.util.*;

public class E11 {
    public static void main(String[] args) {
        //Set no allow duplicate value
        Set<String> names=new HashSet<>();
        names.add("MaazYar");
        names.add("Oksana");
        names.add("Ana");
        names.add("Masoud");
        names.add("Mark");
        names.add("Mark");

        
        System.out.println(names);
        List<String> list=new ArrayList<>(names);
        Collections.sort(list);// sort by alphabets
        System.out.println(list);
        //System.out.println(list.get(1));
    }
}
