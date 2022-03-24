package hw6.task2.objects;

public class MyProduct {
    private String name;
    private final int maxProtein = 70;
    private final int maxFats = 62;
    private final int maxCarbohydrates = 96;
    private final int maxCalories = 540;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.length() < 3){
            System.out.println("Название рациона должно иметь не меньше 3 символов");
        }
        this.name = name;
    }

    public MyProduct(String name) {
        setName(name);
        this.name = name;
    }

    private Product[] products = new Product[4];

    public void addProduct(Product product){
        for (int i = 0; i < products.length; i++){
            if (product.getProtein()>maxProtein){
                throw new IllegalArgumentException("Белков должно быть меньше 50");
            }
            if (product.getFats()>maxFats){
                throw new IllegalArgumentException("Жиров должно быть меньше 22");
            }
            if (product.getCarbohydrates()>maxCarbohydrates){
                throw new IllegalArgumentException("Углеводов должно быть меньше 80");
            }
            if (product.getCalories()>maxCalories){
                throw new IllegalArgumentException("Калорий должно быть меньше 540");
            }
            if (products[i]==null){
                products[i]=product;
                return;
            }
        }
        throw new IllegalArgumentException("Рацион полон, удалите часть продуктов");
    }

    public void addProduct(Product...products){
        for (Product product:products){
            addProduct(product);
        }
    }

    public void productsList(){
        System.out.println("Рацион "+ getName()+": ");
        for (Product product:products){
            if (product!=null){
                System.out.println("Продукт " + product.getTitle()+ ":" + " белков - "+product.getProtein()+", жиров - "+product.getFats()+", углеводов - "+product.getCarbohydrates()+", калорий - "+product.getCalories());}
        }
    }
}
