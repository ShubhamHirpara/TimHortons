public class Coffee implements TimsConsumables{

    @Override
    public String getName() {
        return "Coffee";
    }

    @Override
    public int getCalories() {
        return 100;
    }

    @Override
    public Double getPrice() {
        return 2.5;
    }

    @Override
    public String toString(){
        return "Item: Coffee   Price: $2.5";
    }
}
