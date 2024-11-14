/**
 * LinkedStuff is a generic singly-linked list data structure
 */
public class LinkedStuff<T> {
    public Integer length = 1;
    public Node<T> head;

    static class Node<T>{
        T data;
        Node<T> next;

        Node(T d){
            data = d;
            next = null;
        }    
    }
    
    /**
     * LinkedStuff Constructor
     * @param d     T   Data to be stored in this structure.
     */
    public LinkedStuff(T d){
        head = new Node<T>(d);
    }

    public LinkedStuff<T> copy() {
        return this.first(this.length);
    }

    /**
     * step
     * return a sub-list with the first n linked data nodes.
     * @param int   n   The number of levels to decend through the list.
     */
    public LinkedStuff<T> first(int n) {
        if ( n <= 0 ){
            return null;
        }
        LinkedStuff<T> sub = new LinkedStuff<T>(head.data);
        int new_length = 1;
        sub.length = new_length;
        Node<T> index = this.head;
        while( n > 1 ){
            index = index.next;
            sub.append(index.data);
            new_length++;
            n--;
        }
        sub.length = new_length;
        return sub;
    }

    /**
     * head
     * recall the data stored at the head of the list
     * @param   none
     */
    public T head(){
        T item = null;
        if (head.data != null){
            item = head.data;
        }
        return item;
    }

    public void insert(int n, T d){
        Node<T> new_node = new Node<T>(d);
        Node<T> index = this.head;
        Node<T> before = null;
        Node<T> after = null;
        if ( n==0 ){
            prepend(d);
        } else {
            while ( n != 0 && index.next != null ){
                before = index;
                after = index.next;
                index = index.next;
                n--;
            }
            before.next = new_node;
            new_node.next = after;
            length++;
        }
    }

    /**
     * Prepend
     * Add a new string to the beginning of the list.
     */
    public void prepend(T d){
         Node<T> new_node = new Node<T>(d);
         Node<T> after = head;
         head = new_node;
         head.next = after;
         length++;
     }

    /**
     * append:
     * Add another unit of data to the end of the linked list.
     * @param data  T   unit of data to be stored.
     */
    public void append(T data){
        Node<T> new_node = new Node<T>(data);
        if (head == null) {
            head = new_node;
        } else{
            Node<T> last = head;
            while ( last.next != null ){
                last = last.next;
            }
            last.next = new_node;
        }
        length += 1;
    }

    /**
     * readStuff: Call toString() on the linked lists contents and
     * print to console each piece of data separated by spaces.
     * @return  String
     */
    public String readStuff(){
        StringBuilder buffer = new StringBuilder();

        Node<T> readHead = this.head;
        while ( readHead !=  null ){
            buffer.append( readHead.data.toString() );
            readHead = readHead.next;
            if (readHead != null ){
                buffer.append(" ");
            }
        }
        return buffer.toString();
    }

    public static void main(String[] args){
        LinkedStuff<Double> list = new LinkedStuff<Double>(0.5);
        list.append(0.4);
        list.append(2.45);
        list.prepend(3.14);

        LinkedStuff<Double >list2 = list.copy();
        //LinkedStuff<Double> list2 = list.first(4);
        String output = list.readStuff();
        System.out.println(output);
        System.out.println("Length is: " + list.length);
        String output2 = list2.readStuff();
        System.out.println("list2 AKA copy of list:\n" + output2);
        System.out.println("Length of list2 is: " + list2.length );

        //LinkedStuff<Double> list3 = list2.copy();
        list2.insert(2, .666);
        String output3 = list2.readStuff();
        System.out.println("list2 after data insert:\n" + output3);
        System.out.println("list2 length after insert is: " + list2.length );
        LinkedStuff<Double> list3 = list2.copy();
        list3.insert(3, 42.42);
        String output4 = list3.readStuff();
        System.out.println("after copy and insert\n" + output4);
        System.out.println("length for list3: " + list3.length);
    }

}


