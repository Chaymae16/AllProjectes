package review4;

public class ArrayReview {
    public static void main(String[] args) {//same datatype
        int i=10;
        int[]arr=new int[3];
        //we store elements based on indexes
        arr[0]=10;
        arr[1]=11;
        arr[2]=12;
        //access also by indexes
        System.out.println(arr[1]);


        String[]planets={"Earth", "Mars","jupiter","Saturn","Neptune"};

        for (int j = 0; j < planets.length ; j++) {
            System.out.print(planets[i]+" ");//indexes j
        }
        String[]planet={"Earth", "Mars","jupiter","Saturn","Neptune"};
        System.out.println("Enhanced for loop");
        //enhanced for loop is used ONLY with arrays and collection

        for (String plane:planet) {
            System.out.println(plane);

        }

    }
}
