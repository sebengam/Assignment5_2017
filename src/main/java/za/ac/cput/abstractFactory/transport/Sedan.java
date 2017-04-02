package za.ac.cput.abstractFactory.transport;

import sun.rmi.transport.Channel;
import sun.rmi.transport.Endpoint;

import java.security.AccessControlContext;

/**
 * Created by Tank on 4/2/2017.
 */
public class Sedan extends sun.rmi.transport.Transport implements Transport {


    @Override
    public String getName() {
        return "Sedan";
    }

    @Override
    public String getType() {
        return "Family car";
    }

    @Override
    public Channel getChannel(Endpoint endpoint) {
        return null;
    }

    @Override
    public void free(Endpoint endpoint) {

    }

    @Override
    protected void checkAcceptPermission(AccessControlContext accessControlContext) {

    }
}


