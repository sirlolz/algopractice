import java.util.Scanner;

public class Primenumbers{
    public static void main(String[] args){
        int primeornot;
        int i;
        int isprime = 0;
        Scanner number = new Scanner(System.in);

        System.out.println("please enter a number to check if it is prime or not");
        primeornot = number.nextInt();
        int halfofprimeornot = primeornot/2;

        if(primeornot == 0 || primeornot == 1){
            System.out.println(primeornot + " is not prime");
        }else{
            for(i = 2; i <= halfofprimeornot; i++){
                if(primeornot % i == 0){
                    System.out.println(primeornot + " is not a prime");
                    System.out.println(i + " is a factor of " + primeornot);
                    isprime = 1;
                    break;
                }
            }
        }
        if(isprime == 0){
            System.out.println(primeornot + " is a prime");
        }
    }
}