import java.util.*;
public class Week1 {

/*  Ques 1. Given an array of nonnegative integers, design a linear algorithm and implement it using a
    program to find whether given key element is present in the array or not. Also, find total number
    of comparisons for each input case. (Time Complexity = O(n), where n is the size of input)
*/

/*    public static void main(String[] args){
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

            // Input for key element to search for
            System.out.print("Enter the key element to search for in test case " + t + ": ");
            int key = sc.nextInt();
            int comparisons = 0;
            boolean found = false;
            for(int i = 0; i < n; i++){
                comparisons++;
                if(arr[i] == key){
                    found = true;
                    break;
                }
            }
            if(found){
                System.out.println("Key element " + key + " is present in array for test case " + t);
            }else{
                System.out.println("Key element " + key + " is not present in array for test case " + t);
            }

            // Output total number of comparisons made
            System.out.println("Total number of comparisons made for test case " + t + ": " + comparisons);
        }
    }
*/

/*  Ques 2. Given an already sorted array of positive integers, design an algorithm and implement it using a
    program to find whether given key element is present in the array or not. Also, find total number
    of comparisons for each input case. (Time Complexity = O(nlogn), where n is the size of input). 
*/
/*    public static void main(String[] args){
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

            // Input for key element to search for
            System.out.print("Enter the key element to search for: ");
            int key = sc.nextInt();

            // Binary search to find whether key element is present in array or not
            int comparisons = 0;
            int left = 0;
            int right = n - 1;
            boolean found = false;
            while(left <= right){
                int mid = (left + right) / 2;
                comparisons++;
                if(arr[mid] == key){
                    found = true;
                    break;
                }else if(arr[mid] < key){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
            if(found){
                System.out.print("Present ");
            }else{
                System.out.print("Not Present ");
            }
            System.out.print(comparisons);

        }

    }
*/

/*  Ques 3.  Given an already sorted array of positive integers, design an algorithm and implement it using a
    program to find whether a given key element is present in the sorted array or not. For an array arr[n], 
    search at the indexes arr[0], arr[2], arr[4],.....,arr[2k] and so on. Once the interval (arr[2k] < key 
    < arr[ 2k+1] ) is found, perform a linear search operation from the index 2k to find the element key. 
    (Complexity < O(n), where n is the number of elements need to be scanned for searching): Jump Search
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

            // Input for key element to search for
            System.out.print("Enter the key element to search for: ");
            int key = sc.nextInt();

            // Jump search to find whether key element is present in array or not
            int comparisons = 0;
            int step = (int) Math.floor(Math.sqrt(n));
            int prev = 0;
            while(arr[Math.min(step, n) - 1] < key){
                comparisons++;
                prev = step;
                step += (int)Math.floor(Math.sqrt(n));
                if(prev >= n){
                    break;
                }
            }
            while(arr[prev] < key){
                comparisons++;
                prev++;
                if(prev == Math.min(step, n)){
                    break;
                }
            }
            if(arr[prev] == key){
                System.out.print("Present ");
            }else{
                System.out.print("Not Present ");
            }
            System.out.println(comparisons);

        }
    }
*/

}
