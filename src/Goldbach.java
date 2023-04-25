/**
 * For a given even integer number n in the proven Goldbach range,
 * the methods in this class can be used to find two prime integer numbers whose sum eqauls n.
 */
public class Goldbach {

    //TODO: 1.1 b)+c)
    // Vorbedingung: Der Algorithmus bekommt eine Zahl z mit der Eigenschaft:


    public static boolean vorbed(int z) {

        return z % 2 == 0 && z > 2 && z < 4 * Math.pow(10, 8);
    }
    public static boolean nachbed(Pair<Long> num,long z) {

        long n = num.getElement1();
        long m = num.getElement2();

        if(n>1){ // n >1 und nur durch 1 und sich selbst (ohne Rest) teilbar.
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
        if(m>1){ // m >1 und nur durch 1 und sich selbst (ohne Rest) teilbar.
            for (int i = 2; i <= Math.sqrt(m); i++) {
                if (m % i == 0) {return false;}
            }
            return true;}

        if(n+m == z){ // n+m=z
            return true;}
        return false;}

    }




