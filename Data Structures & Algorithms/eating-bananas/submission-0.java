class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Integer.MAX_VALUE;

        while(low < high){
            int k = low + (high - low)/2;
            int hours = 0;

            for(int x = 0; x<piles.length; x++){
                hours+= (piles[x] + k - 1) / k;
            }
            
            if(hours > h){
                low = k + 1;
            }
            else{
                high = k;
            }
         
        }

    return low;
        
    }
}
