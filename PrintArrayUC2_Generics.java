package day13;

public class PrintArrayUC2_Generics <T> {
    T[] myArray;

    public PrintArrayUC2_Generics(T[] myArray) {
        this.myArray = myArray;
    }

    private void toPrint() {
        toPrint(this.myArray);
    }

    private static<E> void toPrint(E[] inputArray) {
        for (E element : inputArray) {
            System.out.print(element + "  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4};
        Double[] doubleArray = {1.1, 1.5, 1.89, 3.25};
        Character[] charArray = {'A','B','C','D'};

        new PrintArrayUC2_Generics<Integer>(intArray).toPrint();
        new PrintArrayUC2_Generics<Double>(doubleArray).toPrint();
        new PrintArrayUC2_Generics<Character>(charArray).toPrint();
    }
}

