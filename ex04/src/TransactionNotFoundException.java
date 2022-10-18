public class TransactionNotFoundException extends RuntimeException{
    public TransactionNotFoundException(String s) {
        System.err.println(s);
    }
}
