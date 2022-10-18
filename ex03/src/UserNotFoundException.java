public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String s) {
        System.err.println(s);
    }
}
