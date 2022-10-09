public class processor {

    private String merk;
    private double cahce;
    processor(){    
    }
    processor(String merk, double cahce){
        this.merk = merk;
        this.cahce = cahce;
    }
    public void setMerk(String merk){
        this.merk = merk;
    }
    public void setCahce(double cahce){
        this.cahce = cahce;
    }
    public String getMerk(){
        return merk;
    }
    public double getCahce(){
        return cahce;
    }
    public void info(){
        System.out.printf("Merk Processor = %s\n", merk);
        System.out.printf("Cache Memory = %.2f\n", cahce);
    }
}
