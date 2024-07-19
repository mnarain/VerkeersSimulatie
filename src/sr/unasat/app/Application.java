package sr.unasat.app;

import sr.unasat.services.VerkeersSimulatieService;

public class Application {
    public static void main(String[] args) {
        VerkeersSimulatieService verkeersSimulatieService = new VerkeersSimulatieService();
        verkeersSimulatieService.startSimulatie();
    }
}
