# Brute force #
## Time Complexity ##
O(n^2) bcoz inner loop runs n times and outer loop iterates n-i times

## Space Complexity ##
O(1) => All Calculations are performed in place and no Additional data structures are used

# Kadane's #
## Time Complexity ##
O(n) bcoz it iterates through the array once maintaining current_sum and updating max_sum as needed.

## Space Complexity ##
O(1) =>No Additional data structures are used

Summary : Kadane's Algorithm is more efficient than the brute force approach in terms of time complexity,making it suitable for large inputs. Because in Kadane's code only one for loop is used which is more efficient according to time complexity while in Brute Force two loops are used.