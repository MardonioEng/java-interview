/*
Q2 - How to create a pyramid of numbers in Java?
 */
public class PyramidOfNumbers {
    public static void main(String[] args) {

        int height = 9;

        for (int i = 1; i <= height; i++) {
            for (int j = i; j < height; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.printf("%d ", i);
            }
            System.out.println();
        }

    }
}

