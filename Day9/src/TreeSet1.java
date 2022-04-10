import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(8);
        treeSet.add(20);
        treeSet.add(35);
        treeSet.add(21);
        treeSet.add(4);
        System.out.println(treeSet);
        treeSet.remove(20);
        System.out.println(treeSet);
        System.out.println(treeSet.size());
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        System.out.println(treeSet.higher(21));
        System.out.println(treeSet.lower(21));

        for (int i : treeSet){
            System.out.print(i + " ");
        }
    }
}
