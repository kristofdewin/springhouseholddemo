package be.intecbrussel.springdemo.services.implementations;

import be.intecbrussel.springdemo.services.CleaningTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@Scope("prototype")
@Order(2)
public class VacuumCleaner implements CleaningTool {
    @Autowired
    Logger logger;

    public VacuumCleaner() {
        System.out.println("constructor message: enter the vacuum");
    }

    public void doCleanJob() {
        logger.info("vuuuuuuuvuuuuvuuuuvuu");
    }
}
