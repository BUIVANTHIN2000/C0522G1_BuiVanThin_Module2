package bailamthemoop1.model;

public abstract class Vehicle {
    private String seaOfControl; //Biển kiểm soát
    private String maFactureName;// Tên hẵng sản suất
    private String yearManuFature;// Năm sản xuất;
    private String owner;// Chủ sở hữu

    @Override
    public String toString() {
        return "Vehicle{" +
                "seaOfControl='" + seaOfControl + '\'' +
                ", maFactureName='" + maFactureName + '\'' +
                ", yearManuFature='" + yearManuFature + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }

    public Vehicle() {
    }

    public Vehicle(String seaOfControl, String maFactureName, String yearManuFature, String owner) {
        this.seaOfControl = seaOfControl;
        this.maFactureName = maFactureName;
        this.yearManuFature = yearManuFature;
        this.owner = owner;
    }

    public String getSeaOfControl() {
        return seaOfControl;
    }

    public void setSeaOfControl(String seaOfControl) {
        this.seaOfControl = seaOfControl;
    }

    public String getMaFactureName() {
        return maFactureName;
    }

    public void setMaFactureName(String maFactureName) {
        this.maFactureName = maFactureName;
    }

    public String getYearManuFature() {
        return yearManuFature;
    }

    public void setYearManuFature(String yearManuFature) {
        this.yearManuFature = yearManuFature;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
