import java.util.Scanner;
public class exercise1 {
    public static void main(String[] args) {
        /*Program to Calculate percentage 
        of a given student in CBSE exam.MArks from 5 subject(take input)
    MArks out of 100*/
    System.out.println("To calculate the CBSE board Percentage");
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter marks of Sub 1:");
    int a1=sc.nextInt();
    System.out.println("Enter marks of Sub 2:");
    int a2=sc.nextInt();
    System.out.println("Enter marks of Sub 3:");
    int a3=sc.nextInt();
    System.out.println("Enter marks of Sub 4:");
    int a4=sc.nextInt();
    System.out.println("Enter marks of Sub 5:");
    int a5=sc.nextInt();
    int so=(a1+a2+a3+a4+a5)*100/500;
    System.out.println(so);
    
    /*System.out.println("Percentage Obtained=");
    System.out.println(per);
    */
    
    }
    
}
