class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1; // the lowest rate koko can eat
        int high  = 0;
    

        for(int pile: piles){
            high = Math.max(pile, high);
        }

        while(low < high){
            int k = low + (high - low)/2;

            int hours = 0;
            for(int i = 0; i < piles.length; i++){
                hours += (int) Math.ceil((double) piles[i] / k);
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
