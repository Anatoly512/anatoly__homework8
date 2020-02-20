package FlowerStore;

import javafx.application.Application;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        FlowerStore flowerStore = new FlowerStore();
        flowerStore.choiceOfFlowers(primaryStage);

    }


    public static void main(String[] args) {
        launch(args);
    }

}
