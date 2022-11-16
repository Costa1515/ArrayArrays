public class Main {
    public static void main(String[] args) {
        int[] array1 = {2, 9, 6, 4};
        int[] array2 = {0, 3, 1, 8};
        int[] array3 = {7, 5, 3, 5};


        int[][]arrays = {array1, array2, array3};
        for(int[] array: arrays) {
            for(int i: array) {
                System.out.print(i +" ");
            }
            System.out.print(" ");
        }

    }
}