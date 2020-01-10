package be.intecbrussel.springdemo.services.implementations;

import be.intecbrussel.springdemo.services.GardeningTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.util.logging.Logger;

@Component
public class HedgeTrimmerFactory {

    @Autowired
    Logger logger;

    @Bean
    @Primary
    public GardeningTool hedgeTrimmer(){
        int hour = LocalTime.now().getHour();
        if(hour>8 && hour<18){
            return () -> System.out.println("trimming electric");
        }else {
            return ()  -> System.out.println("trimming manual");
        }
    }
}
