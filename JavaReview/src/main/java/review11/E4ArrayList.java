package review11;

import java.util.ArrayList;

public class E4ArrayList {
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

        System.out.println(arrayList.isEmpty());  //check the arraylist empty or now
        System.out.println(arrayList.contains("Tahmin"));
        System.out.println(arrayList.indexOf("Semir"));
        arrayList.remove("Semir");
        System.out.println(arrayList);
        arrayList.removeIf(x->x.startsWith("A"));//lambda
        System.out.println(arrayList);



        
    }
}
