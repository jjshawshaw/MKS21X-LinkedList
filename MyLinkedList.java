
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
   String out = "[";
   while (current != null){
     out += current + "";
     if (current.next() != null) out += ", ";
     current = current.next();
   }
   out += "]";
   return out;
 }

 public Integer get(int index) {
    return getNth(index).getData();
  }

 public Integer set(int index,Integer value){
   return getNth(index).setData(value);
 }

 private Node getNth(int index){
   if (index < 0 || length < index) throw new IndexOutOfBoundsException();
   Node current = start;
    for (int i = index; i > 0; i--){
        current = current.next();
     }
  return current;
 }

 public boolean contains(Integer value){
   boolean out = false;
   Node current = start;
    for (int i = 0; i < length; i++){
        if (current.getData() == value) out = true;
        current = current.next();
     }
    return out;
 }

 int indexOf(Integer value){
   Node current = start;
    for (int i = 0; i < length; i++){
        if (current.getData() == value) return i;
        current = current.next();
     }
    return -1;
 }

 public void add(int index, Integer value){
   if (index == 0){
     Node newN = new Node(value, start, null);
     start.setPrev(newN);
     start = newN;
     length++;
   }
   else if (index == length){
     add(value);
   }
   else {
     Node oldN = getNth(index);
     Node newN = new Node(value, oldN, oldN.prev());
     oldN.prev().setNext(newN);
     oldN.setPrev(newN);
     length++;

   }
 }

 public Integer remove(int index) {
   if (index < 0 || length < index) throw new IndexOutOfBoundsException();
   if (index == 0){
     int temp = start.getData();
     start.next.setPrev(null);
     start = start.next();
     length--;
     return temp;
   }
   else if (index == length - 1){
     int temp = end.getData();
     end.prev.setNext(null);
     end = end.prev();
     length--;
     return temp;
   }
   else {
     Node n = getNth(index);
     int temp = n.getData();
     n.prev.setNext(n.next());
     n.next.setPrev(n.prev());
     length--;
     return temp;
   }
 }

 public boolean remove(Integer value){
   try {
     remove(indexOf(value));
     return true;
   }
   catch (IndexOutOfBoundsException e){
     return false;
   }
 }

   public void extend(MyLinkedList other){
      end.setNext(other.start);
      length += other.length;
      other.length = 0;
      other.start = null;
      other.end = null;
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
