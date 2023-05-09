public class Dancer extends Person {
    private String groupName;

    public Dancer() {
    }



    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public void learn() {
        System.out.println("learn: school for singers");
    }

    @Override
    public void walk() {
        System.out.println("");
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public String toString() {
        return "Dancer{" +
                "groupName='" + groupName + '\'' +
                super.toString();
    }
}
