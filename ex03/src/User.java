public class User {
    private Integer identifier;
    private String name;
    private Integer balance;
    private TransactionLinkedList transactions;

    public User(String name, Integer balance){
        this.identifier = UserIdsGenerator.getInstance().generateId();
        setName(name);
        if (balance > 0)
            setBalance(balance);
        else
            setBalance(0);
        transactions = new TransactionLinkedList();
    }

    public Integer getIdentifier() {
        return identifier;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        if (balance > 0){
            this.balance = balance;
        }
        else{
            this.balance = 0;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TransactionLinkedList getTransactions(){
        return transactions;
    }
}
