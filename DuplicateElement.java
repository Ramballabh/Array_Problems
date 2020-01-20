public class DuplicateElement {
    public static void main(String[] args) {
        //Initialise Array
        int[] arr = new int[]{1, 3, 4, 4, 5, 6, 7, 8, 8, 9};
        System.out.println("Duplicate elements in given array : ");
        //Search for duplicate element
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }
    }
}
