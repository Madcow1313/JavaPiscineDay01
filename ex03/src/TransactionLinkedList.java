import java.util.UUID;

public class TransactionLinkedList implements TransactionList {

    private Node first;
    private Node last;
    int size = 0;
    private static class Node {
        Transaction item;
        Node next;
        Node prev;
        int size = 0;

        Node(Node prev, Node next, Transaction item){
            this.item = item;
            this.next = next;
            this.prev = prev;
        }
    }

    @Override
    public void addTransaction(Transaction transaction) {
        Node newNode = new Node(last, null, transaction);
        if (last == null) {
            first = newNode;
        }
        else {
            last.next = newNode;
        }
        last = newNode;
        size++;
    }

    @Override
    public void RemoveTransaction(UUID id) {
        Node temp = first;
        while (temp != null) {
            if (temp.item.getIdentifier().equals(id)){
                if (temp.prev == null) {
                    this.first = temp.next;
                }
                else {
                    temp.prev.next = temp.next;
                }
                if (temp.next == null) {
                    this.last = temp.prev;
                }
                else {
                    temp.next.prev = temp.prev;
                }
                size--;
                temp.prev = null;
                temp.next = null;
                temp.item = null;
                return ;

            }
            temp = temp.next;
        }
        throw new TransactionNotFoundException("Transaction " + id + " not found");
    }

    @Override
    public Transaction[] toArray() {
        if (size == 0) {
            return null;
        }
        Transaction[] transactionArray = new Transaction[size];
        Node temp = first;
        int i = 0;
        while (temp != null){
            transactionArray[i] = temp.item;
            temp = temp.next;
            i++;
        }
        return transactionArray;
    }

    public int getSize(){
        return size;
    }
}
