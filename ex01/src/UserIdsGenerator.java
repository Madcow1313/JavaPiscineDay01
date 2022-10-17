public class UserIdsGenerator {

    private static final UserIdsGenerator INSTANCE = new UserIdsGenerator();
    private Integer id = 0;
    private UserIdsGenerator(){}

    public static UserIdsGenerator getInstance() {
        return INSTANCE;
    }

    public Integer generateId(){
        id++;
        return id;
    }
}
