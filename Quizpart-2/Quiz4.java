public class Quiz4{
    public static void main(String[]agrs){
        StringBuffer sb1 = new StringBuffer("11111");
        StringBuffer sb2 = sb1.append(22222).reverse();
        System.out.println(sb1 == sb2);          // 2222211111
    }
}