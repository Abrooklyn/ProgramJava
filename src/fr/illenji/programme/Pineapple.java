package fr.illenji.programme;

public class Pineapple extends Fruit {

    public Pineapple() {
        super("ananas");
    }

    @Override
    public void taste() {
        System.out.println("l'ananas a un gout plutot acide");
    }

    @Override
    public int getSize() {
        return 2;
    }

    @Override
    public boolean hasSeed() {
        return true;
    }
}
