package review3;

public class SwitchStatement {
    public static void main(String[] args) {
        String color="red";

        // .toLowerCase(),.toUpperCase
        switch (color.toUpperCase()){
            case "red":
                System.out.println("Stop");
                break;
            case"Orange":
                System.out.println("Yield");
                break;
            case "Green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Unknown color");

                }
        }
    }

