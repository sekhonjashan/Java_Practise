package src;
/*
Write a Java program to check if the given number is a prime number.

 */
public class main_primeNumberCheck {

    public static void main (String[] args){
        String flag1 = "True";
        int test = 191;


            if(test==0 || test ==1) System.out.println("false");

            if(test>=2)
            {

                for(int i=2; i<=test/2; i++){

                    if(test % i == 0){
                        flag1="False";
                        System.out.println("False");
                        return;
                    }

                }
                if(flag1.matches("True")) System.out.println("True");
            }
    }
}
