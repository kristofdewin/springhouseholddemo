package be.intecbrussel.springdemo.services.implementations;

import be.intecbrussel.springdemo.services.CleaningTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;
@Component
public class DisposableDuster implements CleaningTool {

    @Autowired
    Logger logger;

    private boolean filthy= false;

    public DisposableDuster() {
        System.out.println("constructor message: constructing disposable duster");
    }

    @Override
    public void doCleanJob() {
        if(!filthy){
        logger.info("swifferdeswif");}
        else{
            logger.info("you wouldnt wipe your glasses with a filthy piece of paper");
        }
        filthy=true;
    }

    @Override
    public String toString() {
        return "DisposableDuster{" +
                "filthy=" + filthy +
                '}';
    }
}
