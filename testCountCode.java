import java.util.Scanner;

/*
Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.*/
public class testCountCode {
    public static int countCode(String str) {
        int count=0;
        String s;
        for(int i=0;i<str.length()-3;i++)
        {
            s=str.substring(i,i+4);
            if(s.startsWith("co")&&s.endsWith("e"))
                count++;
        }
        return count++;
    }
public static void main(String arg[]){
    Scanner s=new Scanner(System.in);
    System.out.println("enter the string to check:");
    String str=s.nextLine();
    System.out.println("no of times code appear in string is: "+countCode(str));
}
}
