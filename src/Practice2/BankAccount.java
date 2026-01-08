package Practice2;

public class BankAccount {
    private int dollars = 0;

//    public void addMoney(int dollars){
//        this.dollars += dollars;
//    //"this.dollars" is the dollars from 4th row. The "dollars" after the '+=' is the dollars in arguments of addMoney method
//    }
    BankAccount(){};

    BankAccount(int cents){
        this.cents = cents;
    }
    private int cents = 0;

    public void addMoney(int dollars) {
        cents = dollars*100;
    }
    //We could do like this. In this case we dont need "this" operator, bcs variable in field (cents) is not same as
    //variable in argument (int dollars). We say: "There iss nothing to differentiate"



    //but if method has not only cents, but dollars, like:
    public void addMoney(int dollars, int cents) {
        this.cents += dollars*100 + cents; //Here we need to differentiate by "this".
    }

    public double getBalance(){
        return cents / 100.0;
    }

    @Override
    public String toString() {
        return "bank account: " + getBalance();
    }
}


