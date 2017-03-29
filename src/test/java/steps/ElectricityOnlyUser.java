package steps;

/**
 * Created by RSen on 27/03/2017.
 */
public class ElectricityOnlyUser {
    public String postcode;
    public String electricitysupplier;
    public String kwhspend;
    public String emailaddress;

    public ElectricityOnlyUser(String postCode, String supplierElectricity, String kwhSpend, String emailAddress) {
        postcode = postCode;
        electricitysupplier = supplierElectricity;
        kwhspend = kwhSpend;
        emailaddress = emailAddress;
    }
}

