package Domain;

public class truck {
    private int id;
    private String model;
    private double curr_weight;
    private double max_weight;
    private String licence;
    private boolean availability;


    public truck(int id, String model, double curr_weight, double max_weight, String licence) {
        this.id = id;
        this.model = model;
        this.curr_weight = curr_weight;
        this.max_weight = max_weight;
        this.licence = licence;
        this.availability = true;
    }

    public int getID() {
        return id;
    }

    public void setCurr_weight(double curr_weight) {
        this.curr_weight = curr_weight;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public String ToString() {
        return "Truck ID: " + id + "\nModel: " + model + "\nCurrent Weight: " + curr_weight + "\nMax Weight: " + max_weight + "\nLicence: " + licence;
    }
}

