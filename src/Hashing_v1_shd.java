import java.util.HashMap;
import java.util.HashMap.*;
import java.util.Map;

public class Hashing_v1_shd {
    public static void main(String[] args) {
        //country(key),population
        HashMap<String,Integer> map = new HashMap<>();

        //insertion
        map.put("imdia", 12);
        map.put("us", 24);
        map.put("china", 56);

        System.out.println(map);

        map.put("china",120);
        System.out.println(map);

        //search
        if (map.containsKey("china")){
            System.out.println("key present");
        }else {
            System.out.println("keynot present");
       }

        //itteration
       for (Map.Entry<String,Integer>e:map.entrySet()){
           System.out.print(e.getKey());
            System.out.println(e.getValue());
        }
map.remove("china");
        System.out.println(map);

    }


    }



