
class MyLinkedList{
  //Fields
 private int length;
 private Node start,end;

 //Constructor
 public MyLinkedList(){
   length = 0;
   start = null;
   end = null;
 }

 //Complete methods
 public int size(){
   return length;
 }

 public boolean add(int value){
   if (length == 0){
     end = new Node(value, null, null);
     start = end;
     length++;
   }
   else {
     Node temp = new Node(value, null, end);
     end.setNext(temp);
     end = temp;
     length++;
   }
   return true;
 }

 public String toString(){
   Node current = start;
   String out = "";
   while (current != null){
     out += current + " ";
     current = current.next();
   }
   return out;
 }

 public Integer get(int index) {
    return getNth(index).getData();
  }

 public Integer set(int index,Integer value){
   return getNth(index).setData(value);
 }

 private Node getNth(int index){
   Node current = start;
    for (int i = index; i > 0; i--){
        current = current.next();
     }
  return current;
 }

 //Incomplete methods
 public boolean contains(Integer value){
   boolean out = false;
   Node current = start;
    for (int i = 0; i < length; i++){
        if (current.getData() == value) out = true;
        current = current.next();
     }
    return out;
 }
 
 public void add(int index,Integer value){
 }
 public boolean remove(int index) {
   return false;
 }
 public boolean remove(Integer value){
   return false;
 }

 //Node class
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
   public void setNext(Node other){
     next = other;
   }
   public void setPrev(Node other){
     prev = other;
   }
   public Integer getData(){
     return data;
   }
   public Integer setData(Integer i){
     int temp = data;
     data = i;
     return temp;
   }
   public String toString(){
     return "" + data;
   }
 }

}
