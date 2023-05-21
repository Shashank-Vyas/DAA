import java.util.*;
public class Week5{
/*  Ques 1. Given an unsorted array of alphabets containing duplicate elements. Design an algorithm and
    implement it using a program to find which alphabet has maximum number of occurrences and
    print it. (Time Complexity = O(n)) (Hint: Use counting sort) 
*/
/*    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of test cases- ");
        int t = sc.nextInt();
        sc.nextLine(); 
        while(t-- > 0){
            String s = sc.nextLine();
            int[] count = new int[26];
            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                count[c - 'a']++;
            }
            int maxCount = 0;
            int maxCountIndex = 0;
            for(int i = 0; i < 26; i++){
                if(count[i] > maxCount){
                    maxCount = count[i];
                    maxCountIndex = i;
                }
            }
            char maxOccurringAlphabet = (char) (maxCountIndex + 'a');
            System.out.println("Max occurring alphabet: " + maxOccurringAlphabet + " " + maxCount);
        }
    }
*/

/*  Ques 2. Given an unsorted array of integers, design an algorithm and implement it using a program to
    find whether two elements exist such that their sum is equal to the given key element. (Time
    Complexity = O(n log n)) 
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
            System.out.print("Enter the key element: ");
            int key = sc.nextInt();
            Arrays.sort(arr);
            int left = 0, right = n - 1;
            while(left < right){
                int sum = arr[left] + arr[right];
                if(sum == key){
                    System.out.println(arr[left] + " " + arr[right]);
                    return;
                }else if(sum < key){
                    left++;
                }else{
                    right--;
                }
            }
            System.out.println("No elements found");
        }
    }
*/

/*  Ques 3. You have been given two sorted integer arrays of size m and n. Design an algorithm and
    implement it using a program to find list of elements which are common to both. (Time
    Complexity = O(m+n))
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the number of tese cases: ");
        int T = sc.nextInt();
        for(int t=1;t<=T;t++){

            System.out.print("Enter the size of test case " + t + " array 1: ");
            int m = sc.nextInt();
            int[] arr1 = new int[m];
            System.out.print("Enter the elements of array 1: ");
            for (int i = 0; i < m; i++) {
                arr1[i] = sc.nextInt();
            }
            Arrays.sort(arr1);
            
            System.out.print("Enter the test case " + t + " size of array 2: ");
            int n = sc.nextInt();
            int[] arr2 = new int[n];
            System.out.print("Enter the elements of array 2: ");
            for (int i = 0; i < n; i++) {
                arr2[i] = sc.nextInt();
            }
            Arrays.sort(arr2);
            
            int i = 0, j = 0;
            System.out.print("Common elements: ");
            while (i < m && j < n) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    i++;
                    j++;
                } else if (arr1[i] < arr2[j]) {
                    i++;
                } else {
                    j++;
                }
            }
        }
    }

}




