import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> uniques = new HashSet<>();
        for(int i=0; i<nums.length; i++) {
            if(uniques.contains(nums[i])) {
                return true;
            }
            uniques.add(nums[i]);
        }
        return false;
    }


public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements");
    n = sc.nextInt();

    int[] nums = new int[n];
    System.out.println("Enter the elements in the array");
    for(int i=0; i<n; i++) {
        nums[i] = sc.nextInt();
    }

    Solution sol = new Solution();
    boolean result = sol.containsDuplicate(nums);
    System.out.println(result);
    sc.close();
    }
}