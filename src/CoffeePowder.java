public class CoffeePowder implements TimsMerchendise{

    @Override
    public String getName() {
        return "CoffeePowder";
    }

    @Override
    public Double getPrice() {
        return 15.0;
    }

    @Override
    public String getFeatures() {
        return "Dark roast arabic coffee powder";
    }

    @Override
    public String toString(){
        return "Item: CoffeePowder   Price: $15.0";
    }
}
