package hw6.task1.climbing;

public class Climber {
    private String name;
    private String address;

    public void setName(String name) {
        if ( name == null || name.length() < 3){
            throw new IllegalArgumentException("Значение name от 3 символов");
        }
        this.name = name;
    }

    public void setAddress(String address) {
        if (address == null || address.length() < 5) {
            throw new IllegalArgumentException("Значение address от 5 символов");
        }
        this.address = address;
    }

    public Climber(String name, String address){
        setName(name);
        setAddress(address);
    }

    public void printNameAndAddress(){
        System.out.println(name + ", " + address);
    }

    public String getNameAndAddress(){
        return name + ", " + address;
    }
}
