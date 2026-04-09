public class Person {
    private String name;
    private Gender gender;
    private Person[] parents;
    private Person[] children;
    private int childCount = 0;

    public Person(String name, Gender gender, Person[] parents) {
        this.name = name;
        this.gender = gender;
        this.parents = parents;
        this.children = new Person[10];
        if (parents != null) {
            for (Person parent : parents) {
                if (parent != null) {
                    parent.addChild(this);
                }
            }
        }
    }

    public Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
        this.parents = null;
        this.children = new Person[10];
    }

    public void printTree() {
        printTree(0);
    }

    private void printTree(int level) {
        String indent = "  ".repeat(level);

        System.out.println(indent + "─ " + this);

        for (int i = 0; i < childCount; i++) {
            if (children[i] != null) {
                children[i].printTree(level + 1);
            }
        }
    }

    public Person[] getCousins() {
        if (parents == null) return new Person[0];

        Person[] cousinsTemp = new Person[100];
        int count = 0;

        for (Person parent : parents) {
            if (parent != null) {
                Person[] parentSiblings = parent.getSiblings();
                for (Person sibling : parentSiblings) {
                    if (sibling != null) {
                        // tilføj børn af denne søskende til listen
                        for (int i = 0; i < sibling.getChildCount(); i++) {
                            Person child = sibling.getChildren()[i];
                            if (child != null) {
                                cousinsTemp[count++] = child;
                            }
                        }
                    }
                }
            }
        }

        Person[] cousins = new Person[count];
        for (int i = 0; i < count; i++) {
            cousins[i] = cousinsTemp[i];
        }

        return cousins;
    }

    public Person[] getSiblings() {
        if (parents == null || parents[0] == null) {
            return new Person[0];
        }

        Person father = parents[0];
        Person[] siblingsTemp = new Person[father.getChildCount()];
        int count = 0;

        for (int i = 0; i < father.getChildCount(); i++) {
            Person child = father.getChildren()[i];
            if (child != null && child != this) {
                siblingsTemp[count++] = child;
            }
        }

        Person[] siblings = new Person[count];
        for (int i = 0; i < count; i++) {
            siblings[i] = siblingsTemp[i];
        }

        return siblings;
    }

    public Person getMaternalGrandmother() {
        if (parents != null && parents[1] != null) {
            Person mother = parents[1];
            if (mother.getParents() != null) {
                return mother.getParents()[1];
            }
        }
        return null;
    }

    public Person getMaternalGrandfather() {
        if (parents != null && parents[1] != null) {
            Person mother = parents[1];
            if (mother.getParents() != null) {
                return mother.getParents()[0];
            }
        }
        return null;
    }

    public Person getPaternalGrandmother() {
        if (parents != null && parents[0] != null) {
            Person father = parents[0];
            if (father.getParents() != null) {
                return father.getParents()[1];
            }
        }
        return null;
    }

    public Person getPaternalGrandfather() {
        if (parents != null && parents[0] != null) {
            Person father = parents[0];
            if (father.getParents() != null) {
                return father.getParents()[0];
            }
        }
        return null;
    }

    private void addChild(Person child) {
        if (childCount < children.length) {
            children[childCount++] = child;
        }
    }

    // getters
    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public Person[] getParents() {
        return parents;
    }

    public int getChildCount() {
        return childCount;
    }

    public Person[] getChildren() {
        return children;
    }
    // setters

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setParents(Person[] parents) {
        this.parents = parents;
    }

    public void setChildCount(int childCount) {
        this.childCount = childCount;
    }

    public void setChildren(Person[] children) {
        this.children = children;
    }

    @Override
    public String toString() {
        String male = "♂";
        String female = "♀";
        if (gender == Gender.MALE) {
            return String.format("%s %s", name, male);
        } else {
            return String.format("%s %s", name, female);
        }
    }
}
