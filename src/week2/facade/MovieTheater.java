package week2.facade;

public class MovieTheater {

    private ElectricSource electricSource;
    private Lights lights;
    private Movie movie;

    public MovieTheater() {
        this.electricSource = new ElectricSource(true);
        this.lights = new Lights();
        this.movie = new Movie();
    }

    public void startMovie(){
        if (isReady()){
            movie.startFilm();
        }
    }

    private boolean isReady() {

        if (checkElectricSource()) {

            lights.turnOffTheLights();

            if (checkLights()) {
                return true;
            } else {
                System.out.println("Lights are still on, first, turn off the lights . . .");
                return false;
            }
        } else {
            System.out.println("There is no electricity . . .");
            return false;
        }

    }

    private boolean checkElectricSource() {
        return electricSource.source;
    }


    private boolean checkLights() {
        return !lights.lights;
    }

}

