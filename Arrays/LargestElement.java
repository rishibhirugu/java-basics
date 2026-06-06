import java.util.Scanner;
public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, n, largest;
       System.out.println("Enter size of array");
        n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the digits in array");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        largest = arr[0];

        for (i = 1; i < n; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }

        System.out.println("The largest element is " + largest);
    }
}
