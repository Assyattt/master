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
    public static void main(String[] args) {
        System.out.println(IsConsistOfDigits("123A56"));
    }
}
