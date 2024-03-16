public class windingconvson {
    public static void main(String[] args) {
        int intValue = 10;

       
        double doubleValue = intValue;
        System.out.println("Widening conversion from int to double: " + doubleValue);


        float floatValue = intValue;
        System.out.println("Widening conversion from int to float: " + floatValue);

       
        boolean boolValue = (intValue != 0); 
        System.out.println("Conversion to boolean: " + boolValue);

       
        String stringValue = String.valueOf(intValue);
        System.out.println("Conversion to string: " + stringValue);
    }
}
