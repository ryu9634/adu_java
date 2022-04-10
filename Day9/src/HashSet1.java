import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> hashSet1 = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>();

        hashSet1.add("김사과");
        hashSet1.add("반하나");
        hashSet1.add("오렌지");
        System.out.println(hashSet1);
        hashSet1.add("김사과");
        System.out.println(hashSet1);

        for(String s : hashSet1){
            System.out.print(s + "  ");
        }
        System.out.println();
        System.out.println("요소의 개수 : " + hashSet1.size());

        hashSet2.add("김사과");
        hashSet2.add("반하나");
        hashSet2.add("오렌지");
        hashSet2.add("이메론");
        System.out.println(hashSet2);

        Iterator<String> iterator = hashSet2.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
    }
}
