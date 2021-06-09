package week2.facade;


class ElectricSource {
    boolean source;

    public ElectricSource(boolean source) {
        this.source = source;
    }

    public boolean isThereElectricity() {
        return source;
    }
}

class Lights {
    boolean lights = true;

    public void turnOffTheLights() {
        lights = false;
    }

    public void turnOnTheLights() {
        lights = true;
    }
}

class Movie {
    public void startFilm() {
        System.out.println("Movie started !");
    }
}
