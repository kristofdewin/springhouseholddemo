package be.intecbrussel.springdemo.services.implementations;

import be.intecbrussel.springdemo.services.CleaningService;
import be.intecbrussel.springdemo.services.CleaningTool;
import be.intecbrussel.springdemo.services.DomesticService;
import be.intecbrussel.springdemo.services.GardeningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component(value= "domesticService")
public class DomesticServiceImpl implements DomesticService {
    @Autowired
    private GardeningService gardeningService;
    @Autowired
    private CleaningService cleaningService;
    @Autowired
    private Logger logger;

    public DomesticServiceImpl() {
        System.out.println("constructing domestic service");
    }

    public GardeningService getGardeningService() {
        return gardeningService;
    }

    public void setGardeningService(GardeningService gardeningService) {
        this.gardeningService = gardeningService;
    }

    public CleaningService getCleaningService() {
        return cleaningService;
    }

    public void setCleaningService(CleaningService cleaningService) {
        this.cleaningService = cleaningService;
    }

    @Override
    public void runHouseHold() {
        logger.info("starting runHouseHold");
        gardeningService.garden();
        cleaningService.clean();
    }
}
