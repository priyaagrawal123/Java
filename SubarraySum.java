public class SubarraySum {
    // Kadane's Algorithm
    public static int kadanes(int[] nums) {
        int max_sum = nums[0];             //at first,initialize maximum sum as first elment of array
        int current_sum = nums[0];       //at first,initialize current sum as first element of array
        for (int i = 1; i < nums.length; i++) { 
            //start iterating from second element ,bcoz first is already initialized
            current_sum = Math.max(nums[i], current_sum + nums[i]); 
            max_sum = Math.max(max_sum, current_sum);  //compare max_sum with current_sum ,if max_sum is greater then current_sum then declare it as max_sum for the array 
        }
        return max_sum;
    }
    // Brute Force Approach
    public static int bruteForce(int[] nums) {
        int max_sum = Integer.MIN_VALUE;      //initialize with smallest possible value 
        for (int i = 0; i < nums.length; i++) { //this outer loop start from first element of array
            int current_sum = 0;                  //at first,initialize current sum as 0
            for (int j = i; j < nums.length; j++) { //this inner loop starts summing elements
                current_sum += nums[j];               //add elements to the cuurent sum
                max_sum = Math.max(max_sum, current_sum); //check which subarray has maximum sum
            }
        }
        return max_sum;    //return the maximum sum
    }


    // Test Cases
    public static void runTests() {  //this function is used to test cases
        int[][] testCases = {
            { -2, 1, -3, 4, -1, 2, 1, -5, 4 }, // Expected output: 6
            { 1 },                             // Expected output: 1
        };

        int[] expectedResults = { 6, 1 };

        System.out.println("Running Test Cases...");

        for (int i = 0; i < testCases.length; i++) {
            int[] testCase = testCases[i];
            int expected = expectedResults[i];

            // Validate Brute Force
            int bruteForceResult = bruteForce(testCase);
            if (bruteForceResult != expected) {  //if it doesnt meet expected output then it will give error
                System.err.println("Test case " + (i + 1) + " failed (Brute Force). Expected: " 
                                   + expected + ", Got: " + bruteForceResult);
            } else {
                System.out.println("Test case " + (i + 1) + " passed (Brute Force).");
            }

            // Validate Kadane's Algorithm
            int kadaneResult = kadanes(testCase);
            if (kadaneResult != expected) {     ////if it doesnt meet expected output then it will give error
                System.err.println("Test case " + (i + 1) + " failed (Kadane's). Expected: " 
                                   + expected + ", Got: " + kadaneResult);
            } else {
                System.out.println("Test case " + (i + 1) + " passed (Kadane's).");
            }
        }
    }

    public static void main(String[] args) {
        runTests();
        int[] nums1 = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int[] nums2 = { 1 };

        System.out.println("Maximum subarray sum of input array nums1 using 'Brute Force' is: " + bruteForce(nums1));
        System.out.println("Maximum subarray sum of input array nums2 using 'Brute Force' is: " + bruteForce(nums2));

        System.out.println("Maximum subarray sum of input array nums1 using 'Kadane's' is: " + kadanes(nums1));
        System.out.println("Maximum subarray sum of input array nums2 using 'Kadane's' is: " + kadanes(nums2));
    }
}
