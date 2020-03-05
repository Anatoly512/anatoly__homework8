package FlowerStore;

import java.util.ArrayList;
import java.util.List;

public class FlowersLoader {

private FlowersLoader() {
}

    public static List<FlowerStore.Flowers> load (String pathToFile) {

        List<FlowerStore.Flowers> flowersList = new ArrayList<>();

        System.out.println("Flowers Loader !");
        System.out.println(pathToFile);

        return flowersList;
    }

}

