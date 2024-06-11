public class Test5{
    public static void  main(String args[]){
        String str="hello";
        str  += "world";          // compile time error
        System.out.println(str.length);   // without + output world
    }
}