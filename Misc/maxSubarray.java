//Question Link: https://leetcode.com/problems/maximum-subarray/

public int maxSubArray(int[] nums){
    int currentSum = 0;
    int maxSum = Integer.MIN_VALUE;

    //Kadane's Algorithm
    for(int i=0;i<nums.length;i++)
    {
        currentSum += nums[i];
        if(currentSum > maxSum)
        maxSum = currentSum;

        //reset subarray if sum drops below 0
        if(currentSum<0)
        currentSum = 0;
    }

    return maxSum;
}