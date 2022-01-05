import java.util.Arrays;
import java.util.List;

public class User {
    private  String userName;
    private String firstName;
    private String lastName;
    private String contact;

    //Constructor
public User(){}

    public User(String userName, String firstName, String lastName, String contact) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contact = contact;
    }

    //Getter
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }


    public  User findUser(User userArray[],String userName){
    User user=null;
        List<User> userList = Arrays.asList(userArray);
        user = userList.stream()
                .filter(customer -> userName.equals(customer.getUserName()))
                .findAny()
                .orElse(null);

    return user;
    }
    public User findUser(User userArray[],String firstName,String lastName)
    {
        User user=null;
        List<User> userList = Arrays.asList(userArray);
        user = userList.stream()
                .filter(customer -> firstName.equals(customer.getFirstName())  && lastName.equals(customer.getLastName()))
                .findAny()
                .orElse(null);

        return user;
    }

    @Override
    public String toString() {
        return "UserDetails :" +
                "\n UserName=" + userName  +
                "\n FirstName=" + firstName +
                "\n LastName=" + lastName +
                "\n Contact=" + contact ;

    }
}
