public class Programmer extends Person {
    private String companyName;

    public Programmer() {
    }

    public Programmer(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public void learn() {
        System.out.println( "LEARN: it sphere");
    }

    @Override
    public void walk() {
        System.out.println("WALK: Dubay");
    }

    @Override
    public void eat() {
        System.out.println(" EAT:COFFE ");
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "companyName='" + companyName + '\'' +
                super.toString();
    }
}
