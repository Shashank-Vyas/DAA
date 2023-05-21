import java.util.*;
public class Week4{
/*  Ques 1. Given an unsorted array of integers, design an algorithm and implement it using a program to
    sort an array of elements by dividing the array into two subarrays and combining these subarrays
    after sorting each one of them. Your program should also find number of comparisons and
    inversions during sorting the array.
*/

/*    static int countComparisons, countInversions;
    public static void merge(int[] arr, int left, int mid, int right){
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for(int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for(int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0;
        int k = left;
        while(i < n1 && j < n2){
            countComparisons++;
            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }else{
                arr[k] = R[j];
                j++;
                countInversions += (n1 - i);
            }
            k++;
        }
        while(i < n1){
            arr[k] = L[i];
            i++;
            k++;
        }
        while(j < n2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int[] arr, int left, int right){
        if(left < right){
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void main(String[] args){
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
            int l = arr.length;

            mergeSort(arr, 0, n - 1);

            System.out.println("Sorted array:");
            for(int i = 0; i < l; i++)
                System.out.print(arr[i] + " ");

            System.out.println("\nNumber of comparisons: " + countComparisons);
            System.out.println("Number of inversions: " + countInversions);
        }
    }
*/

/*  Ques 2. Given an unsorted array of integers, design an algorithm and implement it using a program to
    sort an array of elements by partitioning the array into two subarrays based on a pivot element
    such that one of the sub array holds values smaller than the pivot element while another sub
    array holds values greater than the pivot element. Pivot element should be selected randomly    
    from the array. Your program should also find number of comparisons and swaps required for
    sorting the array.
*/
    
/*    static int comparisons = 0;
    static int swaps = 0;
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
            quickSort(arr, 0, arr.length-1);
            System.out.println("Sorted array: ");
            for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println("\nNumber of comparisons: " + comparisons);
            System.out.println("Number of swaps: " + swaps);
        }
    }
    public static void quickSort(int[] arr, int left, int right){
        if(left < right){
            int pivIdx = partition(arr, left, right);
            quickSort(arr, left, pivIdx-1);
            quickSort(arr, pivIdx+1, right);
        }
    }
    public static int partition(int[] arr, int left, int right){
        int pivotIndex = left + (int)(Math.random() * (right-left + 1)); 
        int pivot = arr[pivotIndex];
        swap(arr, pivotIndex, right); // move pivot to end of array
        int i = left-1;
        for(int j = left; j < right; j++){
            if(arr[j] < pivot){
                i++;
                swap(arr, i, j);
            }
            comparisons++;
        }
        swap(arr, i+1, right); // move pivot to its final position
        swaps++;
        return i+1;
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        swaps++;
    }
*/

/*  Ques 3. Given an unsorted array of integers, design an algorithm and implement it using a program to
    find Kth smallest or largest element in the array. (Worst case Time Complexity = O(n))
*/
    
    public static int quickselect(int[] arr, int k){
        int left = 0, right = arr.length - 1;
        while(left <= right){
            int pivotIndex = partition(arr, left, right);
            if(pivotIndex == k - 1){
                return arr[pivotIndex];
            }else if(pivotIndex < k - 1){
                left = pivotIndex + 1;
            }else{
                right = pivotIndex - 1;
            }
        }
        return -1;
    }

    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;
        for(int j = left; j <= right - 1; j++){
            if(arr[j] <= pivot){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, right);
        return i + 1;
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

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
            System.out.print("Enter the value of K to find Kth smallest element: ");
            int k = sc.nextInt();
            int kthSmallest = quickselect(arr, k);
            System.out.println(kthSmallest);
        }
    }

}
