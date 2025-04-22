package CoreJava.Section02_DataTypes_Variables_Literals;

public class P03_Unicode {
    public static void main(String[] args) {
        char c = 0X03C8;
        System.out.println(c);

        for(char a = 0x0370; a<= 0x03ff;a++) {
            System.out.println(a);
        }

        for(char b = 0X0900; b<= 0X0970;b++) {
            System.out.println(b);
        }
    }
}
