package za.ac.cput.prototype;

/**
 * Created by Tank on 4/2/2017.
 */
public class ProductionVehicle implements protoTypeCar{


    private String type;
    private String model;

    public ProductionVehicle(String type, String model) {
        this.type = type;
        this.model = model;
    }

    @Override
    public protoTypeCar Copy() {
        return new ProductionVehicle(type,model);
    }

    @Override
    public String toString() {
        return "Type: " + type +"\n" +"Model=" + model + "\n";
    }

}
