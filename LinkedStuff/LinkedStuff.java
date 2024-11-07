


/**
 * LinkedStuff is a generic singly-linked list data structure
 */
public class LinkedStuff<T> {
    static int length = 1;
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
                String output = list.readStuff();
                System.out.println(output);
                System.out.println("Length is: " + length);
        }

}


