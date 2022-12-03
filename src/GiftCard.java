public class GiftCard implements TimsMerchendise{

    @Override
    public String getName() {
        return "GiftCard";
    }

    @Override
    public Double getPrice() {
        return 20.0;
    }

    @Override
    public String getFeatures() {
        return "A gift card worth of $25";
    }

    @Override
    public String toString(){
        return "Item: GiftCard   Price: $20.0";
    }
}
