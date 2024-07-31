package id.pradana.creational_pattern.factory;

/**
 * Concrete creator aka 'factory creator' class
 */
public class CompanySalary extends CompanyFactory {

    @Override
    public CompanyPayment createPayment() {
        return new PaySalary();
    }

}
