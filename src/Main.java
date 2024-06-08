import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("##########################################");
        System.out.println("WELCOME TO DHAKA INTERNATION UNIVERSITY");
        System.out.println("        DATA STRUCTURE LAB-2");
        System.out.println("              SORTING");
        System.out.println("#########################################");

        while (true){
            System.out.println("1. Bubble Sort");
            System.out.println("2. Selection Sort");
            System.out.println("3. Insertion Sort");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            System.out.println("================================================");
            switch (choice){
                case 1:
                    System.out.println("You Choose option 1, so Bubble Sort is applied");
                    System.out.println("================================================");
                    performBubbleSort(scanner);
                    break;
                case 2:
                    System.out.println("You Choose option 2, so Selection Sort is applied ");
                    System.out.println("================================================");
                    performSelectionSort(scanner);
                    break;
                case 3:
                    System.out.println("You Choose option 3, so Insertion Sort is applied ");
                    System.out.println("================================================");
                    performInsertionSort(scanner);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }
    }
    private static void performBubbleSort(Scanner scanner) {
        int[] array = getArrayFromUser(scanner);
        System.out.println(Arrays.toString(array));
        System.out.println("================================================");
        System.out.println("Press 1 to sort Ascending order ");
        System.out.println("Press 2 to sort Descending order ");
        System.out.print("Choose an option : ");
        int sortOrder = scanner.nextInt();
        System.out.println("================================================");
        int[] sortArrar = selectionSort(array, sortOrder);
        System.out.println(Arrays.toString(sortArrar));
        System.out.println("================================================");
    }
    public static void performSelectionSort(Scanner scanner){
        int[] array = getArrayFromUser(scanner);
        System.out.println(Arrays.toString(array));
        System.out.println("================================================");
        System.out.println("Press 1 to sort Ascending order ");
        System.out.println("Press 2 to sort Descending order ");
        System.out.print("Choose an option : ");
        int sortOrder = scanner.nextInt();
        System.out.println("================================================");
        int[] sortArrar = selectionSort(array, sortOrder);
        System.out.println(Arrays.toString(sortArrar));
        System.out.println("================================================");

    }
    public static void performInsertionSort(Scanner scanner){

    };
    public static int[] bubbleSort(int array[], int sortOrder) {
        return 0;
    }
    public static int[] selectionSort(int array[], int sortOrder) {
        int size = array.length;
        for (int step = 0; step < size - 1; step++) {
            int min_idx = step;
            if (sortOrder == 1) {
                for (int i = step + 1; i < size; i++) {

                    // For Ascending order

                    if (array[i] < array[min_idx]) {
                        min_idx = i;
                    }
                }
            }else {
                for (int i = step + 1; i < size; i++) {

                    // For Descending order

                    if (array[i] > array[min_idx]) {
                        min_idx = i;
                    }
                }
            }

            // put min at the correct position
            int temp = array[step];
            array[step] = array[min_idx];
            array[min_idx] = temp;
        }
        return array;
    }

    public static int[] getArrayFromUser(Scanner scanner){
        System.out.print("Enter the size of the Array: ");
        int size = scanner.nextInt();
        System.out.println("================================================");
        int[] array = new int[size];
        for (int i=0;i<size;i++){
            System.out.print("Enter " + (i + 1) + " elements of the array:");
            array[i] = scanner.nextInt();
        }
        return array;
    }
}