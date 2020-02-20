package FlowerStore;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class FlowerStore extends BorderPane {


private Label pictureFlowers;

FlowerStore() {

    this.pictureFlowers = new Label ();
}


    public void choiceOfFlowers(Stage primaryStage) {

        System.out.println("Flower Menu!");

        BorderPane root = new BorderPane();

        GridPane centerPane = new GridPane();

        HBox hbox0 = new HBox();
        hbox0.getChildren().addAll(new Label("                     \n"));


        root.setCenter(centerPane);

        primaryStage.setTitle("Flower Menu ");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.centerOnScreen();
        primaryStage.show();



    }




}
