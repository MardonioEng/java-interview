/*
Q3 - How do you remove all white spaces from a string in Java?
 */
public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String str = "Mardonio Rodrigues";
        String outputStr = str.replaceAll("\\s+", "");

        System.out.println(outputStr);
    }
}
