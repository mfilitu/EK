public class Member {
    final String name;
    final int id;


    public Member(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String toString() {
        return String.format("%s, %s", name, id);
    }


}
