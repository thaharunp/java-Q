public class Quiz{
    public static void main(String args[]){
        String str1 = "prostack";
        String str2 = new String("prostack").intern();

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1.hashcode() == str2.hashcode());
    }
}