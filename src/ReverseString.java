/*
Q1 - How to reverse a string in Java?
Use recursive method
 */
public class ReverseString {
    public static void main(String[] args){
        String result1 = reverse("Rodrigues");
        System.out.println(result1);
    }

    public static String reverse(String str) {
        if (str.length() == 1) {
            return str;
        }
        return str.charAt(str.length() - 1) + reverse(str.substring(0, str.length()-1));
    }
}
