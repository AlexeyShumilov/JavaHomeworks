package hw6.task1.climbing;

public class Climber {
    private String name;
    private String adress;

    public void setName(String name) {
        if ( name == null || name.length() < 3){
            throw new IllegalArgumentException("Значение name от 3 символов");
        }
        this.name = name;
    }

    public void setAdress(String adress) {
        if (adress == null || adress.length() < 5) {
            throw new IllegalArgumentException("Значение adress от 5 символов");
        }
        this.adress = adress;
    }

    public Climber(String name, String adress){
        setName(name);
        setAdress(adress);
    }

    public void printNameAndAdress(){
        System.out.println(name + ", " + adress);
    }

    public String getNameAndAdress(){
        return name + ", " + adress;
    }
}
