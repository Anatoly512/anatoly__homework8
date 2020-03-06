package FlowerStore;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FlowersLoader {

private FlowersLoader() {      //  private конструктор делает невозможным создание экземпляра этого класса
}

    public static <T> List<T> load (String pathToFile) throws Exception {

        List<T> flowersList = new ArrayList<>();

        try {
            FileReader reader = new FileReader(pathToFile);
            Scanner scan = new Scanner(reader);
            String line = scan.nextLine();

            StringBuffer sb1 = new StringBuffer(line);
            sb1.delete((line.length())-1, line.length());
            line = String.valueOf(sb1);

            StringBuffer sb2 = new StringBuffer(line);
            sb2.delete(0, 1);
            line = String.valueOf(sb2);

            flowersList.add((T) line);

            reader.close();
        }
        catch (Exception ex) {
            System.out.println("Что-то с чтением из файла " + pathToFile + " пошло не так !");
        }

        return flowersList;
    }

}

