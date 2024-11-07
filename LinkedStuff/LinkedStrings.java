


/**
 * Exploring Linked Lists!
 * This class is all about setting up a simple linked list. To simplify things,
 * we'll stick to strings here.
 *
 * The goal is to store multiple strings in a singly linked-list structure where
 * each string holds the reference to the next string.
 *
 */

public class LinkedStrings {
    static int length = 1;
	public Node head;

    static class Node {
        String word;
        Node next;

        Node(String w){
            word = w;
            next = null;
        }
        
    }

    LinkedStrings(String w){
        head = new Node(w);
    }


	public void append(LinkedStrings list, String word){
        Node new_node = new Node(word);
        if (head == null) {
            head = new_node;
        } else{
            Node last = head;
            while ( last.next != null ){
                last = last.next;
            }
            last.next = new_node;
        }
        length += 1;
    }

    public String readWords(LinkedStrings list){
        StringBuilder buffer = new StringBuilder();

        Node readHead = list.head;
        while ( readHead !=  null ){
            buffer.append( readHead.word );
            readHead = readHead.next;
            if (readHead != null ){
                buffer.append(" ");
            }
        }

        return buffer.toString();
    }

	public static void main(String[] args){
                System.out.println("Test String!!!!!");
                LinkedStrings list = new LinkedStrings("Hello");
                list.append(list,"World");
                list.append(list,"Dude");
                String output = list.readWords( list );
                System.out.println(output);
                System.out.println("Length is: " + length);
        }

}


