public class City {
    private String name;
    private int population;

    public City(String name, int population){
        this.name = name;
        this.population = population;
    }

    public String getName(){
        return name;
    }

    public int getPopulation(){
        return population;
    }

    public boolean isLarge(){
        return getPopulation()>100000;
    }

    public String toString(){
        return String.format("City name: %s", getName());
    }

}
