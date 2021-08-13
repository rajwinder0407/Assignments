import java.util.Scanner;

/*Return the number of times that the string "hi" appears anywhere in the given string.*/
public class testCountHi {
    //method to count hi
    public static int countHi(String str) {
        int count=0;
        for(int i=0;i<str.length()-1;i++)
        {
            if(str.substring(i,i+2).equals("hi"))
                count++;
        }
        return count;
    }
public static void main(String [] args){
        String str;
    Scanner s= new Scanner(System.in);
    System.out.println("enter the string to check");
    str= s.nextLine();
    System.out.println("no of times hi repeats in the string is "+ countHi(str));
}
}
