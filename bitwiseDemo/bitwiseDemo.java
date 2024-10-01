public class bitwiseDemo {
  
  public static void blank(){
    System.out.println();
  }

  public static void main( String[] args) {
    int a = 0b00000100;
    int b = 0b00000010;

    int c = a << b;
    int d = a >> b;

    System.out.println("a in binary is: " + Integer.toBinaryString(a));
    System.out.println("b in binary is: " + Integer.toBinaryString(b));
    System.out.println("a in decimal is: " + a);
    System.out.println("b in decimal is: " + b);
    System.out.println("a << b = " + c);
    System.out.println("a >> b = " + d);
    blank();

    // The largest int value is 2147483647
    // Adding a number nearly as large as this causes an overflow.
    // The overflow results in a negative number. 
    a = 2100000000;
    b = 2120000000;
    c = (a + b) >> 1;

    System.out.println("Now an example of >>> vs >>...");
    System.out.println("let a="+a+" and b="+b);
    System.out.println("a in binary is: " + Integer.toBinaryString(a));
    System.out.println("b in binary is: " + Integer.toBinaryString(b));
    System.out.println("Using >> to help average two numbers:");
    System.out.println("(a + b) >> 1 = " + c);
    c = (a + b) >>> 1;
    System.out.println("Using >>> to help average two numbers:");
    System.out.println("(a + b) >>> 1 = " + c);
    blank();

    System.out.println("Let's do more bitwise operators!");
    
    a = 127;
    b = 128;
    c = a&b;
    System.out.println("First, let's look at &");
    System.out.println("let a="+a+" and b="+b);
    System.out.println("a in binary is: 0" + Integer.toBinaryString(a));
    System.out.println("b in binary is: " + Integer.toBinaryString(b));
    System.out.println("These binary representaations have 1's in"); 
    System.out.println("different columns:"); 
    System.out.println("a&b = " + c);
    blank();

    a = 128;
    b = 255;
    c = a^b;
    System.out.println("let a="+a+" and b="+b);
    System.out.println("a in binary is: " + Integer.toBinaryString(a));
    System.out.println("b in binary is: " + Integer.toBinaryString(b));
    System.out.println("These binary representation shares a lot of 1's so...");
    System.out.println("Only the one column shares a 1, so lots for XOR");
    System.out.println("just the leftmost column isn't exlusively true...");
    System.out.println("a^b = 0"+Integer.toBinaryString(c));
    blank();
    
    c = a|b;
    System.out.println("Now, let's use the same a and b but with OR.");
    System.out.println("with OR all of the columns have atleast one 1");
    System.out.println("a|b = "+Integer.toBinaryString(c));
  }
}
