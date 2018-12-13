
class MyLinkedList{

  private class Node{
   private int data;
   private Node next,prev;

   public Node(int datain, Node nextin, Node previn){
     data = datain;
     next = nextin;
     prev = previn;
   }

    public Node next(){
      return next;
    }
    public Node prev(){
      return prev;
    }
    void setNext(Node other){
      next = other;
    }
    void setPrev(Node other){
      prev = other;
    }
    Integer getData(){
      return data;
    }
    Integer setData(Integer i){
      data = i;
    }
    String toString(){
      return "" + data;
    }
  }

 private int size;
 private Node start,end;

 public int size(){
   return size;
 }

 public boolean add(int value){
   return false;
 }
 public String toString(){
   return "";
 }
}
