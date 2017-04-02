package za.ac.cput.abstractFactory;

import za.ac.cput.abstractFactory.transport.Hatchback;
import za.ac.cput.abstractFactory.transport.Sedan;

/**
 * Created by Tank on 4/2/2017.
 */
public class VehicleFactory extends FactoryType {
    @Override
    public za.ac.cput.abstractFactory.transport.Transport getTransport(String typ) {
        if("Tank".equalsIgnoreCase(typ)){
            return new Hatchback();
        }
        else
            return new Sedan();
    }

}
