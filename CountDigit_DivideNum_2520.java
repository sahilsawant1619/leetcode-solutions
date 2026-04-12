class Solution {
    public int countDigits(int num) {
        int nums=num;
        int count=0;
        while(num>0){
            int val = num %10;
            if(nums % val==0){
                count++;
            }
            num/=10;
        }
        return count;
    }
}