package mocks;

/**
 * Created by RSen on 28/03/2017.
 */
public class EnergyGasPageMock {
    private final String gastariff;
    private final String paymentmethod;
    private final String kwhusage;

    public EnergyGasPageMock(String gastariff, String paymentmethod, String kwhusage) {
        this.gastariff = gastariff;
        this.paymentmethod = paymentmethod;
        this.kwhusage = kwhusage;
    }

    public String getGasTariff() {
        return gastariff;
    }

    public String getPaymentMethod() {
        return paymentmethod;
    }

    public String getKwhUsage() {
        return kwhusage;
    }
}
