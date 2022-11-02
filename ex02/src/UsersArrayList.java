import java.util.Arrays;

public class UsersArrayList implements UsersList {
    private int capacity = 10;
    private User[] users = new User[capacity];
    private int size = 0;
    @Override
    public void addUser(User user) {
        size++;
        if (size >= capacity){
            capacity = capacity + capacity / 2;
            User[] temp = new User[capacity];
            for (int i = 0; i < users.length; i++){
                temp[i] = users[i];
            }
            users = temp;
        }
        users[size - 1] = user;
    }

    @Override
    public User getUserById(Integer id) {
        for (int i = 0; i < this.size; i++){
            if (users[i].getIdentifier() == id)
                return users[i];
        }
        throw new UserNotFoundException("User with id " + id + " not found");
    }

    @Override
    public User getUserByIndex(int index) {
        if (index > size || index < 0)
            throw new UserNotFoundException("User with index " + index + " not found");
        return users[index];
    }

    @Override
    public int getNumberOfUsers() {
        return size;
    }

    public int getCapacity(){
        return capacity;
    }
}
