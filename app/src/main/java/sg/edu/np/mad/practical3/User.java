package sg.edu.np.mad.practical3;

public class User {
    public String name;
    public String description;
    public int id;
    public boolean followed;


    public User(String userName, String userDescription, int userId, boolean userFollowed){
        name = userName;
        description = userDescription;
        id = userId;
        followed = userFollowed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isFollowed() {
        return followed;
    }

    public void setFollowed(boolean followed) {
        this.followed = followed;
    }
}
