package Day_02;

public class String {
   
    public static java.lang.String reverse(java.lang.String str2) {
        StringBuilder reversed = new StringBuilder(str2);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {
        java.lang.String str2 = "krr";
        System.out.println(reverse(str2));
    }
}
