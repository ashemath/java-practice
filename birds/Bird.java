import java.util.*;

public class Bird {
    private static int quantity = 0;
    private String color;
    private String call;
    private int wingspan;

    
    public Bird(int myWingSpan, String myColor, String myCall) {
        //this.wingspan = myWingSpan;
        //this.color = myColor;
        //this.call = myCall;
        wingspan = myWingSpan;
        color = myColor;
        call = myCall;
        quantity += 1;
    }

    public String getCall(){
        return call;
    }

    public void squawk() {
        String sound = call;
        System.out.println(sound);
    }

    public static void main(String[] args) {
        Bird eagle = new Bird(28, "Black and White", "CAAAAAAAAAAH!");
        Bird crow = new Bird(17, "Black", "NEVERMORE!");
        System.out.println( eagle.wingspan + " " + eagle.color );
        //String sound = crow.getCall();
        System.out.println(Bird.quantity);
        crow.squawk();
        eagle.squawk();
    }

}
