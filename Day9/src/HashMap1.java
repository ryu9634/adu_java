import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("apple", "김사과");
        hashMap.put("banana", "반하나");
        hashMap.put("orange", "오렌지");
        hashMap.put("melon", "이메론");
        hashMap.put("berry", "배애리");
        System.out.println(hashMap);

        System.out.println(hashMap.get("orange"));
        System.out.println(hashMap.keySet());   // 키값만 확인
        System.out.println(hashMap.entrySet()); // key value 모두 확인

        for(String k : hashMap.keySet()){
            System.out.println("[key]: " + k + ", [value]: " + hashMap.get(k));
        }
        System.out.println();
        for(Map.Entry<String, String> entry : hashMap.entrySet()){
            System.out.println("[Key] : " + entry.getKey() + ", [value] : " + entry.getValue());
        }

        hashMap.remove("melon");
        System.out.println(hashMap);

        hashMap.replace("berry", "배리");
        System.out.println(hashMap);

        Iterator<String> keys = hashMap.keySet().iterator();
        while (keys.hasNext()){
            String key = keys.next();
            System.out.println("[key] : " + key + ", [value] : " + hashMap.get(key));
        }
    }
}
