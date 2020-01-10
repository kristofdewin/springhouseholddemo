package be.intecbrussel.springdemo.services.implementations;

import be.intecbrussel.springdemo.services.GardeningTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class LawnMower implements GardeningTool {

    @Autowired
    Logger logger;
    public LawnMower() {
        System.out.println("constructing lawnmower");
    }

    @Override
    public void doGardenJob() {
        logger.info("mowowowowowowowow!");
    }
}
