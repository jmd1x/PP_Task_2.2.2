package web.model;

public class Car {
    private String carBrand;
    private String model;
    private int productionYear;

    public Car(String carBrand, String model, int productionYear) {
        this.carBrand = carBrand;
        this.model = model;
        this.productionYear = productionYear;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carBrand='" + carBrand + '\'' +
                ", model='" + model + '\'' +
                ", productionYear=" + productionYear +
                '}';
    }
}
