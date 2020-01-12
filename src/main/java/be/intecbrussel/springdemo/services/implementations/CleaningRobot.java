package be.intecbrussel.springdemo.services.implementations;

import be.intecbrussel.springdemo.services.CleaningService;
import be.intecbrussel.springdemo.services.CleaningTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.logging.Logger;

@Component
public class CleaningRobot implements CleaningService {

    @Autowired
    Logger logger;

    private List<CleaningTool> cleaningTools;

    @Autowired
    public CleaningRobot setCleaningTools(List<CleaningTool> cleaningTools) {
        this.cleaningTools = cleaningTools;
        return this;
    }

    @Override
    public void clean() {
        logger.info("Cleaningrobot started");
        cleaningTools.forEach(CleaningTool::doCleanJob);
        logger.info("Cleaninrobot finished");
    }
}
