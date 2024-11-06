


/**
 * Exploring Linked Lists!
 * This class is all about setting up a simple linked list. To simplify things,
 * we'll stick to strings here.
 *
 * The goal is to store multiple strings in a linked-list like structure where
 * each string holds the reference to the next string.
 *
 */

public class LinkedStrings {
	private LinkedStrings next;
	private final String word;
	public LinkedStrings(String word, LinkedStrings next) {
		this.word = word;
		this.next = next;
	}

	public LinkedStrings(String word){
		this.word = word;
		this.next = null
	}

	public append(String word){
		if (next == null){
			LinkedStrings add = new LinkedStrings(word);
		} else{
			
		}
	}

	public static void main(String[] args){
                System.out.println("Test String!!!!!");
                LinkedStrings list = new LinkedStrings("Hello", null);

        }

}


