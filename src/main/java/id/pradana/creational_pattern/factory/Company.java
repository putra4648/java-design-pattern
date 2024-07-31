package id.pradana.creational_pattern.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * Main configuration
 */
public class Company {
    private static List<CompanyFactory> companyFactories;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        companyFactories = new ArrayList<>();
        companyFactories.add(new CompanyMaterial());
        companyFactories.add(new CompanySalary());
    }

    static void runBusinessLogic() {
        companyFactories.forEach(factory -> factory.createPayment().create());
    }
}
