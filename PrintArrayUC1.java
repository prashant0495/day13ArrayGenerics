package day13;

public class PrintArrayUC1 {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4};
        Double[] doubleArray = {1.1, 1.5, 1.89, 3.25};
        Character[] charArray = {'A','B','C','D'};
        toPrint(intArray);
        toPrint(doubleArray);
        toPrint(charArray);
    }

    private static void toPrint(Integer[] intArray) {
        for (int i : intArray) {
            System.out.print(i + "  ");
        }
        System.out.println();
    }

    private static void toPrint(Double[] doubleArray) {
        for (double i : doubleArray) {
            System.out.print(i + "  ");
        }
        System.out.println();
    }

    private static void toPrint(Character[] charArray) {
        for (char i : charArray) {
            System.out.print(i + "  ");
        }
        System.out.println();
    }
}
