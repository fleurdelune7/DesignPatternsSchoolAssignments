package week1.factory;

public class HardFormula1Tyre implements Formula1Tyre {

    private final int lifetime = 50;

    @Override
    public void lastTime() {
        System.out.println("This tyre lasts " + lifetime + " laps.");
    }
}
