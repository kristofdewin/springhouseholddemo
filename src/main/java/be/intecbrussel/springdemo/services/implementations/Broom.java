package be.intecbrussel.springdemo.services.implementations;

import be.intecbrussel.springdemo.services.CleaningTool;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class Broom implements CleaningTool {
    public Broom(){
        System.out.println("constructor message: enter the broom");
    }
    public void doCleanJob() {
        System.out.println("broomer de broom, I clean the room, I destroy the dust");
    }
}
