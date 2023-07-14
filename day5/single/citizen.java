package day5.single;

public class citizen {
    private String name;
    private long aadhaar;
    
    public citizen() {
        
    }
    
    public citizen(String name, long aadhaar) {
        this.name = name;
        this.aadhaar = aadhaar;
    }
    
    public String getName() {
        return name;
    }
    
    public long getAadhaar() {
        return aadhaar;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAadhaar(long aadhaar) {
        this.aadhaar = aadhaar;
    }
}