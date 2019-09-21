import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pluralsight.model.Customer;
import com.pluralsight.service.CustomerService;

public class Application {

	public static void main(String[] args) {

		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		CustomerService customerService = appContext.getBean("customerService", CustomerService.class);

		for (Customer customer : customerService.findAll()) {
			System.out.println(customer.getFirstName() + " " + customer.getLastName());
		}
	}

}
