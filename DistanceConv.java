public class DistanceConv extends  Conversion {
    public double toM(double feet){
        return feet / 0.3048;
    }

    public double toFT(double meters){
        return meters * 0.3048;
    }

    public double toMM(double meters){ return meters * 1000;}

    public double toMFromMM(double mm){return mm / 1000; }

}
