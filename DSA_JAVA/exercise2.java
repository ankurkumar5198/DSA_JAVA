import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your Name");
        // String nameo=sc.next();
        // System.out.println("Hello!"+nameo+",have a good day");//for writing the
        // variable with characters we use '+' as in ',' in C++

        System.out.println("Enter the data in km");
        int kil = sc.nextInt();
        double miles = kil / 1.609;

        System.out.println("Conversion of " + kil + "km = " + miles + " miles");// CONVERSION FROM MILES TO KM

    }
}
