public class Product implements Filterable{
    private String name;
    private String description;

    public Product(String name, String description){
        this.name = name;
        this.description = description;
    }

    public boolean matches(String keyword){
        if (name.toLowerCase().contains(keyword) || description.toLowerCase().contains(keyword)){
            return true;
        } else return false;
    }

    public String toString(){
        return String.format("name: %s, desctiption: %s\n", name, description);
    }
}
