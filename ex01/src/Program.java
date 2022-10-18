public class Program {
    public static void main(String[] args){
        User[] users = new User[21];
        for (int i = 0; i < 20; i++){
            users[i] = new User("Bulat", 100);
        }
        for (int i = 0; i < users.length && users[i] != null; i++){
            System.out.println(users[i].getIdentifier());
        }
        User user = new User("Ksyusha", 150);
        System.out.println("last user id " + user.getIdentifier());
    }
}
