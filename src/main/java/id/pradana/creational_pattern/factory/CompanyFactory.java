package id.pradana.creational_pattern.factory;

/**
 * Base class for 'factory' method which class will produces something
 */
public abstract class CompanyFactory {
    public abstract CompanyPayment createPayment();
}
