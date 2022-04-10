import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(80);
        arrayList.add(100);
        arrayList.add(65);
        arrayList.add(90);
        arrayList.add(55);
        System.out.println(arrayList);

        for(int i=0; i<arrayList.size(); i++){
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();
        arrayList.remove(2);
        System.out.println(arrayList);

        arrayList.set(0, 60);
        System.out.println(arrayList);

        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()){ // [80, 100, 90, 55]
            System.out.print(iterator.next() + " ");
        }
    }
}
