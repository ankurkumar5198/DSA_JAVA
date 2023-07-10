import java.util.ArrayList;
import java.util.*;



public class sieve_algo {
    public static void main(String[] args) {
        //Simple Sieve , Segmented Sieve, Incremental Sieve.
        void sieve(int n){
            boolean prime[]=new boolean[n+1];
            for(int i=0;i<=n;i++){
                prime[i]=true;
            

            }
            for(int p=2;p*p<=n;p++){
                if(prime[p]==true){
                    for(int i =p*p; i<=n;i+=p){
                        prime[i]=false;

                    }
                }
            }

            for (int i = 2; i <= n; i++) {
            if (prime[i] == true)
                System.out.print(i + " ");
            }

    }

    {
        int n = 30;
        System.out.print("Following are the prime numbers ");
        System.out.println("smaller than or equal to " + n);
        sieve g = new sieve();
        g.sieve(n);
    }
    
}
