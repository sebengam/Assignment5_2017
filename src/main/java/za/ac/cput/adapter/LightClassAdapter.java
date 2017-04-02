package za.ac.cput.adapter;

/**
 * Created by Tank on 4/2/2017.
 */
public class LightClassAdapter extends Light implements LightAdapter {
    @Override
    public Voltage get240Volt() {
        return getVoltage();
    }
    @Override
    public Voltage get12Volt() {
        Voltage v= getVoltage();
        return convertVolt(v,10);
    }
    @Override
    public Voltage get3Volt() {
        Voltage v= getVoltage();
        return convertVolt(v,40);
    }
    private Voltage convertVolt(Voltage v, int i) {
        return new Voltage(v.getVolts()/i);
    }

}
