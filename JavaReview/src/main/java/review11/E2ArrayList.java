package review11;

import java.util.ArrayList;

public class E2ArrayList {
    public static void main(String[] args) {

        //This is an ArrayList of String
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Adam");
        arrayList.add("Sarah");
        arrayList.add("Halima");
        arrayList.add("Abdul");
        arrayList.add("Semir");
        arrayList.add("Semir");
        System.out.println(arrayList);
        System.out.println(arrayList);
        System.out.println(arrayList.contains("Abdul"));

        //loop
        for (int i = 0; i <arrayList.size() ; i++) {
            //extract the names
            String name=arrayList.get(i);
            if (name.contains("a")){
                System.out.println(arrayList.get(i));
            }

        }
    }
}
