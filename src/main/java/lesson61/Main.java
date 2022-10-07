package lesson61;

import lesson61.CreditCard;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCard1 = new CreditCard(10001, 500);
        CreditCard creditCard2 = new CreditCard(20002, 800);
        CreditCard creditCard3 = new CreditCard(30003, 1500);

        creditCard1.plus(550);
        creditCard1.conditionCard();
        creditCard2.plus(1500);
        creditCard2.conditionCard();
        creditCard3.minus(1000);
        creditCard3.conditionCard();

    }

}