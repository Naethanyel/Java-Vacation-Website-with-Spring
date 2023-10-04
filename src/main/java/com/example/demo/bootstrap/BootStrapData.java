
package com.example.demo.bootstrap;

import com.example.demo.dao.CustomerRepository;
import com.example.demo.entities.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner{

    private final CustomerRepository customerRepository;

    public BootStrapData(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) {


        Customer tom = new Customer("Tom", "Hanks", "357 Rainy Lane",
                "44405", "2145087657");

        Customer bob = new Customer("Bob", "Robertson", "204 Happy Rd",
                "34505", "4445876709");

        Customer paul = new Customer("Paul", "Dedrick", "9000 Fast Lane",
                "17333", "7472134424");

        Customer sally = new Customer("Sally", "Jones", "17 Lincoln Dr",
                "10101", "1019763464");

        Customer blake = new Customer("Blake", "Henderson", "808 Boulevard Blvd",
                "89343", "22010058787");

        customerRepository.save(tom);
        customerRepository.save(bob);
        customerRepository.save(paul);
        customerRepository.save(sally);
        customerRepository.save(blake);
    }
}


