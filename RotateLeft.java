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
            System.out.println(arr[i] + " ");
        }


    }
}
