import java.util.Scanner;

public class Main {

//    IsConsistOfDigits(String s): This method recursively checks if a string consists of digits.
//    The time complexity is O(n), where n is the length of the string.
    public static boolean IsConsistOfDigits(String s){
        if(s.length()==1 && s.charAt(0) >= 48 && s.charAt(0) <= 71){
            return true;
        }
        if (s.charAt(0) < 48 || s.charAt(0) > 57){
            return false;
        }
        return IsConsistOfDigits(s.substring(1));
    }

//    MinInArray(int length_of_array, int[] array): This method finds the minimum value in an array.
//    It uses a recursive approach but doesn't reduce the size of the array with each recursive call,
//    leading to a time complexity of O(n), where n is the length of the array.

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

//    AverageValueInArray(int length_of_array, float[] array): This method calculates the average value of elements in an array.
//    Similar to the previous method, it uses a recursive approach without reducing the size of the array,
//    resulting in a time complexity of O(n), where n is the length of the array.

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

//    IsPrime(int n): This method checks if a number is prime.
//    It has a time complexity of O(n), as it iterates up to the square root of n to check for divisors.
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

//    NFactorial(int n): This method calculates the factorial of a number.
//    It has a time complexity of O(n), as it uses a recursive approach with n recursive calls.

    public static int NFactorial(int n) {
        if(n==0) return 1;
        return n*NFactorial(n-1);
    }

//    NFibonacci(int n): This method calculates the nth Fibonacci number.
//    It has a time complexity of O(2^n), as it makes two recursive calls for each value of n.

    public static int NFibonacci(int n) {
        if (n==2) {
            return 1;
        } else if (n==1) {
            return 1;
        } else {
            return NFibonacci(n-2)+NFibonacci(n - 1);
        }
    }

//    NPower(int a, int n): This method calculates a^n.
//    It has a time complexity of O(n), as it uses a recursive approach with n recursive calls.
    public static int NPower(int a, int n){
        if (n==0) return 1;
        return a*NPower(a,n-1);
    }

//    ReverseArray(int n, int[] array): This method reverses an array in place.
//    It has a time complexity of O(n), as it iterates through half of the array to swap elements.
    public static int[] ReverseArray(int n, int[] array){
        if (n==array.length/2) {
            return array;
        }
        int temp = array[n-1];
        array[n-1] = array[array.length-n];
        array[array.length-n]=temp;
        return ReverseArray(n-1, array);
    }

//    BinomicalCoefficient(int n, int k): This method calculates the binomial coefficient.
//    It has a time complexity of O(2^n), as it makes two recursive calls for each value of n.
    public static int BinomicalCoefficient(int n, int k) {
        if (k==0 || k==n) {
            return 1;
        } else {
            return BinomicalCoefficient(n-1, k-1)+BinomicalCoefficient(n - 1,k);
        }
    }

//    GCD(int a, int b): This method calculates the greatest common divisor of two numbers using Euclid's algorithm.
//    It has a time complexity of O(log(min(a,b))), as it reduces the problem size by a factor of approximately 2 with each iteration.
    public static int GCD(int a, int b){
        if (a%b==0){
            return b;
        } else {
            return GCD(b, a%b);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Choose an option:");
            System.out.println("1. Check if a string consists of digits");
            System.out.println("2. Find the minimum value in an array");
            System.out.println("3. Calculate the average value in an array");
            System.out.println("4. Check if a number is prime");
            System.out.println("5. Calculate factorial of a number");
            System.out.println("6. Calculate Fibonacci number at a given position");
            System.out.println("7. Calculate a number raised to a power");
            System.out.println("8. Reverse an array");
            System.out.println("9. Calculate binomial coefficient");
            System.out.println("10. Calculate the greatest common divisor (GCD) of two numbers");
            System.out.println("0. Exit");

            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter a string:");
                    String s = scanner.next();
                    boolean isConsistOfDigits = IsConsistOfDigits(s);
                    System.out.println("Is consist of digits: " + isConsistOfDigits);
                    break;
                case 2:
                    System.out.println("Enter the length of the array:");
                    int length = scanner.nextInt();
                    int[] array = new int[length];
                    System.out.println("Enter the elements of the array:");
                    for (int i = 0; i < length; i++) {
                        array[i] = scanner.nextInt();
                    }
                    int minInArray = MinInArray(length, array);
                    System.out.println("Minimum value in array: " + minInArray);
                    break;
                case 3:
                    System.out.println("Enter the length of the array:");
                    int floatLength = scanner.nextInt();
                    float[] floatArray = new float[floatLength];
                    System.out.println("Enter the elements of the array:");
                    for (int i = 0; i < floatLength; i++) {
                        floatArray[i] = scanner.nextFloat();
                    }
                    float averageValue = AverageValueInArray(floatLength, floatArray);
                    System.out.println("Average value in array: " + averageValue);
                    break;
                case 4:
                    System.out.println("Enter a number:");
                    int num = scanner.nextInt();
                    IsPrime(num);
                    break;
                case 5:
                    System.out.println("Enter a number:");
                    int factorialNum = scanner.nextInt();
                    int factorialResult = NFactorial(factorialNum);
                    System.out.println("Factorial of " + factorialNum + " is " + factorialResult);
                    break;
                case 6:
                    System.out.println("Enter the position:");
                    int fibonacciPos = scanner.nextInt();
                    int fibonacciResult = NFibonacci(fibonacciPos);
                    System.out.println("Fibonacci number at position " + fibonacciPos + " is " + fibonacciResult);
                    break;
                case 7:
                    System.out.println("Enter the base:");
                    int base = scanner.nextInt();
                    System.out.println("Enter the exponent:");
                    int exponent = scanner.nextInt();
                    int powerResult = NPower(base, exponent);
                    System.out.println(base + " raised to the power of " + exponent + " is " + powerResult);
                    break;
                case 8:
                    System.out.println("Enter the length of the array:");
                    int reverseLength = scanner.nextInt();
                    int[] reverseArray = new int[reverseLength];
                    System.out.println("Enter the elements of the array:");
                    for (int i = 0; i < reverseLength; i++) {
                        reverseArray[i] = scanner.nextInt();
                    }
                    int[] reversedArray = ReverseArray(reverseLength, reverseArray);
                    System.out.print("Reversed array: ");
                    for (int i : reversedArray) {
                        System.out.print(i + " ");
                    }
                    System.out.println();
                    break;
                case 9:
                    System.out.println("Enter n:");
                    int n = scanner.nextInt();
                    System.out.println("Enter k:");
                    int k = scanner.nextInt();
                    int binomialCoefficient = BinomicalCoefficient(n, k);
                    System.out.println("Binomial coefficient of (" + n + ", " + k + ") is " + binomialCoefficient);
                    break;
                case 10:
                    System.out.println("Enter the first number:");
                    int gcdA = scanner.nextInt();
                    System.out.println("Enter the second number:");
                    int gcdB = scanner.nextInt();
                    int gcdResult = GCD(gcdA, gcdB);
                    System.out.println("GCD of " + gcdA + " and " + gcdB + " is " + gcdResult);
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }
}
