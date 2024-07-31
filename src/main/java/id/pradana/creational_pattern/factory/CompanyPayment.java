package id.pradana.creational_pattern.factory;

/**
 * Product class aka 'business logic' declaration that must be implemented
 */
public interface CompanyPayment {
    public void create();

    public void printTransaction();
}
