package be.intecbrussel.springdemo.services.implementations;

import be.intecbrussel.springdemo.services.CleaningTool;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class VacuumCleaner implements CleaningTool {
    public VacuumCleaner() {
        System.out.println("constructor message: enter the vacuum");
    }

    public void doCleanJob() {
        System.out.println("vuuuuuuuvuuuuvuuuuvuu");
    }
}
