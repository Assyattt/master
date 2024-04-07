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

    public static void main(String[] args) {
        int[] numbers = {0, 5, 32, 3, 45};
        System.out.println(MinInArray(5, numbers));
    }
}
