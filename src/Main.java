import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
       int[] arr = {1,2,3,4,5,6,7,8,9};

       var i= WindowFunctions.tumblingWindowAverage(arr,3);

        System.out.println(Arrays.toString(i));

    }
}