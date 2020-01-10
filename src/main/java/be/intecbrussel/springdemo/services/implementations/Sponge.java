package be.intecbrussel.springdemo.services.implementations;

import be.intecbrussel.springdemo.services.CleaningTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import java.util.logging.Logger;

@Component
@Order(50)
public class Sponge implements CleaningTool {
    @Autowired
    Logger logger;

    public Sponge() {
        System.out.println("constructor message: dry sponge reporting for duty!");
    }

    @Override
    public void doCleanJob() {
        logger.info("Squishy sponge, living on the ocean floor, I am your ancestor");
    }
}
