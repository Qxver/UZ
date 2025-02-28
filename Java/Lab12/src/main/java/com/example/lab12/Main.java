package com.example.lab12;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import static javafx.application.Application.launch;

public class Main extends Application{

    @Override
    public void start(Stage stage){
        stage.setTitle("Lab12");

        GridPane grid = new GridPane();
        grid.setAlignment((Pos.CENTER));
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Scene scene = new Scene(grid, 800, 600);
        stage.setScene(scene);

        Text scenetitle = new Text("Formularz");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 30));
        scenetitle.setTextAlignment(TextAlignment.CENTER);
        grid.add(scenetitle, 0, 0, 2, 1);

        Label imie = new Label("Imię: ");
        grid.add(imie, 0, 1);
        TextField textField = new TextField();
        grid.add(textField, 1, 1);

        Label nazwisko = new Label("Nazwisko: ");
        grid.add(nazwisko, 0, 2);
        TextField textField2 = new TextField();
        grid.add(textField2, 1, 2);

        Label miejsceZatrudnienia = new Label("Miejsce Zatrudnienia: ");
        grid.add(miejsceZatrudnienia, 0, 3);
        TextField textField3 = new TextField();
        grid.add(textField3, 1, 3);

        Label stanowisko = new Label("Stanowisko: ");
        grid.add(stanowisko, 0, 4);
        TextField textField4 = new TextField();
        grid.add(textField4, 1, 4);

        Label ulica = new Label("Ulica: ");
        grid.add(ulica, 0, 5);
        TextField textField5 = new TextField();
        grid.add(textField5, 1, 5);

        Label miasto = new Label("Miasto: ");
        grid.add(miasto, 0, 6);
        TextField textField6 = new TextField();
        grid.add(textField6, 1, 6);

        Label kodPocztowy = new Label("Kod Pocztowy: ");
        grid.add(kodPocztowy, 0, 7);
        TextField textField7 = new TextField();
        grid.add(textField7, 1, 7);

        Label wojewodztwo = new Label("Województwo: ");
        grid.add(wojewodztwo, 0, 8);
        TextField textField8 = new TextField();
        grid.add(textField8, 1, 8);

        Label kraj = new Label("Kraj: ");
        grid.add(kraj, 0, 9);
        TextField textField9 = new TextField();
        grid.add(textField9, 1, 9);

        Label nrTelefonu = new Label("Nr Telefonu: ");
        grid.add(nrTelefonu, 0, 10);
        TextField textField10 = new TextField();
        grid.add(textField10, 1, 10);

        Label email = new Label("Email: ");
        grid.add(email, 0, 11);
        TextField textField11 = new TextField();
        grid.add(textField11, 1, 11);

        Label StronaWWW = new Label("Strona www: ");
        grid.add(StronaWWW, 0, 12);
        TextField textField12 = new TextField();
        grid.add(textField12, 1, 12);

        Label uwagi = new Label("Uwagi: ");
        grid.add(uwagi, 0, 13);
        TextField textField13 = new TextField();
        grid.add(textField13, 1, 13);

        Button button = new Button("Wyślij");
        button.setAlignment(Pos.BOTTOM_RIGHT);
        grid.add(button, 0, 15);

        button.setOnAction((ActionEvent e) -> {
            button.setText("Wysłano");
        });

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
