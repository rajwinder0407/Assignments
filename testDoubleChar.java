import java.util.Scanner;

public class testDoubleChar {
    public static void main(String[] arg) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the string");
        String str = s.nextLine();
        System.out.println("the result string is:" + doubleChar(str));
    }

    public static String doubleChar(String str) {
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            s = s + str.substring(i, i + 1) + str.substring(i, i + 1);
        }
        return s;
    }
}