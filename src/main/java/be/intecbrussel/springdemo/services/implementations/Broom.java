package be.intecbrussel.springdemo.services.implementations;

import be.intecbrussel.springdemo.services.CleaningTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@Scope("prototype")
@Order(1)
public class Broom implements CleaningTool {

    Logger logger;

    @Autowired
    public Broom setLogger(Logger logger) {
        this.logger = logger;
        return this;
    }

    public Broom(){
    }
    public void doCleanJob() {
        logger.info("broom cleaning");
    }
}
