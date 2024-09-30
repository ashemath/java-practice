public class convert_temp{
    // convert freedom units to celsius and back again.
    

    // Helper function to convert C to F
    public static double c2F(double c) {
      double F = 1.8*c + 32;
      return F;

    }
    
    // Helper function to convert F to C
    public static double f2C(double f) {
        double C = (f*5 - 32*5)/9;
        return C;

    }

    public static int argsc( String[] args ){
      int c = args.length;
      return c;
    }

    public static String parse_degrees( String arg){
      String degrees;
      degrees = arg.substring(0,arg.length()-1);
      return degrees;
    }

    public static char parse_origin( String arg){
        char origin = arg.charAt(arg.length()-1);
        return origin;
    }

    // examples: 
    // convert_temp 32 F
    // 0 C

    // convert_temp 100 C
    // 212 F

    public static void main(String[] args) {
      char origin_unit;
      double degrees;
      if (args.length == 1){
          degrees = Double.parseDouble(parse_degrees(args[0])); 
          origin_unit = parse_origin(args[0]);
      }
      else if (args.length == 2){
        degrees = Double.parseDouble(args[0]);
        origin_unit = args[1].charAt(0);
      } else {
        origin_unit = 'z';
        degrees = 42;
      }
      switch (origin_unit) {
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
            System.out.println("error, see example below:\n convert_temp 32 f");
            //System.out.println(parse_degrees("310f") + parse_origin("610x"));

      }

    }

}
