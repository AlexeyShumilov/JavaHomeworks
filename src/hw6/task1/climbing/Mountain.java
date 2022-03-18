package hw6.task1.climbing;

public class Mountain {
    private String mountainName;
    private String mountainCountry;
    private int mountainHeight;


    public void setMountainName(String mountainName){
        if ( mountainName == null || mountainName.length() < 4){
            throw new IllegalArgumentException("Значение mountainName от 4 символов");
        }
        this.mountainName = mountainName;
    }

    public String getMountainName() {
        return mountainName;
    }

    public void setMountainCountry(String mountainCountry){
        if ( mountainCountry == null || mountainCountry.length() < 4){
            throw new IllegalArgumentException("Значение mountainCountry от 4 символов");
        }
        this.mountainCountry = mountainCountry;
    }

    public String getMountainCountry() {
        return mountainCountry;
    }

    public void setMountainHeight(int mountainHeight){
        if (mountainHeight < 100){
            throw new IllegalArgumentException("Значение mountainHeight от 100 метров");
        }
        this.mountainHeight = mountainHeight;
    }

    public int getMountainHeight() {
        return mountainHeight;
    }

    public Mountain (String mountainName, String mountainCountry, int mountainHeight){
        setMountainName(mountainName);
        this.mountainName = mountainName;
        setMountainCountry(mountainCountry);
        this.mountainCountry = mountainCountry;
        setMountainHeight(mountainHeight);
        this.mountainHeight = mountainHeight;
    }
}
