public class Person {
    private String name;
    private int age;

    /*public Person(String name, int age){
        this.name = name;
        this.age = age;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && name.length() > 0) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 120 && age >= 0) {
            this.age = age;
        }
    }

    public boolean isAdult() {
        if (getAge() < 18) {
            return false;
        } else {
            return true;
        }
    }

    public String toString() {
        return String.format("Name: %s, age: %d", getName(), getAge());
    }

}


