package src;

public class Main_Reverse {

    public static void main(String[] args) {
        String str = "123";
        System.out.println(rev(str));
    }
        public static String rev(String ss){
        String res="";
        if( ss == null){
            throw new IllegalArgumentException("Null is not valid input");
           }

        char[] chars = ss.toCharArray();

        for( int i=chars.length-1;i>=0;i--){
            res= res+chars[i];
          //  System.out.println(chars[i]);
        }

        return res;
        }
}
