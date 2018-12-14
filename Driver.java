public class Driver{
  public static void main(String[]args){
    MyLinkedList L = new MyLinkedList();
    System.out.println(L);
    L.add(3);
    System.out.println(L);
    L.add(4);
    System.out.println(L);
    System.out.println(L.get(1));
  }
}
