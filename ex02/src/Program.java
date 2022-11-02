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
        try {
            arrayList.getUserById(123);
        }
        catch (UserNotFoundException e){}
        try {
            arrayList.getUserById(-1);
        }
        catch (UserNotFoundException e){}
        try {
            arrayList.getUserByIndex(-1);
        }
        catch (UserNotFoundException e){}
    }
}
