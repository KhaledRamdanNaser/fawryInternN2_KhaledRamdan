public class HandleShippingService implements ShippingService {
    @Override
    public void sendShipping(String address) {
        System.out.println("Shipping paperBook to: "+address);
    }
}
