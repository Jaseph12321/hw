import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class CodePractice1 {
    public static void main(String[] args) {
        List<Map<String, String>> animalList = new ArrayList<Map<String, String>>();
        Map<String, String> map = new HashMap<String, String>();
        String[] habitat = {"ocean", "land", "swamp"};
        map.put("shark", "ocean");
        map.put("bear", "land");
        map.put("moose", "land");
        map.put("frog", "swamp");
        map.put("jelly fish", "ocean");
        map.put("heron", "swamp");
        map.put("whale", "ocean");

        animalList.add(map);
        //System.out.println(animalList);

        Map<String, List<String>> listMap = new HashMap<String, List<String>>();
        
        listMap.put(habitat[0], get(habitat[0], map));
        listMap.put(habitat[1], get(habitat[1], map));
        listMap.put(habitat[2], get(habitat[2], map));

        for (Map.Entry<String, List<String>> entry : listMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().stream().map(String::toString).collect(Collectors.joining(",")));
        }


    }

    public static List<String> get(String s, Map<String, String> map) {
        List<String> animalList = new ArrayList<>();
        for (Map.Entry<String, String> m : map.entrySet()) {
            if (s.equals(m.getValue())) {
                animalList.add(m.getKey());
            }
        }
        return animalList;
    }


}
