package FlowerStore;

import java.util.List;

public class FlowersSaver {

private FlowersSaver() {
}

    public static void save(String pathToFile, List<FlowerStore.Flowers> flowersList) {

        System.out.println("Flowers Saver !");
        System.out.println(flowersList);

    }

}

