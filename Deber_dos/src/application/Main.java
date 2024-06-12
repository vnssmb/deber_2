package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.time.LocalDate;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        
        Label fechaLabel = new Label("Seleccione una fecha:");
        DatePicker datePicker = new DatePicker();
        
        Label colorLabel = new Label("Seleccione un color:");
        ColorPicker colorPicker = new ColorPicker();

        Button confirmButton = new Button("OK");
        confirmButton.setOnAction(e -> {
            
            LocalDate fechaSeleccionada = datePicker.getValue();
            String colorSeleccionado = colorPicker.getValue().toString();
            System.out.println("Fecha seleccionada: " + fechaSeleccionada);
            System.out.println("Color seleccionado: " + colorSeleccionado);
        });

        
        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(10));
        vbox.getChildren().addAll(fechaLabel, datePicker, colorLabel, colorPicker, confirmButton);

        
        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setTitle("DEBER DOS");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
