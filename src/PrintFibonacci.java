package src;

/*
    Write a Java program to print a Fibonacci sequence using recursion.

    //I did write it with legacy way then did with a recursive way

 */
public class PrintFibonacci {

    public static void main(String[] args){
        printFibonacciSeq(10);

        System.out.println("recursive seq is ");
        for(int x = 0;x<10;x++){

            System.out.print(printFibonacciSeqRecursive(x )+ ", ");
        }
    }

    private static int printFibonacciSeqRecursive(int i) {

        if(i <= 1) return i;

        else{
            return printFibonacciSeqRecursive(i-1) + printFibonacciSeqRecursive(i-2);
        }

    }

    public static void printFibonacciSeq(int i){

        int a=0;
        int b=1;
        int c=1;
        if(i == 0){
            System.out.print(a);
        }
        if(i == 1){
            System.out.print(b);
        }

        if(i>=2){
            System.out.print(a+", "+b+", "+c);
            for(int x=2;x<=i-2;x++){
                a=b;
                b=c;
                c=a+b;
                System.out.print(", "+c);
            }
        }

        System.out.println();

    }
}
