package lesson61;

public class CreditCard {
    int numberCreditCard;
    int sum;

    public CreditCard(){}

    public CreditCard(int numberCreditCard, int sum) {
        this.numberCreditCard = numberCreditCard;
        this.sum = sum;
    }
    public void plus (int sum){
        this.sum += sum;
    }
    public void minus (int sum){
        this.sum -= sum;
    }
    public void conditionCard(){
        System.out.printf("Кредитная карта %d, сумма счета составляет %d%n", this.numberCreditCard,this.sum);
    }
}
