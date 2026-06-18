public class User {
    private String username;
    private String userid;
    private Role role;

    public User(String username, String userid, Role role){
        this.username = username;
        this.userid = userid;
        this.role = role;
    }


    public String getUserid() {
        return userid;
    }

    public Role getRole(){
        return role;
    }


    public String toString(){
        return String.format("%s %s %s", username, getUserid(), role);
    }
}
