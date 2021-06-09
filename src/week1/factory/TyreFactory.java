package week1.factory;

public class TyreFactory {

    public Formula1Tyre createTyre(Type type) {
        switch (type){
            case SOFT:
                return new SoftFormula1Tyre();
            case MEDIUM:
                return new MediumFormula1Tyre();
            case HARD:
                return new HardFormula1Tyre();
            default:
                break;
        }
        return null;
    }
}
