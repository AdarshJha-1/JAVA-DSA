import java.util.ArrayList;

public class ArraysListEx {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10); // size is fixed internally, when list fill by some particular amount it will create a new arraylist approx 2x of size and add all ele in new arraylist and delete old arraylist.
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        System.out.println(list);

        list.addFirst(9);
        list.addFirst(8);
        list.addFirst(7);
        list.addFirst(6);
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        System.out.println(list);

        list.addLast(16);
        list.addLast(17);
        list.addLast(18);
        list.addLast(19);
        list.addLast(20);
        System.out.println(list);

        System.out.println(list.contains(7));

        list.set(2, 99);
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        list.clear();
        System.out.println(list);
    }
}
