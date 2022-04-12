package Distance;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
public class minDistanceBasicCount {
    static long t1=0;    //store the number of basic operations performed

    static int minDistanceBasicCount(int[] A){
        t1=0;//reset t1
        int dmin = Integer.MAX_VALUE;
        for (int i = 0; i < A.length; i++) {
            for (int j=0; j < A.length; j++) {
                if (i != j &&t1++>0&& Math.abs(A[i] - A[j]) < dmin) {
                    dmin = Math.abs(A[i] - A[j]);
                }
            }
        }
        return dmin;
    }
    public static void writeBasic(int[] myArray)throws IOException{
        BufferedWriter writer = new BufferedWriter(new FileWriter("basicCountResults.txt", true));
        writer.write(Integer.toString(myArray.length));
        writer.write("\t");
        writer.write(Long.toString(t1));
        writer.write("\t");
        writer.newLine();
        writer.close();
    }
    public static void main(String[] args) throws IOException {
        int[] myArray = Data.makeData(200,1); // Populate the array
        //print to console
        System.out.println("Array: " + Arrays.toString(myArray));
        System.out.println("Min distance: " + minDistanceBasicCount(myArray));
        System.out.println("The basic operation has been performed " + t1 + " times");
    }
}
