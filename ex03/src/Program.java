import java.util.UUID;

public class Program {
    public static void main(String[] args){
        User bulat = new User("Bulat", 100);
        User ksyusha = new User("Ksyusha", 150);

        Transaction transaction = new Transaction(bulat, ksyusha, 50);
        if (transaction.makeTransaction()){
            bulat.getTransactions().addTransaction(transaction);
            ksyusha.getTransactions().addTransaction(transaction);
        }

        UUID temp = transaction.getIdentifier();
        transaction = new Transaction(bulat, ksyusha, 50);
        if (transaction.makeTransaction()){
            bulat.getTransactions().addTransaction(transaction);
            ksyusha.getTransactions().addTransaction(transaction);
        }

        transaction = new Transaction(bulat, ksyusha, 50);
        if (transaction.makeTransaction()){
            bulat.getTransactions().addTransaction(transaction);
            ksyusha.getTransactions().addTransaction(transaction);
        }

        transaction = new Transaction(bulat, ksyusha, 50);
        if (transaction.makeTransaction()){
            bulat.getTransactions().addTransaction(transaction);
            ksyusha.getTransactions().addTransaction(transaction);
        }
        Transaction[] transactionArray = bulat.getTransactions().toArray();
        for (int i = 0; i < transactionArray.length; i++) {
            System.out.println("Transaction UUID " + transactionArray[i].getIdentifier());
        }
        bulat.getTransactions().RemoveTransaction(temp);
        System.out.println("Transaction " + temp + " has been removed");
        transactionArray = bulat.getTransactions().toArray();
        for (int i = 0; i < transactionArray.length; i++) {
            System.out.println("Transaction UUID " + transactionArray[i].getIdentifier());
        }
        try{
            bulat.getTransactions().RemoveTransaction(temp);
        }
        catch (TransactionNotFoundException e){}

    }
}
