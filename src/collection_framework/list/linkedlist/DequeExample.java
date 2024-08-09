package collection_framework.list.linkedlist;

import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {
    public static void main(String[] args) {
        //Deque FIFO ve LIFO mantiklarinin ikisini de uygulayabilir.

        Deque<String> nameDeque = new LinkedList<>();
        System.out.println(nameDeque);
        System.out.println("\n.add ile normal ekleme yapilir.");
        nameDeque.add("Alperen");
        System.out.println(nameDeque);
        System.out.println("\n.addFirst ile ilk indexe ekleme yapilir.");
        nameDeque.addFirst("Alex");
        System.out.println(nameDeque);
        System.out.println("\n.addLast ile son indexe ekleme yapilir.");
        nameDeque.addLast("Emine");
        System.out.println(nameDeque);
        nameDeque.add("Harun");
        System.out.println(nameDeque);
//        nameDeque.add("Mehmet");
//        nameDeque.add("Selin");
//        nameDeque.add("Mehmet Can");
        System.out.println("\n.removeFirst ile ilk indexten eleman sileriz.");
        nameDeque.removeFirst();
        System.out.println(nameDeque);

        System.out.println("\n.removeLast ile son indexten eleman sileriz.");
        nameDeque.removeLast();
        System.out.println(nameDeque);
        //Listenin sonuna ulasildiginda ( eleman kalmadiginda null doner )
        nameDeque.poll();
        //Listenin sonuna ulasildiginda ( gezecek eleman kalmadiginda NoSuchElementException hatasi firlatir)
        nameDeque.pop();

    }
}
