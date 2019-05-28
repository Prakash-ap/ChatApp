package techy.ap.chatapp.Model;

public class User {
    private int id;
    private  String username;
    private String imageUri;

    public User(int id, String username, String imageUri) {
        this.id = id;
        this.username = username;
        this.imageUri = imageUri;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getImageUri() {
        return imageUri;
    }

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }
}
