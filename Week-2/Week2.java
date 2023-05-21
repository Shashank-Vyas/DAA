import java.util.*;
public class Week2{
/*  Ques 1. Given a sorted array of positive integers containing few duplicate elements, design an algorithm
    and implement it using a program to find whether the given key element is present in the array or
    not. If present, then also find the number of copies of given key. (Time Complexity = O(log n))
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
            int first = 0;
            int last = n - 1;
            int mid;
            int count = 0;
            while(first <= last){
                mid = (first + last) / 2;
                if(arr[mid] == key){
                    count++;
                    int left = mid - 1;
                    while(left >= 0 && arr[left] == key){
                        count++;
                        left--;
                    }
                    int right = mid + 1;
                    while(right < n && arr[right] == key){
                        count++;
                        right++;
                    }
                    break;
                }else if(arr[mid] < key){
                    first = mid + 1;
                }else{
                    last = mid - 1;
                }
            }
            if(count == 0){
                System.out.print("Key not Present");
            }else{
                System.out.print(key);
                System.out.print(" " + count);
            }
        }
    }
*/

/*  Ques 2. Given a sorted array of positive integers, design an algorithm and implement it using a program
    to find three indices i, j, k such that arr[i] + arr[j] = arr[k].  
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

            // Find three indices i, j, k such that arr[i] + arr[j] = arr[k]
            boolean found = false;
            for(int i = 0; i < n - 2; i++){
                int j = i + 1;
                int k = n - 1;
                while(j < k){
                    if(arr[i] + arr[j] == arr[k]){
                        found = true;
                        System.out.println(i + ", " + j + ", " + k);
                        break;
                    }else if (arr[i] + arr[j] < arr[k]){
                        j++;
                    }else{
                        k--;
                    }
                }
                if(found){
                    break;
                }
            }

            if(!found){
                System.out.println("No Sequence Found");
            }
        }
    }
*/

/*  Ques 3. Given an array of nonnegative integers, design an algorithm and a program to count the number
    of pairs of integers such that their difference is equal to a given key, K.  
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

            // Input for key K
            System.out.print("Enter the key: ");
            int K = sc.nextInt();

            // Count pairs whose difference is K
            int count = 0;
            for(int i = 0; i < n - 1; i++){
                for(int j = i + 1; j < n; j++){
                    if(Math.abs(arr[i] - arr[j]) == K){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }

}