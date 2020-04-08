package AggregationAndComposition.BankClientAggregation;

import java.util.ArrayList;

public class BankClient {
    private String name;
    private ArrayList<BankAccount> bankAccounts;

    public BankClient(String name, int sum){
        this.name=name;
        bankAccounts=new ArrayList<BankAccount>();
        bankAccounts.add(new BankAccount(name,1,sum));
    }

    public String getName(){
        return name;
    }

    public void addAccount(int sum){
        bankAccounts.add(new BankAccount(name,bankAccounts.size()+1, sum));
    }

    public int getBalance(int id){
        for (BankAccount ba:bankAccounts
             ) {
            if(ba.getId()==id)
                return ba.getBalance();
        }
        return -1;
    }

    public String getSortedAccounts(){
        String res=new String();
        BankAccount []b=new BankAccount[bankAccounts.size()];
        for (BankAccount ba:bankAccounts
             ) {
            b[bankAccounts.indexOf(ba)]=new BankAccount(ba.getClientName(),ba.getId(),ba.getBalance());
        }
        int max;
        for(int i=0;i<b.length-1;i++){
            max=i;
            for(int j=i+1;j<b.length;j++)
                if(b[j].getBalance()>b[i].getBalance())
                    max=j;
            if(i!=max)
                swap(b,i,max);
        }
        res="Отсортированные аккаунты клиента "+name+":\n";
        for(int i=0;i<b.length;i++)
                res+="id: "+b[i].getId()+"; имя: "+b[i].getClientName()+"; сумма на счете: "+b[i].getBalance()+"; аккаунт заблокирован:"+b[i].isBlockedAccount()+"\n";
        return res;
    }

    public String getAllAccounts(){
        String res=new String();
        res="Все аккаунты клиента "+name+":\n";
        for(BankAccount b:bankAccounts)
                res+="id: "+b.getId()+"; имя: "+b.getClientName()+"; сумма на счете: "+b.getBalance()+"; аккаунт заблокирован:"+b.isBlockedAccount()+"\n";
        return res;
    }


    public int getTotalBalance(){
        int res=0;
        for (BankAccount ba:bankAccounts
             ) {
                res+=ba.getBalance();
        }
        return res;
    }

    public int getPositiveBalance(){
        int res=0;
        for (BankAccount ba:bankAccounts
        ) {
            if(ba.getBalance()>0)
                res+=ba.getBalance();
        }
        return res;
    }

    public int getNegativeBalance(){
        int res=0;
        for (BankAccount ba:bankAccounts
        ) {
            if(ba.getBalance()<0 )
                res+=ba.getBalance();
        }
        return res;
    }

    public String blockAccount(int id){
        for (BankAccount ba:bankAccounts
             ) {
            if(ba.getId()==id) {
                ba.block();
                return "Аккаунт с id="+id+"заблокирован";
            }
        }
        return "Нет аккаунта с таким id";
    }

    public String unblockAccount(int id){
        for (BankAccount ba:bankAccounts
        ) {
            if(ba.getId()==id) {
                ba.unblock();
                return "Аккаунт с id="+id+"разблокирован";
            }
        }
        return "Нет аккаунта с таким id";
    }

    private void swap(BankAccount []b,int i, int max){
        BankAccount ba=b[i];
        b[max]=b[i];
        b[max]=ba;
    }

    public String SearchAccount(int id){
        String res=new String();
        for(BankAccount b:bankAccounts)
            if(b.getId()==id){
                res+="id: "+b.getId()+"; имя: "+b.getClientName()+"; сумма на счете: "+b.getBalance()+"; аккаунт заблокирован:"+b.isBlockedAccount()+"\n";
                return res;
            }
        return "Нет аккаунта с таким id";
    }
}
