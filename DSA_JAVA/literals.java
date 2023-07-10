import java.util.Scanner;
public class literals {
    public static void main(String[] args){
        byte age = 34;
        char ch = 'A';//char literal
        float f1 =5.6f;//float literal
        double d1=4.66D;//double literal
        long ageDino=56666666666666L;
        short age3=87;
        boolean a=true;
        String str="Harry";//String literal
        //System.out.println(str);

        // Taking INPUT

        /*System.out.println("It works!");//sout for easy access
        Scanner sc = new Scanner(System.in);//Reads from the keyboard
        System.out.println("Enter number 1");
        int ab=sc.nextInt();
        System.out.println("Enter number 2");

        int b=sc.nextInt();//Method to read from the keyboard
        int sum=ab+b;
        
        System.out.println("sum of the number is ");
        
        System.out.println(sum);
        
        float f2=sc.nextFloat();
        System.out.println(f2);
       
        
        boolean b1=sc.hasNextInt();
        System.out.println(b1);*/
        //Checks whether the datatype is int or not
        Scanner sc=new Scanner(System.in);
        //String str23=sc.next();//reads only one word,not displays word after space
        
        String str23=sc.nextLine();//reads the whole text.
        System.out.println(str23);


    }


}
