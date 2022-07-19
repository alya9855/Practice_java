package collections.pier;

public class Pier {
    int idPier;
    double timePassenger;
    double timeBoat;
    boolean typeOfStop;  // true-end, false-intermediate;

    public Pier(int idPier, double timePassenger, double timeBoat, boolean typeOfStop) {
        this.idPier = idPier;
        this.timePassenger = timePassenger;
        this.timeBoat = timeBoat;
        this.typeOfStop = typeOfStop;
    }

    public int getIdPier() {
        return idPier;
    }

    public void setIdPier(int idPier) {
        this.idPier = idPier;
    }

    public double getTimePassenger() {
        return timePassenger;
    }

    public void setTimePassenger(double timePassenger) {
        this.timePassenger = timePassenger;
    }

    public double getTimeBoat() {
        return timeBoat;
    }

    public void setTimeBoat(double timeBoat) {
        this.timeBoat = timeBoat;
    }

    public boolean isTypeOfStop() {
        return typeOfStop;
    }

    public void setTypeOfStop(boolean typeOfStop) {
        this.typeOfStop = typeOfStop;
    }
}
