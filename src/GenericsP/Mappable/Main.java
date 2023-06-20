package GenericsP.Mappable;

public class Main {
    public static void main(String[] args) {
        Park[] nationalUSParks = new Park[]{
                new Park("Yellowstone", "40.1021,-75.4231"),
                new Park("Grand Canyon", "36.0636,-112.1079"),
        };

        Layer<Park> parkLayer = new Layer<>(nationalUSParks);
        parkLayer.renderList();

        var majorUSRivers = new River[]{
                new River("Mississippi", "47.2160,-95.2348", "35.1556,-90.0659"),
                new River("Missouri", "39.1556,-95.0659", "45.2120,-91.2348")

        };

        Layer<River> riverLayer = new Layer<>(majorUSRivers);
        riverLayer.addElements(new River("Colorado", "30.1556,-90.0659", "40,2120,-96.2348"),
                new River("Delaware", "22.1556,-11.0659", "66.2120,-99.2348"));
        riverLayer.renderList();
    }
}
