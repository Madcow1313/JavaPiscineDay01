import java.util.UUID;

public interface TransactionList {
    void addTransaction(Transaction transaction);
    void RemoveTransaction(UUID id);
    Transaction[] toArray();
}
