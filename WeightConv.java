public class WeightConv extends Conversion {

    public double toGrams(double pounds){
       return pounds * 28.3495;
    }

    public double toPounds(double grams){
        return grams / 2.2046;
    }

    public double toKG(double grams){
        return grams * 1000;
    }

    public double toGFROMKG(double kg){
        return kg * 1000;
    }

}
