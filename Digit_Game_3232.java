class Solution {
    public boolean canAliceWin(int[] nums) {
        int Doublesum=0;
        int Singlesum=0;
        
        for(int num :nums ){
            if(num >=10){
                Doublesum+=num;
            }else{
                Singlesum+=num;
            }
        }
        return Singlesum!=Doublesum;
    }
}