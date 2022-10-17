
public class Program {
    public static void main(String[] args){
        User userOne = new User(0, "Bulat", 550);
        User userTwo = new User(1, "Ksyusha", 50);

        Transaction transaction = new Transaction(userOne, userTwo, -100);
        transaction.makeTransaction();

        Transaction transaction2 = new Transaction(userOne, userTwo, -100);
        transaction2.makeTransaction();

        Transaction transaction3 = new Transaction(userOne, userTwo, 100);
        transaction3.makeTransaction();

        Transaction transaction4 = new Transaction(userOne, userTwo, 100);
        transaction4.makeTransaction();

        Transaction transaction5 = new Transaction(userOne, userTwo, 100);
        transaction5.makeTransaction();
    }
}
