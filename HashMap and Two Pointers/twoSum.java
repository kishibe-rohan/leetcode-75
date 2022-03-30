//Question Link: https://leetcode.com/problems/two-sum/

public int[] twoSum(int[] nums,int target){
    // result array containing the two indices
    int[] res = new int[2];

    // number-index pairs
    Map<Integer,Integer>pairs = new HashMap<>();
    
    for(int i=0;i<nums.length;i++)
    {
        int complement = target - nums[i];
        if(pairs.containsKey(complement))
        {
            res[1] = i;
            res[0] = pairs.get(complement);
        }

        pairs.put(nums[i],i);
    }

    return result;
}