package okladnikov.bool;

public class ShotData {

    private double abscissa;
    private double ordinate;
    private double radius;
    private boolean result;

    public ShotData(double x, double y, double r){
        abscissa = x;
        ordinate = y;
        radius = r;
    }

    public  ShotData() {

    }

    public double getAbscissa() {
        return abscissa;
    }

    public void setAbscissa(double x) {
        abscissa = x;
    }

    public double getOrdinate() {
        return ordinate;
    }

    public void setOrdinate(double y) {
        ordinate = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        radius = r;
    }

    public boolean getResult() {
        return result;
    }

    public  void setResult(boolean result) {
        this.result = result;
    }
}
