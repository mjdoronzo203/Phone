
public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    
    public String ring() {
        return "iPhone " + this.getVersionNumber() + " says " + this.getRingtone();
    }
    
    public String unlock() {
        return "Unlocking via facial recognition";
    }
    
    public void displayInfo() {
		System.out.println("iPhone " + this.getVersionNumber() + " from " + this.getCarrier());
    }
}
