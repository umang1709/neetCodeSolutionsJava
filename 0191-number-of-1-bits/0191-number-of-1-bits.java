class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        for(int i=0;i<32;i++){//given in constrants 32 bit digit it would be.
            if((n&1)==1){//anding each bit with to get if its 1
                count++;
            }
            n=n>>1; // removing one bit (bit by bit) by doing right shift.
        }
        return count;
    }
}