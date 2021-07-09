package practice.ciandt.springboot.domain;

public class Hero {
    private String name;

    public Hero(String name) {
        this.name = name;
    }

    public Hero() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
