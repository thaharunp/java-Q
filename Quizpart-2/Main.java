public class Main{
    public static void main(String []args){
        String str1 = "prostack";
        String str2 = "prostack";
        String str3 = new String("prostack");
        System.out.println(str1.equals(str2)&& str1.equals(str3));
    }
}
// compile time error