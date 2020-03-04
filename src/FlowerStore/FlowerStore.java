package FlowerStore;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.InputStream;

public class FlowerStore extends BorderPane {

private Button buttonBouquetUsual;
private Button buttonBouquetBeautiful;

private int walletFlowerStore = 0;
private Label pictureFlowers;
private Button buttonEmptyWallet;

FlowerStore() {

    this.buttonBouquetUsual = new Button(" Обычный букет !");
    this.buttonBouquetBeautiful = new Button(" Красивый букет !");

    this.pictureFlowers = new Label ();
    this.buttonEmptyWallet = new Button("Очистить счет");
}


    public void choiceOfFlowers(Stage primaryStage) {

        System.out.println("Flower Menu!");

        BorderPane root = new BorderPane();
        GridPane centerPane = new GridPane();

        DropShadow dropShadow1 = new DropShadow();
        dropShadow1.setRadius(5.0);
        dropShadow1.setOffsetX(3.0);
        dropShadow1.setOffsetY(3.0);
        dropShadow1.setColor(Color.color(0.4, 0.5, 0.5));
        buttonBouquetUsual.setEffect(dropShadow1);
        buttonBouquetBeautiful.setEffect(dropShadow1);
        buttonEmptyWallet.setEffect(dropShadow1);

        String setStyleForButtons = "-fx-background-color: \n" +
                "        rgba(0,0,0,0.08),\n" +
                "        linear-gradient(#93FFE8, #32ccbc),\n" +
                "        linear-gradient(#90f7ec 0%,#57FEFF 10%, #32ccbc 50%, #32ccbc 51%, #0fb4e7 100%);\n" +
                "    -fx-background-insets: 0 0 -1 0,0,1;\n" +
                "    -fx-background-radius: 5,5,4;\n" +
                "    -fx-padding: 3 30 3 30;\n" +
                "    -fx-text-fill: #242d35;\n" +
                "    -fx-font-size: 17px";
        buttonBouquetUsual.setStyle(setStyleForButtons);
        buttonBouquetBeautiful.setStyle(setStyleForButtons);

        String setStyleForButtonEmptyWallet = "-fx-background-color: \n" +
                "        #c3c4c4,\n" +
                "        linear-gradient(#d6d6d6 50%, white 100%),\n" +
                "        radial-gradient(center 50% -40%, radius 200%, #e6e6e6 45%, rgba(230,230,230,0) 50%);\n" +
                "    -fx-background-radius: 30;\n" +
                "    -fx-background-insets: 0,1,1;\n" +
                "    -fx-text-fill: black;\n" +
                "    -fx-font-size: 14px;" +
                "    -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 3, 0.0 , 0 , 1 );";
        buttonEmptyWallet.setStyle(setStyleForButtonEmptyWallet);

        try {
        this.buttonBouquetUsual.setGraphic(addImageToButton("resourses/button_flowers_usual.png"));
        this.buttonBouquetBeautiful.setGraphic(addImageToButton("resourses/button_flowers.png"));
        }
        catch (Exception ignored) {  //  <ignored>  потому что в методе addImageToButton уже есть обработчик исключений
        }


        buttonBouquetUsual.setOnAction(e -> {
                    try {

                    } catch (Exception ignored) {
                    }
                }
        );

        buttonBouquetBeautiful.setOnAction(e -> {
                    try {

                    } catch (Exception ignored) {
                    }
                }
        );


        buttonEmptyWallet.setOnAction(e -> {
                    try {

                    } catch (Exception ignored) {
                    }
        }
        );


        VBox vbox0 = new VBox();
        vbox0.getChildren().addAll(new Label("                     \n\n"));

        centerPane.add(vbox0, 2, 1);
        centerPane.add(new Label("            \n\n\n"), 3, 2);
        centerPane.add(buttonBouquetUsual, 5,3);   //  Вывод кнопок <букетов> на экран
        centerPane.add(new Label("            \n\n"), 4, 5);
        centerPane.add(new Label("            \n\n"), 4, 8);
        centerPane.add(buttonBouquetBeautiful, 5,10);

        centerPane.add(new Label("            \n\n\n\n\n\n\n"), 4, 13);
        centerPane.add(buttonEmptyWallet, 18,15);   //  Вывод кнопки обнуления счета на экран

        root.setCenter(centerPane);

        primaryStage.setTitle("Flower Menu ");
        primaryStage.setScene(new Scene(root, 850, 550));
        primaryStage.centerOnScreen();
        primaryStage.show();

    }


    private ImageView addImageToButton(String stringPathToResourse) throws IOException {

        ImageView imageView = null;
        InputStream input = null;
        try {
            input = getClass().getResourceAsStream(stringPathToResourse);
            Image image = new Image(input);
            imageView = new ImageView(image);
        } catch (Exception ex) {
            System.out.println("Произошла ошибка с файлом изображения !\nВозможно он где-то потерялся!\n");
        }
        finally {
            if (input != null) { input.close(); }
        }
        return imageView;
    }



    public Integer convertTextToInteger (Stage primaryStage, TextField TextString) {
        Integer integerValue;
        int value = 0;

        String StringToConvert = TextString.getText();

        try {
            value = Integer.parseInt(StringToConvert);
        }
        catch (Exception ex) {
            System.out.println("Вы ввели что-то не то (или оставили поля незаполненными) !");
            ExeptionHandler exeption = new ExeptionHandler();
            exeption.exceptionWindowShow(primaryStage);
        }

        if (value < 0) {
            value = -(value);   //  Заказ отрицательных чисел цветов будем считать сбоем в Матрице, а не тонким намеком
        }

        if (value > 500) {
            value = 500;      //  Все же количество цветов в магазине ограничено размером помещения
        }

        integerValue = (Integer) (value);

        return integerValue;
    }

}
