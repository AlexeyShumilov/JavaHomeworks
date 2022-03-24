package hw6.task2.objects;

public class Product {
    private String title;
    private int protein;
    private int fats;
    private int carbohydrates;
    private int calories;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.length() < 2){
            System.out.println("Название продукта должно содержать больше 2 симвовлов");
        }
        this.title = title;
    }

    public int getProtein() {
        return protein;
    }

    public void setProtein(int protein) {
        if (protein < 2){
            System.out.println("Содержание протеина должно быть не меньше 2");
        }
        this.protein = protein;
    }

    public int getFats() {
        return fats;
    }

    public void setFats(int fats) {
        if (fats < 1){
        System.out.println("Содержание жиров должно быть не меньше 1");
    }
        this.fats = fats;
    }

    public int getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(int carbohydrates) {
        if (carbohydrates < 10){
            System.out.println("Содержание углеводов должно быть не меньше 10");
        }
        this.carbohydrates = carbohydrates;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        if (calories < 18){
            System.out.println("Калорийность должна быть не меньше 18");
        }
        this.calories = calories;
    }

    public Product(String title, int protein, int fats, int carbohydrates, int calories){
        setTitle(title);
        setProtein(protein);
        setFats(fats);
        setCarbohydrates(carbohydrates);
        setCalories(calories);
    }
}
