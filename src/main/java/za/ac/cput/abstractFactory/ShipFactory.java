package za.ac.cput.abstractFactory;

import za.ac.cput.abstractFactory.transport.Submarine;
import za.ac.cput.abstractFactory.transport.Warship;

/**
 * Created by Tank on 4/2/2017.
 */
public class ShipFactory extends FactoryType {

    @Override
    public za.ac.cput.abstractFactory.transport.Transport getTransport(String typ) {
        if("Ferry".equalsIgnoreCase(typ)) {
            return new Warship();
        }else
            return new Submarine();
    }




}
