package be.intecbrussel.springdemo.services.implementations;

import be.intecbrussel.springdemo.services.GardeningService;
import be.intecbrussel.springdemo.services.GardeningTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class GardeningServiceImpl implements GardeningService {

    private GardeningTool gardeningTool;

    @Autowired
    Logger logger;

    @Autowired
    public GardeningServiceImpl(GardeningTool gardeningTool) {
        this.gardeningTool = gardeningTool;
        System.out.println("constructing gardening service");
    }

    public GardeningTool getGardeningTool() {
        return gardeningTool;
    }

    public void setGardeningTool(GardeningTool gardeningTool) {
        this.gardeningTool = gardeningTool;
    }

    @Override
    public void garden() {
        logger.info("gardeningservice starting up gardening protocol!!");
        gardeningTool.doGardenJob();
        logger.info("gardeningservice executed");
    }
}
