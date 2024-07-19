package sr.unasat.services;

import sr.unasat.models.Car;
import sr.unasat.models.Wegdek;

import java.util.List;

public class VerkeersSimulatieService {

    private final String NOORD = "Noord";
    private final String ZUID = "Zuid";
    private final String OOST = "Oost";
    private final String WEST = "West";
    private String[] verkeersLicht = {NOORD, ZUID, OOST, WEST};
    private Wegdek wegdekNoord;

    public VerkeersSimulatieService() {
        init();
    }

    public void init() {
        //data setup
        List<Car> carListNoord = List.of(
                new Car("Auto1", 2),
                new Car("Auto2", 3),
                new Car("Auto3", 4),
                new Car("Politie met sirene", 1)
        );
        wegdekNoord = new Wegdek(NOORD, carListNoord);
    }

    public void startSimulatie() {
        for (int i = 0; i < verkeersLicht.length; i++) {
            System.out.println("Verkeerslicht staat op groen voor " + verkeersLicht[i]);
            if (verkeersLicht[i].equals(wegdekNoord.getWegdekNaam())){
                List<Car> carList = wegdekNoord.getCarList();
                for (Car car : carList) {
                    System.out.println(car.getCarName() + " rijdt over het wegdek " + wegdekNoord.getWegdekNaam());
                }
            }
        }
    }
}
