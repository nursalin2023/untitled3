public class Main {
    public static void main(String[] args) {
        Programmer pr = new Programmer();
        pr.setCompanyName("Directum RK");
        pr.setName("Nurzaman");
        pr.setDesignation("3D modeler");
        pr.learn();
        pr.walk();
        pr.eat();
        System.out.println(pr);
        //////////////////
        Singer nn = new Singer();
        nn.setBandName("NEVO MUSIC");
        nn.setName("joni");
        nn.setDesignation("peves");
        nn.learn();
        nn.walk();
        nn.eat();
        System.out.println(nn);
        ////////////////////////
        Dancer mm = new Dancer();
        mm.setGroupName("BEREKE");
        mm.setName("nurdolot");
        mm.setDesignation("TANSOR");
        mm.learn();
        mm.walk();
        mm.eat();
        System.out.println(mm);
    }
}