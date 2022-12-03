public class Mug implements TimsMerchendise{

    @Override
    public String getName() {
        return "Mug";
    }

    @Override
    public Double getPrice() {
        return 5.0;
    }

    @Override
    public String getFeatures() {
        return "Beutiful red mug.";
    }

    @Override
    public String toString(){
        return "Item: Mug   Price: $5.0";
    }
}
