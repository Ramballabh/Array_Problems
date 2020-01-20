import java.util.Scanner;

public class RotateLeft {
    public static void main(String[] args) {
        //initialise array
        int[] arr = new int[]{1, 2, 3, 4, 5};
        //n determine the number of times an array should be rotates
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Display original array
        System.out.println("Original array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        //Rotate the given array by n times toward left
        for (int i = 0; i < n; i++) {
            int j, first;
            //Store the first element of the array
            first = arr[0];
            for (j = 0; j < arr.length - 1; j++) {
                //Shift the element of array by one
                arr[j] = arr[j + 1];
            }
            //add first element at the end of array
            arr[j] = first;
        }
        System.out.println();
        System.out.println("Array after rotation : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
