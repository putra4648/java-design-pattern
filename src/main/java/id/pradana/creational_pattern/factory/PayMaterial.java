package id.pradana.creational_pattern.factory;

/**
 * This class is responsibility for making logic that
 * must implemented from declaration before
 */
public class PayMaterial implements CompanyPayment {

    @Override
    public void create() {
        System.out.println("ALL MATERIAL PAID");
        printTransaction();
    }

    @Override
    public void printTransaction() {
        System.out.println("PRINT ALL TRANSACTION FOR MATERIAL HAS BEEN CREATED");
    }
}
