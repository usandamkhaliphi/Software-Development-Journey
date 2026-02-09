import java.util.*;
class LinkedListDemo {
public static void main(String args[]) {
// create a linked list
LinkedList myLlist = new LinkedList();
// add elements to the linked list
myLlist.add(65);
myLlist.add(44);
myLlist.addLast(57);
myLlist.addFirst(92);
myLlist.add(3, 52);
System.out.println("Original contents ofmyList: " + myLlist);
// remove elements from the linked list
myLlist.remove(2);
System.out.println("Contents ofmyList after deletion: " + myLlist);
// remove first and last elements
myLlist.removeFirst();
myLlist.removeLast();
System.out.println("List after deleting first and last: " + myLlist);
// get and set a value
Object val = myLlist.get(1);
myLlist.set(1, 34);
System.out.println("List after change: " + myLlist);
}
}
// output is (65,34)
