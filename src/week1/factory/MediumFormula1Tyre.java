package week1.factory;

public class MediumFormula1Tyre implements Formula1Tyre {

    private final int lifetime = 40;

    @Override
    public void lastTime() {
        System.out.println("This tyre lasts " + lifetime + " laps.");
    }

}
