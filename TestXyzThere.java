
/*Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceded by a period (.). So "xxyz" counts but "x.xyz" does not.
*/
public class TestXyzThere {
    public static boolean xyzThere(String str) {
        String s=new String();
        for(int i=0;i<str.length()-2;i++){
            s=str.substring(i,i+3);
            if(s.startsWith(".")){
                i++;
                continue;
            }
            if(s.equals("xyz"))
                return true;
        }
        return false;
    }
public static void main(String [] args){
String str1="chchdsjxyz";
if(xyzThere(str1))
    System.out.println("the string contains xyz");
else
    System.out.println("the string doesnot contain xyz");
}
}
