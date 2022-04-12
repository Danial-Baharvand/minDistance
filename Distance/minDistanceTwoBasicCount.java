package Distance;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
public class minDistanceTwoBasicCount {
    static int t1=0;    //store the number of basic operations performed

    static double minDistanceTwoBasicCount(int[] A){
        t1=0;//reset t1
        int dmin = Integer.MAX_VALUE;

        for (int i = 0; i < (A.length-1); i++) {

            for (int j=i+1; j < A.length; j++) {
                int temp = Math.abs(A[i] - A[j]);
                t1++;
                if (temp < dmin) {
                    dmin = temp;
                }
            }
        }
        return dmin;
    }
    public static void writeBasic(int[] myArray)throws IOException{
        BufferedWriter writer = new BufferedWriter(new FileWriter("basicCountResultsTwo.txt", true));
        writer.write(Integer.toString(myArray.length));
        writer.write("\t");
        writer.write(Integer.toString(t1));
        writer.write("\t");
        writer.newLine();
        writer.close();
    }

    public static void main(String[] args) throws IOException {
        int[] myArray = Data.makeData(10,0); // Populate the array
        //print to console
        System.out.println("Array: " + Arrays.toString(myArray));
        System.out.println("Min distance: " + minDistanceTwoBasicCount(myArray));
        System.out.println("The basic operation has been performed " + t1 + " times");
    }
}