public class convert_temp{
    // convert freedom units to celsius and back again.
    

    // Variable to hold C or F, the origin unit.
    byte origin_unit;

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

    // examples: 
    // convert_temp 32 F
    // 0 C

    // convert_temp 100 C
    // 212 F

    public static void main(String[] args) {
      String origin_unit;
      double degrees = Double.parseDouble(args[0]);
      origin_unit = args[1];

      switch (origin_unit) {
        case "C":
            System.out.println(c2F(degrees)+"F");
            break;
        case "c":
            System.out.println(c2F(degrees)+"F");
            break;
        case "F":
            System.out.println(f2C(degrees)+"C");
            break;
        case "f":
            System.out.println(f2C(degrees)+"C");
            break;
        default:
            System.out.println("error, see example below:\n convert_temp 32 f");

      }

    }

}
