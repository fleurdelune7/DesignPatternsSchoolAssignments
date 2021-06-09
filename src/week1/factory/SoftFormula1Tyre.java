package week1.factory;

public class SoftFormula1Tyre implements Formula1Tyre {

    private final int lifetime = 30;

    @Override
    public void lastTime() {
        System.out.println("This tyre lasts " + lifetime + " laps.");
    }

}
