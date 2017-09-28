/*
167. Two Sum II - Input array is sorted

Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

You may assume that each input would have exactly one solution and you may not use the same element twice.

Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2
*/

public class LC167{
	// Time Complexity: O(logN)
	
	public int[] twoSum(int[] nums, int target) {
		int[] res = new int[2];
		if(nums.length < 2)
			return res;

		int left = 0, right = nums.length - 1;
		while(left < right) {
			if(nums[left] + nums[right] == target)
				return new int[]{left + 1, right + 1};
			else if (nums[left] + nums[right] < target)
				left++;
			else
				right--;
		}
		return res;
	}

	public static void main(String[] args){
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		LC167 x = new LC167();
		int[] res = x.twoSum(nums, target);
		System.out.println(res[0] + " " + res[1]);
	}
}