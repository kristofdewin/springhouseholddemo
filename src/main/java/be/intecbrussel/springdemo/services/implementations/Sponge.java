package be.intecbrussel.springdemo.services.implementations;

import be.intecbrussel.springdemo.services.CleaningTool;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(50)
public class Sponge implements CleaningTool {
    public Sponge() {
        System.out.println("constructor message: dry sponge reporting for duty!");
    }

    @Override
    public void doCleanJob() {
        System.out.println("Squishy sponge, living on the ocean floor, I am your ancestor");
    }
}
