public class Fibonaccirecursion{
    static int numberOne = 0;
    static int numberTwo = 1;
    static int nextNumber = 0;
    static void sequence(int count){
        if(count >=1){
            nextNumber = numberOne + numberTwo;
            numberOne = numberTwo;
            numberTwo = nextNumber;
            System.out.println(nextNumber);
            sequence(count -1);
        }
    }
    public static void main(String args[]){
        System.out.println(0 + "\n" + 1);
        sequence(10);
    }
}