package CoreJava.Section02_DataTypes_Variables_Literals;

public class P01_Variables {
    public static void main(String[] args) {
        //byte b;
        //System.out.println(b);  This is generate an error because it is only declare not initialized
        // error message is :- error: variable b might not have been initialized

        // now initialize this variable
        byte b = 5;
        // Declaration Part is :- byte b
        // Initialization Part is :- 5
        System.out.println(b);

        // change value of variable at runtime
        b = 105;
        System.out.println(b);


        // THIS CODE IS GENERATE AN ERROR :- error: incompatible types: possible lossy conversion from int to byte
        // b = 130;
        // System.out.println(b);

        short s = 300;
        int i = 1000;
        float f = 25.36f;
        char c = 'a';

        System.out.println("\n\n ------------------------------------------------------------------------------------------------------- ");

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(f);
        System.out.println(c);
    }
}
