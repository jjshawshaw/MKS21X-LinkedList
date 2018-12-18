public class Driver{
  public static void main(String[]args){
    MyLinkedList L = new MyLinkedList();
    MyLinkedList m = new MyLinkedList();
    L.add(1);
    L.add(2);
    L.add(3);
    L.add(4);
    System.out.println(L);
    m.add(5);
    m.add(6);
    m.add(7);
    System.out.println(m);
    L.extend(m);
    System.out.println(L);
    System.out.println(m);
  }
}
