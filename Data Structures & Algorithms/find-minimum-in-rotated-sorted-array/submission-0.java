class Solution {
    public int findMin(int[] nums) {
        int mid =0,left=0,right=nums.length-1;
        while(left<right){
            mid = left+(right-left)/2;
            if(nums[mid]>nums[right])
                left=  mid +1;
            else if(nums[mid]<=nums[right]){
                right=mid;
            } 
        }
        return nums[left];
    }
}
