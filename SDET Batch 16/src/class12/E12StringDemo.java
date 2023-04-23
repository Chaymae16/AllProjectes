package class12;

public class E12StringDemo {
    public static void main(String[] args) {


        String sentence = "yup we have another class";
        System.out.println(sentence.substring(7));// every thing from index like 7,2,..
        System.out.println(sentence.substring(4,11));//first index and last index

        int startIndex=sentence.length()-4;
        System.out.println(sentence.substring(startIndex));
    }
}
