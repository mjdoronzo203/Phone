
public abstract class Phone {
	private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringTone;
    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
    }
    
    public abstract void displayInfo();
    
    public String getVersionNumber() {
    	return versionNumber;
    }
    public int getBatteryPercentage() {
    	return batteryPercentage;
    }
    public String getCarrier() {
    	return carrier;
    }
    public String getRingtone() {
    	return ringTone;
    }
    
    public void setVersionNumber(String number) {
    	this.versionNumber = number;
    }
    public void setBatteryPercentage(int number) {
    	this.batteryPercentage = number;
    }
    public void setCarrier(String name) {
    	this.carrier = name;
    }
    public void setRingtone(String ring) {
    	this.ringTone = ring;
    }

}
