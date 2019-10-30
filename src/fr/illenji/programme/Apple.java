package fr.illenji.programme;

public class Apple extends Fruit{

    public Apple() {
        super("pomme");
    }

    @Override
    public void taste() {
        System.out.println("la pomme a un gout plutot sucré");
    }

    @Override
    public int getSize() {
        return 1;
    }

    @Override
    public boolean hasSeed() {
        return true;
    }
}
