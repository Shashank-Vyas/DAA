import java.util.*;
public class Week3{
/*  Ques 1. Given an unsorted array of integers, design an algorithm and a program to sort the array using
    insertion sort. Your program should be able to find number of comparisons and shifts ( shifts -
    total number of times the array elements are shifted from their place) required for sorting the
    array.
*/
/*    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for number of test cases
        System.out.print("Enter the number of test cases: ");
        int T = sc.nextInt();

        // Loop for each test case
        for(int t = 1; t <= T; t++){
            // Input for size of array
            System.out.print("\nEnter the size of the array for test case " + t + ": ");
            int n = sc.nextInt();

            // Input for array elements
            int[] arr = new int[n];
            System.out.print("Enter the array elements for test case " + t + ": ");
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            // Sort the array using insertion sort and count comparisons and shifts
            int comparisons = 0;
            int shifts = 0;
            for(int i = 1; i < n; i++){
                int key = arr[i];
                int j = i - 1;
                while(j >= 0 && arr[j] > key){
                    arr[j + 1] = arr[j];
                    j--;
                    comparisons++;
                    shifts++;
                }
                arr[j + 1] = key;
                shifts++;
            }
            System.out.print("Sorted array: ");
            for(int i = 0; i < n; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            System.out.println("Number of comparisons: " + comparisons);
            System.out.println("Number of shifts: " + shifts);

        }
    }
*/

/*  Ques 2. Given an unsorted array of integers, design an algorithm and implement a program to sort this
    array using selection sort. Your program should also find number of comparisons and number of
    swaps required. 
*/
/*    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for number of test cases
        System.out.print("Enter the number of test cases: ");
        int T = sc.nextInt();

        // Loop for each test case
        for(int t = 1; t <= T; t++){
            // Input for size of array
            System.out.print("\nEnter the size of the array for test case " + t + ": ");
            int n = sc.nextInt();

            // Input for array elements
            int[] arr = new int[n];
            System.out.print("Enter the array elements for test case " + t + ": ");
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            // Sort the array using selection sort and count comparisons and swaps
            int comparisons = 0;
            int swaps = 0;
            for(int i = 0; i < n - 1; i++){
                int minIndex = i;
                for(int j = i + 1; j < n; j++){
                    if(arr[j] < arr[minIndex]){
                        minIndex = j;
                    }
                    comparisons++;
                }
                if(minIndex != i){
                    int temp = arr[i];
                    arr[i] = arr[minIndex];
                    arr[minIndex] = temp;
                    swaps++;
                }
            }
            System.out.print("Sorted array: ");
            for(int i = 0; i < n; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            System.out.println("Number of comparisons: " + comparisons);
            System.out.println("Number of swaps: " + swaps);
        }
    }
*/

/*  Ques 3. Given an unsorted array of positive integers, design an algorithm and implement it using a
    program to find whether there are any duplicate elements in the array or not. (use sorting) (Time
    Complexity = O(n log n)) 
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for number of test cases
        System.out.print("Enter the number of test cases: ");
        int T = sc.nextInt();

        // Loop for each test case
        for(int t = 1; t <= T; t++){
            // Input for size of array
            System.out.print("\nEnter the size of the array for test case " + t + ": ");
            int n = sc.nextInt();

            // Input for array elements
            int[] arr = new int[n];
            System.out.print("Enter the array elements for test case " + t + ": ");
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int flag = 0;
            for(int i = 0; i < n-1 ; i++){
                if(arr[i] == arr[i + 1]){
                    flag = 1;
                    break;
                }
            }
            if(flag == 1){
                System.out.println("Duplicate elements found");
            }else{
                System.out.println("No duplicate elements found");
            }
        }
    }


}
