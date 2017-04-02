package za.ac.cput.abstractFactory;

/**
 * Created by Tank on 4/2/2017.
 */
public class AbstractFactory {
    private static AbstractFactory af=null;

    private AbstractFactory() {
    }

    public static AbstractFactory getAbstrctF(){
        if(af==null){
            af = new AbstractFactory();
        }
        return af;
    }

    public VehicleFactory getFactory(String fact){

        if("vehicle".equalsIgnoreCase(fact)){
            return new VehicleFactory();
        }else
            return new VehicleFactory();
    }
}
