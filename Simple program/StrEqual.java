public class StrEqual{
    public static void main(String args[]){
        String s1 = "hello";
        String s2 = new String("hello");

        if(s1 == s2){
            System.out.println("s1 and s2 equal");
        }
        else{
            System.out.println("s1 and s2 not qual");      // s1 and s2 not qual
        }
    }
}