public interface UsersList {
    void addUser(User user);
    User getUserById(Integer id);
    User getUserByIndex(int index);
    int getNumberOfUsers();
}
