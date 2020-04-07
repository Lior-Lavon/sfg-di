package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		// From the context, give me an instance of the been type "MyController"
		MyController myController = (MyController)ctx.getBean("myController"); // the classname starting with a lower case

		String greetings = myController.sayHello();
		System.out.println(greetings);
	}

}
