public abstract class Instrument {
    abstract public void play();
    private String name;
    private double price;

    public Instrument(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

