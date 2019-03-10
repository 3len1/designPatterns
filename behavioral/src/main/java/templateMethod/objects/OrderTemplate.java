package templateMethod.objects;

/**
 * Created by 3len1 on 2/4/2019.
 */
public abstract class OrderTemplate {

    public boolean isGift;

    public abstract void doCheckout();

    public abstract void doPayment();

    public abstract void doReceipt();

    public abstract void doDelivery();

    public final void wrapGift() {
        System.out.println("Gift wrapped.");
    }

    public final void processOrder() {
        doCheckout();
        doPayment();
        if (isGift) {
            wrapGift();
        } else {
            doReceipt();
        }

        doDelivery();
    }

}
