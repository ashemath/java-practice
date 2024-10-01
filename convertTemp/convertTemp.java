public class convertTemp{
  // convert freedom units to celsius and back again.

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

  public static char parseOrigin( String arg){
    char origin = arg.charAt(arg.length()-1);
    return origin;
  }

  // examples: 
  // convert_temp 32 F
  // 0 C

  // convert_temp 100 C
  // 212 F

  public static void main(String[] args) {
    char originUnit = 'z';
    double degrees = 42;
    if (args.length == 1){
      degrees = Double.parseDouble(parseDegrees(args[0])); 
      originUnit = parseOrigin(args[0]);
    }
    else if (args.length == 2){
      degrees = Double.parseDouble(args[0]);
      originUnit = args[1].charAt(0);
    }

    switch (originUnit) {
      case 'C':
        System.out.println(c2F(degrees)+"F");
        break;
      case 'c':
        System.out.println(c2F(degrees)+"F");
        break;
      case 'F':
        System.out.println(f2C(degrees)+"C");
        break;
      case 'f':
        System.out.println(f2C(degrees)+"C");
        break;
      default:
        System.out.println(
          """
          error, see examples below:
          convert_temp 32 f
          convert_temp 0c
          """);
      }
    }
}
