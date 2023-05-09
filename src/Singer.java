public class Singer extends Person {
    private String bandName;

    public Singer(){

    }


    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    @Override
    public void learn() {
        System.out.println(" EARN: dance school");
    }

    @Override
    public void walk() {
        System.out.println("WALK: ADUKAR ");
    }

    @Override
    public void eat(){
        System.out.println("EAT: plov");
    }


    @Override
    public String toString() {
        return "Singer{" +
                "bandName='" + bandName + '\'' +
                super.toString();
    }
}
