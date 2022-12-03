public class Donut implements TimsConsumables{

    @Override
    public String getName() {
        return "Donut";
    }

    @Override
    public int getCalories() {
        return 300;
    }

    @Override
    public Double getPrice() {
        return 3.0;
    }

    @Override
    public String toString(){
        return "Item: Donut   Price: $3.0";
    }
}
