package za.ac.cput.abstractFactory;

/**
 * Created by Tank on 4/2/2017.
 */
public abstract class FactoryType {
    public abstract za.ac.cput.abstractFactory.transport.Transport getTransport(String typ);

}
