/**
1.两个数之和
https://leetcode-cn.com/

给定一个整数数组nums和一个目标值target，请在该数组中找出和为目标值的那两个整数，并
返回他们的数组下标。
你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。

示例:

给定 nums = [2, 7, 11, 15], target = 9

因为 nums[0] + nums[1] = 2 + 7 = 9
所以返回 [0, 1]
**/


class Solution {
  public int[] twoSum(int[] nums, int target) {
    int[] indexs = new int[2];
    HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
    
    for(int i = 0; i < nums.length; i++) {
      if(hash.containsKey(nums[i])) {
        indexs[0] = i; 
        indexs[1] = hash.get(nums[i]);
        return indexs;
      } 
      hash.put(target - nums[i], i);
    }
    return indexs;
  }
}
