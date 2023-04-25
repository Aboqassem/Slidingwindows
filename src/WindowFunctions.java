/**
 * Adaptation from window functions known from stream processing analytics to process arrays in a stream-like fashion.
 */
public class WindowFunctions {

    /**
     * This sliding window function computes the sum of multiple windowSize-many consecutive elements in an array.
     * It slides one element at a time, producing an overlap of windows.
     * @param input The array to process with sliding window (needs to be have at least windowSize elements).
     * @param windowSize The positive size of the window.
     * @return The results for each window when sliding one element at a time.
     */
    public static int[] slidingWindowSum(int[] input, int windowSize) throws Exception {
        //TODO: 1.4 a)

        // when the Array size is smaller than the windowsSize throw EXP.
        if(input.length < windowSize){
            throw new Exception("The Array size is smaller than the windowsize! ");
        }

        int[] result = new int[input.length - windowSize + 1];
        for (int j = 0; j <= input.length - windowSize; j++) {
            int sum = 0;
            for (int i = j; i < j + windowSize ; i++) {
            sum += input[i];
        } result[j] = sum;}

        return result;
    }

    /**
     * This tumbling window function computes the average of multiple windowSize-many consecutive elements in an array.
     * It slides windowSize element at a time, producing no overlap of windows.
     * @param input The array to process with tumbling window
     *              (needs to have an integer number of distinct windows with exactly windowSize elements).
     * @param windowSize The positive size of the window.
     * @return The results for each window when sliding windowSize element at a time.
     */
    public static double[] tumblingWindowAverage(int[] input, int windowSize) throws Exception{
        //TODO: 1.4 b)

        // Check if the input array can be divided into windows of equal size
        if (input.length % windowSize != 0) {
            throw new Exception("Input array cannot be divided into windows of equal size.");
        }

        int newWindowSize = input.length/windowSize;
        double[] result = new double[newWindowSize];

        for (int i = 0; i < newWindowSize; i++) {
            int startIndex = i * windowSize;
            int endIndex = startIndex + windowSize;
            int sum =0;
            for (int j = startIndex; j < endIndex; j++) {
                sum += input[j];
            }

            result[i] = sum/windowSize;
        }


        return result;
    }

}
