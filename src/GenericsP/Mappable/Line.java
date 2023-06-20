package GenericsP.Mappable;

import java.util.Arrays;

class River extends Line {
    private String name;

    public River(String name, String... locations) {
        super(locations);
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " River";
    }
}

public abstract class Line implements Mappable {
    private String name;
    private String type;
    private double[][] locations;

    public Line(String... locations) {
        this.locations = new double[locations.length][];
        int index = 0;
        for (var l : locations) {
            this.locations[index++] = Mappable.StringToLatLon(l);
        }
    }

    private String locations() {
        return Arrays.deepToString(locations);
    }


    @Override
    public void render() {
        System.out.println("Render " + this + " as line (" + locations() + ")");
    }


}