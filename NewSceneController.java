package application;

import java.net.URL;
import java.util.*;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

public class NewSceneController implements Initializable {

    @FXML
    private ChoiceBox<String> brandChoiceBox;

    @FXML
    private ChoiceBox<String> modelChoiceBox;

    @FXML
    private TextField fuelTankTextField;

    @FXML
    private Label selectedBrandLabel;

    @FXML
    private Label selectedModelLabel;

    @FXML
    private Label selectedFuelLabel;

    @FXML
    private TextField newBrandField;

    @FXML
    private Button addBrandButton;

    @FXML
    private TextField newModelField;

    @FXML
    private TextField newModelFuelField;

    @FXML
    private Button addModelButton;

    private final Map<String, List<String>> brandToModels = new HashMap<>();
    private final Map<String, String> modelToFuel = new HashMap<>();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Initial data
        addBrandWithModels("BMW", Arrays.asList("BMW 7 Series 740Li", "BMW 7 Series 730Ld"));
        addBrandWithModels("Toyota", Arrays.asList(
                "Toyota HILUX 2.4 GD-6",
                "Toyota HILUX 2.8 GD-6",
                "Toyota QUANTUM",
                "Toyota ETIOS",
                "Toyota COROLLA CROSS"
        ));

        modelToFuel.put("BMW 7 Series 740Li", "7.9l/100km");
        modelToFuel.put("BMW 7 Series 730Ld", "5.7l/100km");
        modelToFuel.put("Toyota HILUX 2.4 GD-6", "7.1l/100km");
        modelToFuel.put("Toyota HILUX 2.8 GD-6", "7.6l/100km");
        modelToFuel.put("Toyota QUANTUM", "8.5l/100km");
        modelToFuel.put("Toyota ETIOS", "5.9l/100km");
        modelToFuel.put("Toyota COROLLA CROSS", "6.8l/100km");

        // Populate brand dropdown
        brandChoiceBox.getItems().addAll(brandToModels.keySet());

        // Brand selection logic
        brandChoiceBox.getSelectionModel().selectedItemProperty().addListener((obs, oldVal, newVal) -> {
            if (newVal == null) return;

            selectedBrandLabel.setText(newVal);
            modelChoiceBox.getItems().clear();
            List<String> models = brandToModels.get(newVal);
            if (models != null) {
                modelChoiceBox.getItems().addAll(models);
            }

            selectedModelLabel.setText("");
            selectedFuelLabel.setText("");
            fuelTankTextField.clear();
        });

        // Model selection logic
        modelChoiceBox.getSelectionModel().selectedItemProperty().addListener((obs, oldVal, newVal) -> {
            if (newVal == null) return;

            selectedModelLabel.setText(newVal);
            String fuel = modelToFuel.get(newVal);
            fuelTankTextField.clear();

            if (fuel != null) {
                fuelTankTextField.setText(fuel);
                selectedFuelLabel.setText(fuel);
            } else {
                fuelTankTextField.setPromptText("Enter fuel consumption");
                selectedFuelLabel.setText("");
            }
        });

        // Fuel input logic
        fuelTankTextField.textProperty().addListener((obs, oldVal, newVal) -> {
            selectedFuelLabel.setText(newVal);
        });

        // Add new brand
        addBrandButton.setOnAction(e -> {
            String brand = newBrandField.getText().trim();
            if (!brand.isEmpty() && !brandToModels.containsKey(brand)) {
                brandToModels.put(brand, new ArrayList<>());
                brandChoiceBox.getItems().add(brand);
                newBrandField.clear();
            }
        });

        // Add new model
        addModelButton.setOnAction(e -> {
            String selectedBrand = brandChoiceBox.getSelectionModel().getSelectedItem();
            String model = newModelField.getText().trim();
            String fuel = newModelFuelField.getText().trim();

            if (selectedBrand != null && !model.isEmpty()) {
                List<String> models = brandToModels.getOrDefault(selectedBrand, new ArrayList<>());
                if (!models.contains(model)) {
                    models.add(model);
                    brandToModels.put(selectedBrand, models);
                    modelToFuel.put(model, fuel);

                    if (brandChoiceBox.getSelectionModel().getSelectedItem().equals(selectedBrand)) {
                        modelChoiceBox.getItems().add(model);
                    }

                    newModelField.clear();
                    newModelFuelField.clear();
                }
            }
        });
    }

    private void addBrandWithModels(String brand, List<String> models) {
        brandToModels.put(brand, new ArrayList<>(models));
    }
}
