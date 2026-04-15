class Solution {
    public int differenceOfSum(int[] nums) {
        
        int element_sum=0;
        for(int num :nums){
            element_sum+=num;
        }

        int digit_sum=0;
        for(int num :nums){
            while(num>0){
                int digit=num%10;
                num/=10;
                digit_sum+=digit;
            }        
        }

        return element_sum-digit_sum;

        
    }
}