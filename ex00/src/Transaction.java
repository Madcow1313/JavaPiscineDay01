import java.util.UUID;

public class Transaction {
    private final UUID identifier;
    private User recipient;
    private User sender;
    private Category transferCategory;
    private Integer transferAmount;

    enum Category{
        DEBIT, CREDIT;
    }

    public Transaction(User sender, User recipient, Integer transferAmount){
        identifier = UUID.randomUUID();
        setRecipient(recipient);
        setSender(sender);
        if (transferAmount > 0)
            setTransferCategory(Category.CREDIT);
        else
            setTransferCategory(Category.DEBIT);
        setTransferAmount(transferAmount);
    }

    public Integer getTransferAmount() {
        return transferAmount;
    }

    public void setRecipient(User recipient) {
        this.recipient = recipient;
    }

    public User getRecipient() {
        return recipient;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getSender() {
        return sender;
    }

    public UUID getIdentifier() {
        return identifier;
    }

    public void setTransferCategory(Category transferCategory) {
        this.transferCategory = transferCategory;
    }

    public Category getTransferCategory() {
        return transferCategory;
    }

    public void setTransferAmount(Integer transferAmount) {
        if ((getTransferCategory() == Category.DEBIT) && (getSender().getBalance() < transferAmount)){
            this.transferAmount = 0;
        }
        else if (getTransferCategory() == Category.CREDIT && (getRecipient().getBalance() < transferAmount)){
            this.transferAmount = 0;
        }
        else{
            this.transferAmount = transferAmount;
        }
    }

    public void makeTransaction(){
        if (this.getTransferAmount() != 0){
            this.getSender().setBalance(this.getSender().getBalance() + this.getTransferAmount());
            this.getRecipient().setBalance(this.getRecipient().getBalance() - this.getTransferAmount());
            System.out.println("Transaction " + this.getIdentifier() + " has been made. New balance: " +
                    this.getSender().getName() + " " + this.getSender().getBalance() + "; " +
                    this.getRecipient().getName() + " " + this.getRecipient().getBalance());
        }
        else{
            System.err.println("Error! Couldn't provide transaction.");
        }
    }
}
