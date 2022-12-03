public class Bagel implements TimsConsumables{
    @Override
    public int getCalories() {
        return 350;
    }

    @Override
    public String getName() {
        return "Bagel";
    }

    @Override
    public Double getPrice() {
        return 4.0;
    }

    @Override
    public String toString(){
        return "Item: Bagel   Price: $4.0";
    }
}
