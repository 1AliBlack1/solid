package homework;

public class Persister implements Savable{
    private final User user;

    public Persister(User user){
        this.user = user;
    }

    @Override
    public void save(User user) {
        System.out.println("Save user: " + user.getName());
    }
}
