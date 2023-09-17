public class Main
{
    public static void main(String[] args)
    {
        //A program that starts with a credit card balance of $5000
        //Then calculates the interest at a rate of 17%
        //Assume the user does not make any payments
        //Display the interest due after one month and again after two months

        double cardBalance = 5000;
        double interestRate = 1.17;

        cardBalance = cardBalance * interestRate;
        System.out.println("Your balance due after one month is " + cardBalance);

        cardBalance = cardBalance * interestRate;
        System.out.println("Your balance due after two months is " + cardBalance);
    }
}