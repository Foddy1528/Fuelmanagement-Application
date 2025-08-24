package application;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import java.util.HashMap;
import java.util.Map;

public class Page3Controller {

    @FXML
    private ComboBox<String> carModelComboBox;

    @FXML
    private ComboBox<String> fuelTypeComboBox;

    @FXML
    private Label fuelCapacityLabel;

    @FXML
    private Label fuelPriceLabel;

    // Example fuel capacities (litres) for different cars
    private Map<String, Double> fuelConsumptionMap = new HashMap<>();
    private Map<String, Double> fuelTankCapacityMap = new HashMap<>();

    @FXML
    public void initialize() {
        // Fill car models
        carModelComboBox.getItems().addAll(
                "BMW 7 Series 740Li",
                "BMW 7 Series 730Ld",
                "BMW 7 Series 740Li M Sport",
                "BMW 7 Series 730Ld M Sport",
                "BMW 7 Series 745Le xDrive",
                "BMW 7 Series 745Le xDrive M Sport",
                "BMW 7 Series 740Li Individual",
                "BMW 7 Series 730Ld Individual",
                "BMW 7 Series 745Le xDrive Individual",
                "BMW 7 Series 750Li xDrive",
                "BMW 7 Series 750Li xDrive M Sport",
                "BMW 7 Series 750Li xDrive Individual",
                "BMW 7 Series M760Li xDrive",
                "BMW 7 Series M760Li xDrive V12 Excellence",
                "BMW 7 Series M760Li xDrive V12 Individual",
                "Toyota Corolla 1.3 Esteem",
                "Toyota Corolla 1.6 Esteem",
                "Toyota Corolla 1.3 Prestige",
                "Toyota Corolla 1.4D-4D Esteem",
                "Toyota Corolla 1.6 Prestige",
                "Toyota Corolla 1.4D-4D Prestige",
                "Toyota Corolla 1.8 Prestige",
                "Toyota Corolla 1.6 Prestige auto",
                "Toyota Corolla 1.6 Prestige+ auto",
                "Toyota Corolla hatch 1.2T XS",
                "Toyota Corolla hatch 1.2T XS auto",
                "Toyota Corolla 1.8 Exclusive",
                "Toyota Corolla hatch 1.2T XR",
                "Toyota Corolla 1.8 Exclusive auto"
        );

        // Fuel type options
        fuelTypeComboBox.getItems().addAll("Petrol", "Diesel");

        // Fuel consumption mapping
        fuelConsumptionMap.put("BMW 7 Series 740Li", 7.9);
        fuelConsumptionMap.put("BMW 7 Series 730Ld", 5.7);
        fuelConsumptionMap.put("BMW 7 Series 740Li M Sport", 7.9);
        fuelConsumptionMap.put("BMW 7 Series 730Ld M Sport", 5.7);
        fuelConsumptionMap.put("BMW 7 Series 745Le xDrive", 2.8);
        fuelConsumptionMap.put("BMW 7 Series 745Le xDrive M Sport", 2.8);
        fuelConsumptionMap.put("BMW 7 Series 740Li Individual", 7.9);
        fuelConsumptionMap.put("BMW 7 Series 730Ld Individual", 5.7);
        fuelConsumptionMap.put("BMW 7 Series 745Le xDrive Individual", 2.8);
        fuelConsumptionMap.put("BMW 7 Series 750Li xDrive", 10.2);
        fuelConsumptionMap.put("BMW 7 Series 750Li xDrive M Sport", 10.2);
        fuelConsumptionMap.put("BMW 7 Series 750Li xDrive Individual", 10.2);
        fuelConsumptionMap.put("BMW 7 Series M760Li xDrive", 12.5);
        fuelConsumptionMap.put("BMW 7 Series M760Li xDrive V12 Excellence", 12.5);
        fuelConsumptionMap.put("BMW 7 Series M760Li xDrive V12 Individual", 12.5);
        fuelConsumptionMap.put("Toyota Corolla 1.3 Esteem", 6.0);
        fuelConsumptionMap.put("Toyota Corolla 1.6 Esteem", 6.6);
        fuelConsumptionMap.put("Toyota Corolla 1.3 Prestige", 6.0);
        fuelConsumptionMap.put("Toyota Corolla 1.4D-4D Esteem", 4.5);
        fuelConsumptionMap.put("Toyota Corolla 1.6 Prestige", 6.6);
        fuelConsumptionMap.put("Toyota Corolla 1.4D-4D Prestige", 4.5);
        fuelConsumptionMap.put("Toyota Corolla 1.8 Prestige", 7.0);
        fuelConsumptionMap.put("Toyota Corolla 1.6 Prestige auto", 6.3);
        fuelConsumptionMap.put("Toyota Corolla 1.6 Prestige+ auto", 6.7);
        fuelConsumptionMap.put("Toyota Corolla hatch 1.2T XS", 6.1);
        fuelConsumptionMap.put("Toyota Corolla hatch 1.2T XS auto", 6.1);
        fuelConsumptionMap.put("Toyota Corolla 1.8 Exclusive", 7.0);
        fuelConsumptionMap.put("Toyota Corolla hatch 1.2T XR", 6.1);
        fuelConsumptionMap.put("Toyota Corolla 1.8 Exclusive auto", 6.4);

        // Example fuel tank capacities (litres)
        fuelTankCapacityMap.put("BMW 7 Series 740Li", 68.0);
        fuelTankCapacityMap.put("BMW 7 Series 730Ld", 70.0);
        fuelTankCapacityMap.put("BMW 7 Series 740Li M Sport", 68.0);
        fuelTankCapacityMap.put("BMW 7 Series 730Ld M Sport", 70.0);
        fuelTankCapacityMap.put("BMW 7 Series 745Le xDrive", 60.0);
        fuelTankCapacityMap.put("BMW 7 Series 745Le xDrive M Sport", 60.0);
        fuelTankCapacityMap.put("BMW 7 Series 740Li Individual", 68.0);
        fuelTankCapacityMap.put("BMW 7 Series 730Ld Individual", 70.0);
        fuelTankCapacityMap.put("BMW 7 Series 745Le xDrive Individual", 60.0);
        fuelTankCapacityMap.put("BMW 7 Series 750Li xDrive", 78.0);
        fuelTankCapacityMap.put("BMW 7 Series 750Li xDrive M Sport", 78.0);
        fuelTankCapacityMap.put("BMW 7 Series 750Li xDrive Individual", 78.0);
        fuelTankCapacityMap.put("BMW 7 Series M760Li xDrive", 78.0);
        fuelTankCapacityMap.put("BMW 7 Series M760Li xDrive V12 Excellence", 78.0);
        fuelTankCapacityMap.put("BMW 7 Series M760Li xDrive V12 Individual", 78.0);
        fuelTankCapacityMap.put("Toyota Corolla 1.3 Esteem", 50.0);
        fuelTankCapacityMap.put("Toyota Corolla 1.6 Esteem", 50.0);
        fuelTankCapacityMap.put("Toyota Corolla 1.3 Prestige", 50.0);
        fuelTankCapacityMap.put("Toyota Corolla 1.4D-4D Esteem", 45.0);
        fuelTankCapacityMap.put("Toyota Corolla 1.6 Prestige", 50.0);
        fuelTankCapacityMap.put("Toyota Corolla 1.4D-4D Prestige", 45.0);
        fuelTankCapacityMap.put("Toyota Corolla 1.8 Prestige", 55.0);
        fuelTankCapacityMap.put("Toyota Corolla 1.6 Prestige auto", 50.0);
        fuelTankCapacityMap.put("Toyota Corolla 1.6 Prestige+ auto", 50.0);
        fuelTankCapacityMap.put("Toyota Corolla hatch 1.2T XS", 45.0);
        fuelTankCapacityMap.put("Toyota Corolla hatch 1.2T XS auto", 45.0);
        fuelTankCapacityMap.put("Toyota Corolla 1.8 Exclusive", 55.0);
        fuelTankCapacityMap.put("Toyota Corolla hatch 1.2T XR", 45.0);
        fuelTankCapacityMap.put("Toyota Corolla 1.8 Exclusive auto", 55.0);

        // Event listener to update fuel info
        carModelComboBox.setOnAction(event -> updateFuelInfo());
        fuelTypeComboBox.setOnAction(event -> updateFuelInfo());
    }

    private void updateFuelInfo() {
        String selectedCar = carModelComboBox.getValue();
        String selectedFuel = fuelTypeComboBox.getValue();

        if (selectedCar != null && selectedFuel != null) {
            double consumption = fuelConsumptionMap.get(selectedCar); // l/100km
            double tankCapacity = fuelTankCapacityMap.get(selectedCar);

            fuelCapacityLabel.setText("Fuel Capacity: " + tankCapacity + " litres");

            // Example: assume fuel price (you can replace with dynamic price)
            double pricePerLitre = selectedFuel.equals("Petrol") ? 24.0 : 22.0;
            double fullTankPrice = tankCapacity * pricePerLitre;

            fuelPriceLabel.setText(String.format("Full Tank Price: R%.2f", fullTankPrice));
        }
    }
}
