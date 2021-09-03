public class Fibonacci{
    public static void main(String[] args){
        int numberOne = 0;
        int numberTwo = 1;
        int nextNumber;
        System.out.println(numberOne + "\n" + numberTwo);
        for(int i = 0; i <= 10;i++){
            System.out.println(numberOne + numberTwo);
            nextNumber = numberOne+numberTwo;
            numberOne = numberTwo;
            numberTwo = nextNumber;
        }
    }
}