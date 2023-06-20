package InterfaceP.Mappable;

enum Geometry {LINE, POINT, POLYGON}

enum Color {BLACK, BLUE, GREEN, ORANGE, RED}

enum PointMarker {CIRCLE, PUSH_PIN, STAR, SQUARE, TRIANGLE}

enum LineMarker {DASHED, DOTTED, SOLID}

public interface Mappable {
    String JSON_PROPERTY = """
            "properties":{%s}
            """;

    String getLabel();

    Geometry getShape();

    String getMarker();

    default String toJSON() {
        return """
                "type":"%s","label":"%s","marker":"%s""".formatted(getShape(), getLabel(), getMarker());
    }

    static void mapIt(Mappable mappable) {
        System.out.print(JSON_PROPERTY.formatted(mappable.toJSON()));
    }
}


//class UtilityLine implements Mappable{
//    String type;
//    String label;
//    String marker;
//    String name;
//    String utility;
//
//    public UtilityLine(String name, String utility,String label, String marker) {
//        this.type = GeoType.LINE.toString();
//        this.label = label;
//        this.marker = marker;
//        this.name=name;
//        this.utility=utility;
//    }
//
//    @Override
//    public String label() {
//        return label;
//    }
//
//    @Override
//    public String geometryType() {
//        return type;
//    }
//
//    @Override
//    public String iconType() {
//        return marker;
//    }
//
//
//    @Override
//    public String toString() {
//        return "type='" + type + '\'' +
//                ", label='" + label + '\'' +
//                ", marker='" + marker + '\'' +
//                ", name='" + name + '\'' +
//                ", utility='" + utility + '\'' ;
//    }
//}