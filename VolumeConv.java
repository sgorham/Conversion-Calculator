public class VolumeConv extends Conversion {
    public double toOz(double ml){
        return ml * 0.033814;
    }

    public double toML(double oz){
        return oz / 0.033814;
    }
}
