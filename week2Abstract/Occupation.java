package week2Abstract;

public abstract class Occupation {
    private String jobs;
    protected double taxRate;
    

    public abstract void payTax();

    public void setJobs(String jobs){
        this.jobs = jobs;
    }

    
    public void setTaxRate(double taxRate){
        this.taxRate = taxRate;
    }
}
