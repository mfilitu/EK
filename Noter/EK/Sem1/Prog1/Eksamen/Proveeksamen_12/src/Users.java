import java.util.ArrayList;
import java.util.List;

public class Users {
    private List<User> userList;

    public Users(){
        this.userList = new ArrayList<>();
    }

    public void addUser(String username, Role role){
        String userid = username.substring(0,4);

        for (User user : userList){
            if (user.getUserid().equals(userid)){
                System.out.println("User with that userid exists!");
                return;
            }
        }
        userList.add(new User(username, userid, role));

    }

    public void addExistingUser(User user){

        for (User users : userList){
            if (users.getUserid().equals(user.getUserid())){
                System.out.println("User with that userid exists!");
                return;
            }
        }
        userList.add(user);

    }

    public List<User> getUsersByRole(Role role){
        List<User> roleList = new ArrayList<>();

        for (User user : userList){
            if (user.getRole() == role){
                roleList.add(user);
            }
        }
        return roleList;
    }


}
