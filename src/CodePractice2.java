import java.util.HashMap;
import java.util.Map;

public class CodePractice2 {
    public static void main(String[] args) {
        Map<String, String> capitalMap = new HashMap<String, String>();
        capitalMap.put("USA", "Washington");
        capitalMap.put("Japan", "Tokyo");
        capitalMap.put("Thailand", "Bangkok");
        capitalMap.put("UK", "London");
        capitalMap.put("Australia", "Canberra");
        capitalMap.put("Denmark", "Copenhagen");
        capitalMap.put("Egypt", "Cairo");
        capitalMap.put("Vietnam", "Hanoi");
        capitalMap.put("Italy", "Rome");
        capitalMap.put("Brazil", "Brazilia");

        for (Map.Entry<String, String> entry : capitalMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
