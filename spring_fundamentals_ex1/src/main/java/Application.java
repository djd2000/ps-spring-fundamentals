import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pluralsight.model.Customer;
import com.pluralsight.service.CustomerService;

public class Application {

	public static void main(String[] args) {

//		CustomerService customerService = new CustomerServiceImpl();

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		CustomerService customerService = applicationContext.getBean("customerService", CustomerService.class);
		System.out.println(customerService);

		CustomerService customerService2 = applicationContext.getBean("customerService", CustomerService.class);
		System.out.println(customerService2);

		for (Customer customer : customerService.findAll()) {
			System.out.println(customer.getFirstName() + " " + customer.getLastName());
		}
	}

}
