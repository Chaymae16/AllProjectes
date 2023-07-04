package review12;

import java.util.HashMap;
import java.util.Map;

public class E4Maps {
    public static void main(String[] args) {

        Map<String,Integer> map=new HashMap<>();
        map.put("Apple",3);// ad not parte of ColectionframeWork
        map.put("Kiwi",2);
        map.put("Orange",4);
        map.put("Mango",3);
        map.put("Banana",30);
        System.out.println(map);
        map.entrySet().removeIf(x-> x.getKey().contains("a") &&x.getValue()>3);// key and value same time method entrySet
        System.out.println(map);

        







    }
}
