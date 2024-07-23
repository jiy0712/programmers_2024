import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] stage = new int[N + 2];

        for (int s : stages) {
            if (s <= N) {
                stage[s]++;
            }
        }

        int total = stages.length;
        List<StageFR> fr = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            if (total == 0) {
                fr.add(new StageFR(i, 0));
            } else {
                double failureRate = (double) stage[i] / total;
                fr.add(new StageFR(i, failureRate));
                total -= stage[i];
            }
        }

        Collections.sort(fr, (a, b) -> {
            if (b.failureRate == a.failureRate) {
                return Integer.compare(a.stage, b.stage);
            }
            return Double.compare(b.failureRate, a.failureRate);
        });

        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = fr.get(i).stage;
        }

        return answer;
    }
}

class StageFR {
    int stage;
    double failureRate;

    StageFR(int stage, double failureRate) {
        this.stage = stage;
        this.failureRate = failureRate;
    }
}
