public class Program {
    public static void main(String[] args){
        UsersArrayList arrayList = new UsersArrayList();
        for (int i = 0; i < 20; i++){
            User user = new User("Bulat" + i, 100 + i);
            arrayList.addUser(user);
            System.out.println(arrayList.getCapacity());
        }
        System.out.println("balance of user[19] is " + arrayList.getUserByIndex(19).getBalance());
        System.out.println("number of users is " + arrayList.getNumberOfUsers());
        arrayList.getUserById(123);
        arrayList.getUserByIndex(-1);
    }
}
