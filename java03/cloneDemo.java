package java03;

public class cloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Guys guys=new Guys("nguy");
        Bro bro=new Bro("nbro",guys);
        Java java=new Java("njava",bro);
        Glimmer glimmer1=new Glimmer("nglimmer",guys,bro,java);
        Glimmer glimmerClone=(Glimmer) glimmer1.clone();
        System.out.println(glimmer1.getJava().getBro().getGuy().getName());
        System.out.println(glimmerClone.getJava().getBro().getGuy().getName());
        glimmerClone.getJava().getBro().getGuy().setName("guyClone");
        System.out.println(glimmer1.getJava().getBro().getGuy().getName());
        System.out.println(glimmerClone.getJava().getBro().getGuy().getName());
    }
}
