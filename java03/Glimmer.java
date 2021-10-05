package java03;

//glimmer类
class Glimmer implements Cloneable{
    private String name;
    private Guys guys;
    private Bro bro;
    private Java java;

    public Glimmer(String name, Guys guys, Bro bro, Java java) {
        this.name = name;
        this.guys = guys;
        this.bro = bro;
        this.java = java;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGuys(Guys guys) {
        this.guys = guys;
    }

    public void setBro(Bro bro) {
        this.bro = bro;
    }

    public void setJava(Java java) {
        this.java = java;
    }

    public String getName() {
        return name;
    }

    public Guys getGuys() {
        return guys;
    }

    public Bro getBro() {
        return bro;
    }

    public Java getJava() {
        return java;
    }
    public Object clone() throws CloneNotSupportedException {
        Glimmer glimmer=(Glimmer) super.clone();
        glimmer.java=(Java) this.java.clone();
        return glimmer;
    }
}

//Java类

class Java implements Cloneable{
    private String name;
    private Bro bro;

    public void setName(String name) {
        this.name = name;
    }

    public void setBro(Bro bro) {
        this.bro = bro;
    }

    public Java(String name, Bro bro) {
        this.name = name;
        this.bro = bro;
    }

    public String getName() {
        return name;
    }

    public Bro getBro() {
        return bro;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Java java=(Java) super.clone();
        java.bro=(Bro) this.bro.clone();
        return java;
    }
}

//Bro类

class Bro implements Cloneable{
    private String name;
    private Guys guy;

    public void setName(String name) {
        this.name = name;
    }

    public void setGuy(Guys guy) {
        this.guy = guy;
    }

    public Bro(String name, Guys guy) {
        this.name = name;
        this.guy = guy;
    }

    public String getName() {
        return name;
    }

    public Guys getGuy() {
        return guy;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Bro bro=(Bro) super.clone();
        bro.guy=(Guys) this.guy.clone();
        return bro;
    }
}

//Guys类

class Guys implements Cloneable{
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public Guys(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
