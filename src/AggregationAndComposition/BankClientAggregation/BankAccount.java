package AggregationAndComposition.BankClientAggregation;

public class BankAccount {
    private String clientName;
    private int id;
    private int balance;
    private boolean isBlocked;

    public BankAccount(String clientName,int id, int balance){
        this.clientName=clientName;
        this.id=id;
        this.balance = balance;
        isBlocked=false;
    }

    public int getId(){
        return id;
    }

    public int getBalance(){
        return balance;
    }

    public String getClientName(){
        return clientName;
    }

    public void block(){
        isBlocked=true;
    }

    public void unblock(){
        isBlocked=false;
    }

    public boolean isBlockedAccount(){
        return isBlocked;
    }
}
