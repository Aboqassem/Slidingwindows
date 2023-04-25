public class WindowFunctions22 {

    public static void main(String[] args) {

        int[] zahlen = {2,4,3,5,7,9,3,4,1,2,5,7,8,8,6};


        // Für Aufgabe 2a

        int[] zahlen2 = slidingWindowSum(zahlen,5);

        for (int t : zahlen2){
            System.out.println(t);
        }

        // Für Aufgabe 2b

        double[] zahlen3 = tumblingWindowAverage(zahlen,5);

        for (double t : zahlen3){
            System.out.println(t);
        }


    }





    public static int[] slidingWindowSum(int[] input, int windowSize)throws NegativeArraySizeException{

        if (input.length<windowSize) throw new NegativeArraySizeException("Array size is Negativ");

        int[] newArray = new int[input.length-windowSize+1];

        int summe = 0;

        for (int i = 0; i<input.length-windowSize+1;i++){
                for (int k = i; k<i+5;k++){

                    summe = input[k]+summe;
                }
                newArray[i] = summe;
                summe = 0;
            }
        return newArray;

    }

    public static double[] tumblingWindowAverage(int[] input, int windowSize)throws NegativeArraySizeException,ArrayIndexOutOfBoundsException{

        if (input.length<windowSize) throw new NegativeArraySizeException("Array size is Negativ");

        int index;

        double[] newArray;

        if (input.length%windowSize == 0){
            index = input.length/windowSize;
        }else {
            index = (input.length/windowSize)+1;
        }

        newArray = new double[index];

        double durchnit = 0;

        for (int i =1; i<index+1;i++){
            for (int k = i*5; k<i*5+5;k++){

                if (input.length%windowSize !=0)throw new ArrayIndexOutOfBoundsException("Array size is");

                durchnit += input[k-5];

            }
            newArray[i-1] =durchnit/windowSize;

            durchnit=0;

        }
        return newArray;
    }

}
