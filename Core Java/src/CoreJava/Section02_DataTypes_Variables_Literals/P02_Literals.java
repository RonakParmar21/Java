package CoreJava.Section02_DataTypes_Variables_Literals;

public class P02_Literals {
    public static void main(String[] args) {
        // Integer Literals
        byte b = 15;
        short s = 15;
        int i = 15;

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);

        // print 10 in all number system
        byte b1 = 10; // decimal number system
        byte b2 = 0b1010; // binary number system
        byte b3 = 012; // octal number system
        byte b4 = 0xa; // hexa decimal number system

        System.out.println("\n\n");
        System.out.println(b1 + "\n"+b2+"\n"+b3+"\n"+b4);

        long l = 125;
        System.out.println(l);

        // long l1 = 999999999999;
        // this code is generate an error: integer number too large

        // to remove this above error need literals
        long l1 = 999999999999L;
        System.out.println(l1);

        // int i1 = 125L;
        // this code is generate an error: incompatible types: possible lossy conversion from long to int
        // System.out.println(i1);


        // float f = 12.56;
        // this code is generate an error: incompatible types: possible lossy conversion from double to float
        // know that default is double so resolve this error to write float literal
        float f = 12.56f;
        double d = 12.56;
        System.out.println(f);
        System.out.println(d);


        // if value is bigger that use comma in notebook but in java comma is not allow so use underscore instead of comma
        //long l = 999,999,999;
        // this code is generate an error: <identifier> expected
        // Use underscore instead of comma
        long l10 = 999_999_999;
        // it work perfectly
        System.out.println(l10); // output is :- 999999999

        // this is not add underscore at the last
        // long l11 = 999_999_999_;
        // this generate an error: illegal underscore
        // float f11 = 123_456_._12F;
        // this is also generate an error: illegal underscore
        //System.out.println(f11);
    }
}
