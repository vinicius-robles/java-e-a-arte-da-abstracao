package domain;

public non-sealed class Salesman extends Employee {

    private double percentagePerSale;

    private double saleAmount;

    public Salesman(String code, String name, String address, int age, double salary, double percentagePerSale) {
        super(code, name, address, age, salary);
        this.percentagePerSale = percentagePerSale;
    }

    @Override
    public String getCode(){
        return "SL" + this.code;
    }

    @Override
    public double getFullSalary() {
        return this.salary + ((saleAmount * percentagePerSale) / 100);
    }

    public Salesman() {

    }

    public double getPercentagePerSale() {
        return percentagePerSale;
    }

    public void setPercentagePerSale(double percentagePerSale) {
        this.percentagePerSale = percentagePerSale;
    }

    public double getSaleAmount(){
        return saleAmount;
    }

    public void setSaleAmount(double saleAmount){
        this.saleAmount = saleAmount;
    }


}
