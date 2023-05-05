abstract class Dulces {
    private int serie;

    public Dulces(int serie) {
        this.serie = serie;
    }

    public int getSerie() {
        return serie;
    }

    public abstract String comer();
}

class Super8 extends Dulces {

    public Super8(int serie) {
        super(serie);
    }

    public String comer() {
        return "super8";
    }
}

class Snickers extends Dulces {

    public Snickers(int serie) {
        super(serie);
    }

    public String comer() {
        return "snickers";
    }

}