class Solution {
    public int minimumCardPickup(int[] cards) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int minCards = Integer.MAX_VALUE;
        
        for(int idx = 0; idx < cards.length; idx++){
            int card = cards[idx];
            
            if(map.containsKey(card)){
                int prevIdx = map.get(card);
                int currIdx = idx;
                
                int cardsPicked = (currIdx - prevIdx) + 1;
                minCards = Math.min(minCards, cardsPicked);
                
            }
                map.put(card, idx);            
        }
        
        return (minCards == Integer.MAX_VALUE ? -1 : minCards);
    }
}