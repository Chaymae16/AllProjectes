package review5;
//Create a 2D array of integers. Develop a program which will calculate the
// sum of even and odd numbers for that array.
public class Task4 {
    public static void main(String[] args) {

        int[][] array={{12,-12,67,56},{45,2,4},{56,2},{67,43,11,13}};

        int sumOdd=0;
        int sumEven=0;
        int number;
        for (int r = 0; r < array.length ; r++) {//row
            for (int c = 0; c <array[r].length ; c++) {//colum
                number=array[r][c];

                if (number%2==0){
                    sumEven+=number;

                }else {
                    sumOdd+=number;

                }
            }

            }
        System.out.println("sum of even= "+sumEven);
        System.out.println("sum of even= "+sumOdd);
        }

    }

