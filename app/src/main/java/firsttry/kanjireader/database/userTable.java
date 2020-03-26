package firsttry.kanjireader.database;

public class userTable {

    String name;
    int id;
    String username;

    // empty constructor
    public userTable(){

    }

    // constructor
    public userTable(String name, int id, String username) {
        this.name = name;
        this.id = id;
        this.username = username;
    }

    // only sets for now, gets probably won't be necessary
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
