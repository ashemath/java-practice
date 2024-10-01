public class ConvertTemp{
  // convert freedom units to celsius and back again.
  // takes either one or two arguments.

  // Helper function to convert C to F
  static double c2F(double c) {
    double F = 1.8*c + 32;
    return F;
  }
    
  // Helper function to convert F to C
  static double f2C(double f) {
    double C = (f*5 - 32*5)/9;
    return C;
  }

  static int argsc( String[] args ){
    int c = args.length;
    return c;
  }

  static String parseDegrees( String arg){
    String degrees;
    degrees = arg.substring(0,arg.length()-1);
    return degrees;
  }

  static char parseOrigin( String arg){
    char origin = arg.charAt(arg.length()-1);
    return origin;
  }

  static char sanitizeOrigin( char origin){
    if (origin == 'c' || origin == 'C'){
      return 'C';
    } else if (origin == 'f' || origin == 'F'){
      return 'F';
    } else {
      return 'Z';
    }
  }

  static String redify(String text){
    String redText = "\033[0;31m"+text+"\033[0m";
    return redText;
  }

  public static void main(String[] args) {
    char originUnit = 'Z';
    double degrees = 42;
    if (args.length == 1){
      degrees = Double.parseDouble(parseDegrees(args[0])); 
      originUnit = parseOrigin(args[0]);
    }
    else if (args.length == 2 && args[1].length()==1){
      degrees = Double.parseDouble(args[0]);
      originUnit = args[1].charAt(0);
    }

    switch (sanitizeOrigin(originUnit)) {
      case 'C':
        System.out.println(c2F(degrees)+"F");
        break;
      case 'F':
        System.out.println(f2C(degrees)+"C");
        break;
      case 'Z':
	;
      default:
        System.out.println(redify("""
        Invalid input, see examples below...
        Enter temperature with two arguments:
          convert_temp 32 f
        Enter temperature with one argument:
          convert_temp 0c
        """));
      }
    }
}
