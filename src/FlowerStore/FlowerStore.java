package FlowerStore;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FlowerStore extends BorderPane {

private Button buttonBouquetUsual;
private Button buttonBouquetBeautiful;

private Label pictureFlowers;

FlowerStore() {

    this.buttonBouquetUsual = new Button("Обычный букет !");
    this.buttonBouquetBeautiful = new Button("Красивый букет !");

    this.pictureFlowers = new Label ();
}


    public void choiceOfFlowers(Stage primaryStage) {

        System.out.println("Flower Menu!");

        BorderPane root = new BorderPane();

        GridPane centerPane = new GridPane();

        VBox vbox0 = new VBox();
        vbox0.getChildren().addAll(new Label("                     \n\n"));

        HBox hbox1 = new HBox();
        hbox1.getChildren().addAll(buttonBouquetUsual);

        HBox hbox2 = new HBox();
        hbox2.getChildren().addAll(buttonBouquetBeautiful);


        centerPane.add(vbox0, 2, 1);
        centerPane.add(new Label("            \n\n\n"), 3, 2);

        centerPane.add(hbox1, 5,3);   //  Вывод кнопок <букетов> на экран
        centerPane.add(new Label("            \n\n"), 4, 5);
        centerPane.add(new Label("            \n\n"), 4, 8);
        centerPane.add(hbox2, 5,10);

        root.setCenter(centerPane);

        primaryStage.setTitle("Flower Menu ");
        primaryStage.setScene(new Scene(root, 600, 450));
        primaryStage.centerOnScreen();
        primaryStage.show();



    }




}
