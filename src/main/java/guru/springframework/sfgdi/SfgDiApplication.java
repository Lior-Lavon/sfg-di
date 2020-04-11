package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import guru.springframework.sfgdi.examplebean.FakeDataSource;
import guru.springframework.sfgdi.examplebean.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		// From the context, give me an instance of the been type "MyController"
		MyController myController = (MyController)ctx.getBean("myController"); // the classname starting with a lower case

		// load the fake datasource value from the property file
		FakeDataSource fakeDataSource = (FakeDataSource)ctx.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource);

		// load the fake datasource value from the property file
		FakeJmsBroker fakeJmsBroker = (FakeJmsBroker)ctx.getBean(FakeJmsBroker.class);
		System.out.println(fakeJmsBroker);



//		I18nController i18nController = (I18nController)ctx.getBean("i18nController");
//		System.out.println(i18nController.sayHello());
//
//		PetController petController = (PetController)ctx.getBean("petController");
//
//		System.out.println("------- Pet");
//		System.out.println(petController.whichPetIsTheBest());
//
//
//		System.out.println("------- Primary");
//		System.out.println(myController.sayHello());
//
//		System.out.println("------- Property");
//
//		PropertyInjectedController propertyInjectedController = (PropertyInjectedController)ctx.getBean("propertyInjectedController");
//		System.out.println(propertyInjectedController.getGreeting());
//
//		System.out.println("------- Setter");
//
//		SetterInjectedController setterInjectedController = (SetterInjectedController)ctx.getBean("setterInjectedController");
//		System.out.println(setterInjectedController.getGreeting());
//
//		System.out.println("------- Constructor");
//
//		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController)ctx.getBean("constructorInjectedController");
//		System.out.println(constructorInjectedController.getGreeting());
	}

}
