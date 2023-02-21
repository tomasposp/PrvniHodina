package Models;

public class Zlomek {
    private int citatel;
    private int jmenovatel;

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return citatel + "/" + jmenovatel;
    }
    public int getCitatel() {
        return citatel;
    }

    public int getJmenovatel() {
        return jmenovatel;
    }

    public Zlomek(int citatel, int jmenovatel) {
        this.citatel = citatel;
        this.jmenovatel = jmenovatel;
    }
}
