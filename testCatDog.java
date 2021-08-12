import java.util.Scanner;

/*Return true if the string "cat" and "dog" appear the same number of times in the given string.*/
public class testCatDog {
    public static boolean catDog(String str) {
        int cCount=0;
        int dCount=0;
        String s;
        for(int i=0; i<str.length()-2;i++)
        {
            s=str.substring(i,i+3);
            if(s.equals("cat"))
                cCount=cCount+1;

            if(s.equals("dog"))
                dCount++;
        }
        if(cCount==dCount)
            return true;
        return false;
    }
public static void main(String []arg){
        Scanner s=new Scanner(System.in);
    System.out.println("enter the string to check:");
    String str=s.nextLine();
    if(catDog(str))
    System.out.println("string contain equal no of cat and dog occurrences");
    else
    System.out.println("string doesn't contain equal no cat and dog occurrences");
    }
}
