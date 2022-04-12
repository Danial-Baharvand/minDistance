package Distance;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class minDistanceTimeCount {
    // system time calculation has been inspired by
    // https://stackoverflow.com/questions/7467245/cpu-execution-time-in-java
    // options
    // Change the value of runs to modify the number of times the algorithm will be executed
    static final int runs=1000;
    // Change the value of wormUpRuns to modify the number of times the algorithm
    // will be executed without being recorded
    static final int wormUpRuns=1000;
    static long time;
    static long minDistanceTimeCount(int[] A) {
        long start = 0; // stores the system time after the first (10000) executions
        for(int t=-wormUpRuns;t<runs;t++) {
            // skipping first (10000) runs to include CPU JDE, CPU and cashing optimazations
            if(t == 0) start = System.nanoTime();
            // The algorithm
            int dmin = Integer.MAX_VALUE;
            for (int i = 0; i < A.length; i++) {
                for (int j=0; j < A.length; j++) {
                    if (i != j && Math.abs(A[i] - A[j]) < dmin) {
                        dmin = Math.abs(A[i] - A[j]);
                    }
                }
            }
        }
        time = System.nanoTime() - start;// recording the passed time
        return time;
    }
    public static void writeTime(int[] myArray)throws IOException{
        BufferedWriter writer = new BufferedWriter(new FileWriter("timeResults.txt", true));
        writer.write(Integer.toString(myArray.length));
        writer.write("\t");
        writer.write(Long.toString(time/runs));
        writer.newLine();
        writer.close();
    }
    public static void main(String[] args) throws IOException {
        int[] myArray = Data.makeData(10,0); // make test data
        minDistanceTimeCount(myArray);
        //Print to console
        System.out.println("Array: " + Arrays.toString(myArray));
        System.out.printf("Each run of the algorithm took an average of %,d ns%n", time/runs);
        System.out.printf("The total of %d runs took %,d ns%n",runs, time );
    }




}
