class Solution {
    public int subtractProductAndSum(int n) {
        int Product=1;
        int DigitSum=0;
        while(n>0){
            int digit=n%10;
            n/=10;

            Product=digit*Product;
            DigitSum+=digit;

            
        }
        return Product-DigitSum;
    }
}