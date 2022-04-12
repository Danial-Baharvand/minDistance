package Distance;
import java.util.Random;

public class Data {
    //options
    //dataRule options : 1 = randomised numbers 2 = ascending numbers 3 = descending numbers
    // 4 = average case 5 = best case 6 = worst case
    //dataSize options: changes the size of the testData array.
    //code
    public static int[] makeData(int dataSize,int dataRules){
        int[] testData=new int[dataSize];
        int[] finalData=new int[testData.length];
        switch (dataRules) {
            case 1:
                Random r= new Random();
                //r.setSeed(10); // uncomment to use specific seed, not used anymore due to better implementation in test
                for (int i = 0; i < testData.length; i++) {
                    finalData[i] = r.nextInt(1001);
                }
                break;
            case 2:
                for (int i = 0; i < testData.length; i++) {
                    finalData[i] = i;
                }
                break;
            case 3:
                for (int i = 0; i < testData.length; i++) {
                    finalData[i] = (int) (testData.length - i - 1);
                }
                break;
            case 4:
                int inc=testData.length/2;
                finalData[0]=1;
                for (int i = 1; i < testData.length; i++) {
                    finalData[i] = finalData[i-1]+inc;
                    if (i%2==0){inc--;}
                }
                break;
            case 5:
                for (int i = 0; i < testData.length; i++) {
                    finalData[i] = 1;
                }
                break;
            case 6:
                int inc2=testData.length;
                finalData[0]=1;
                for (int i = 1; i < testData.length; i++) {
                    finalData[i] = finalData[i-1]+inc2;
                    inc2--;
                }
                break;

        }
        return finalData;
    }
}
