
//User object, with attributes, empty constructor, parameter constructor and getter & setters
public class User {

    private String name;
    private String lastName;
    private String giveOrReceive;
    private String bloodType;

    public User() {
    }

    public User(String name, String lastName, String giveOrReceive, String bloodType) {
        this.name = name;
        this.lastName = lastName;
        this.giveOrReceive = giveOrReceive;
        this.bloodType = bloodType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGiveOrReceive() {
        return giveOrReceive;
    }

    public void setGiveOrReceive(String giveOrReceive) {
        this.giveOrReceive = giveOrReceive;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }
}
