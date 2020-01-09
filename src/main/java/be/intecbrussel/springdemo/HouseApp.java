package be.intecbrussel.springdemo;

import be.intecbrussel.springdemo.configuration.HouseSpringComponentScanConfiguration;
import be.intecbrussel.springdemo.services.DomesticService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HouseApp {

    public static void main(String[] args) {

        ConfigurableApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(HouseSpringComponentScanConfiguration.class);
        DomesticService service =
                applicationContext.getBean("domesticService", DomesticService.class);
        service.runHouseHold();
        applicationContext.close();

    }
}
