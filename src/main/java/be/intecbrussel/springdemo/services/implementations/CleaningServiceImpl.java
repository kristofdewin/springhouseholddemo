package be.intecbrussel.springdemo.services.implementations;

import be.intecbrussel.springdemo.LunchEvent;
import be.intecbrussel.springdemo.services.CleaningService;
import be.intecbrussel.springdemo.services.CleaningTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.logging.Logger;

@Component
@Primary
public class CleaningServiceImpl implements CleaningService {

    @Autowired
    Logger logger;

    private List<CleaningTool> cleaningTools;

    public List<CleaningTool> getCleaningTools() {
        return cleaningTools;
    }

    @EventListener
    public void lunchEventTriggered(LunchEvent event){
        System.out.println("lunchEvent was triggered, service will now take a break");
    }

    @Autowired
    public void setCleaningTools(List<CleaningTool> cleaningTools) {
        this.cleaningTools = cleaningTools;
    }

    public CleaningServiceImpl() {
        System.out.println("the constructor of cleaningserviceimpl has been called...");
    }


    public void clean() {
        logger.info("cleaningservice has been called!");
        cleaningTools.forEach(CleaningTool::doCleanJob);
        logger.info("cleaningservice finished");
    }


}
