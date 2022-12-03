public class Sandwich implements TimsConsumables{

    @Override
    public String getName() {
        return "Sandwich";
    }

    @Override
    public int getCalories() {
        return 650;
    }

    @Override
    public Double getPrice() {
        return 8.0;
    }

    @Override
    public String toString(){
        return "Item: Sandwich   Price: $8.0";
    }
}
