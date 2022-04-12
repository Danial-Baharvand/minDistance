package Distance;


import java.io.IOException;

public class test {
    public static void basicTest(int maxDataSize, int points,int dataRules)throws IOException {
        for (int i = 0; i<=points; i++) {
            int[] myArray = Data.makeData(maxDataSize/points*i, dataRules);// make array based on options
            minDistanceBasicCount.minDistanceBasicCount(myArray);//claculate basic operations of the first algorithm
            minDistanceBasicCount.writeBasic(myArray);//store the information in file
            minDistanceTwoBasicCount.minDistanceTwoBasicCount(myArray);//claculate basic operations of the second algorithm
            minDistanceTwoBasicCount.writeBasic(myArray);//store the information in file
        }
    }
    public static void timeTest(int maxDataSize, int points, int dataRules)throws IOException {
        for (int i = 0; i<=points; i++) {
            int[] myArray = Data.makeData(maxDataSize/points*i, dataRules);// make array based on options
            minDistanceTimeCount.minDistanceTimeCount(myArray);//claculate execution time of the first algorithm
            minDistanceTimeCount.writeTime(myArray);//store the information in file
            minDistanceTwoTimeCount.minDistanceTwoTimeCount(myArray);//claculate execution time of the second algorithm
            minDistanceTwoTimeCount.writeTime(myArray);//store the information in file
        }
    }

    public static void main(String[] args) throws IOException {
        // Test the number of basic operation for specified collection of arrays and store results in file
        basicTest(10000,100,1);
        // Test the execution times for specified collection of arrays and store results in file
        timeTest(10000,100,1);
    }
}
