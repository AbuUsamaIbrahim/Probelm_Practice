package practice;

public class ReverseNumber {
    int reverseNumber(int number) {
       int digit = (int)Math.log10(number);

        if (number == 0) {
            return number;
        } else {
            return (number % 10) * (int)Math.pow(10,digit) + reverseNumber(number / 10);
        }
    }

    public static void main(String[] args) {
        ReverseNumber reverseNumber = new ReverseNumber();
        System.out.println(reverseNumber.reverseNumber(1234));
    }
}
