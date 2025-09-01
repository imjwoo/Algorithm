import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < players.length; i++){
            map.put(players[i], i);
        }
        
        for(String chr : callings){
            int idx = map.get(chr);
            map.put(players[idx - 1], idx);
            map.put(chr, idx - 1);
            players[idx] = players[idx - 1];
            players[idx - 1] = chr;
        }
        
        return players;
    }
}