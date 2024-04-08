public class Main {
    public static boolean IsConsistOfDigits(String s){
        if(s.length()==1 && s.charAt(0) >= 48 && s.charAt(0) <= 71){
            return true;
        }
        if (s.charAt(0) < 48 || s.charAt(0) > 57){
            return false;
        }
        return IsConsistOfDigits(s.substring(1));
    }

    public static int MinInArray(int length_of_array, int[] array){
        if (array == null) {
            throw new IllegalArgumentException("Array is empty or it has other length");
        }
        if (length_of_array == 1) {
            return array[length_of_array-1];
        }
        if (array[length_of_array-1]<array[length_of_array-2]){
            array[length_of_array-2] = array[length_of_array-1];
        }
        return MinInArray(length_of_array-1, array);
    }

    public static float AverageValueInArray(int length_of_array, float[] array){
        if (array == null) {
            throw new IllegalArgumentException("Array is empty or it has other length");
        }
        if (length_of_array == 1) {
            return array[length_of_array-1]/array.length;
        }
        array[length_of_array-2] += array[length_of_array-1];
        return AverageValueInArray(length_of_array-1, array);
    }

    public static void IsPrime(int n){
        if (n==2){
            System.out.println("Prime");
            return;
        }
        if (n%2==0){
            System.out.println("Composite");
            return;
        }
        for (int i = 3; i< n/2; i+=2){
            if (n%i==0){
                System.out.println("Composite");
                return;
            }
        }
        System.out.println("Prime");
    }

    public static int NFactorial(int n) {
        if(n==0) return 1;
        return n*NFactorial(n-1);
    }

    public static int NFibonacci(int n) {
        if (n==2) {
            return 1;
        } else if (n==1) {
            return 1;
        } else {
            return NFibonacci(n-2)+NFibonacci(n - 1);
        }
    }

    public static int NPower(int a, int n){
        if (n==0) return 1;
        return a*NPower(a,n-1);
    }
    public static void main(String[] args) {
        int number = 14;
        int n=3;
        System.out.println(NPower(number, n));
    }
}
