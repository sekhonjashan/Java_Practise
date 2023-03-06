package src;
/*
Write a Java program to check if a vowel is present in a string

Also , to count total number of vowels and at what positions are they present

 */
public class main_vowelCheck {

    public static  void main (String[] args) {

        String S1 = "This is a random string to check";
        String S2 = "This is to count total number of vowels and at what positions are they present";

        System.out.println(checkV(S1));

        countPosition(S1);

    }
        public static boolean checkV(String input){
            return input.toLowerCase().matches(".*[aeiou].*");
        }

    public static void countPosition(String input){

        int finalcounter = 0;

        for(int i=0;i<input.length();i++){

            if(input.charAt(i)=='a'|| input.charAt(i)=='e'||input.charAt(i)=='i'||input.charAt(i)=='o'||input.charAt(i)=='u'){
                finalcounter++;

                System.out.println("vowel " + input.charAt(i) + " is present at the position "+ i);
            }
        }
        System.out.println("Total number of vowels are " + finalcounter);
    }
}
