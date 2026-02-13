// Last updated: 13/02/2026, 11:13:44
class Solution
{
    public int majorityElement(int[] nums)
    {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
    }
}