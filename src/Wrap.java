public class Wrap implements TimsConsumables{

    @Override
    public String getName() {
        return "Wrap";
    }

    @Override
    public int getCalories() {
        return 250;
    }

    @Override
    public Double getPrice() {
        return 7.0;
    }

    @Override
    public String toString(){
        return "Item: Wrap   Price: $7.0";
    }
}
