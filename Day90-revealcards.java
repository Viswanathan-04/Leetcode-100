class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        Arrays.sort(deck);
        int ans[] = new int[n];
        ans[0] = deck[0];
        int k = 1;
        int c = 0;
        while(k<n){
            for(int i=1; i<n; i++){
                if(ans[i]==0){
                    c++;
                    if(c==2){
                        ans[i] = deck[k++];
                        c=0;
                    }
                }
            }
        }
        return ans;
    }
}
