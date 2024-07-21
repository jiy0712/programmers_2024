import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> player = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            player.put(players[i], i);
        }

        for (String call : callings) {
            int pos = player.get(call);
            if (pos > 0) {
                String fplayer = players[pos - 1];
                players[pos - 1] = call;
                players[pos] = fplayer;
                player.put(call, pos - 1);
                player.put(fplayer, pos);
            }
        }

        return players;
    }
}
