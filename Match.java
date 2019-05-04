package Chapter14Section1;

public class Match {
     public static void main(String[] args) {
         String s = "program";
         String t1 = "ogr";
         String t2 = "grammy";
         System.out.println(contains(s, t1 ));
         System.out.println(contains(s, t2));

     }

     public static boolean contains(String mainString, String subString){
         char[] mainArray = mainString.toCharArray();
         char[] subArray = subString.toCharArray();

         if(mainString.contains(subString)) {
             return true;
         }else{
             return false;
         }
     }
}
