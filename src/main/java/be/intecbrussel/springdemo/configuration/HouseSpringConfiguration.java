package be.intecbrussel.springdemo.configuration;

import be.intecbrussel.springdemo.services.*;
import be.intecbrussel.springdemo.services.implementations.*;
import org.springframework.context.annotation.*;


public class HouseSpringConfiguration {

    @Bean
    public DomesticService domesticService(GardeningService gardeningService, CleaningService cleaningService){
        DomesticServiceImpl domesticService = new DomesticServiceImpl();
        domesticService.setGardeningService(gardeningService);
        domesticService.setCleaningService(cleaningService);
        return domesticService;
    }
    @Bean
    public GardeningService gardeningService(GardeningTool gardeningTool){
        GardeningServiceImpl gardeningService = new GardeningServiceImpl(lawnMower());
        gardeningService.setGardeningTool(gardeningTool);
        return gardeningService;
    }

    @Bean
    public GardeningTool lawnMower(){
        return new LawnMower();
    }

    @Bean(name={"broomingbroom", "broom", "bezem", "BrOoM"})
    @Scope("prototype")
    public CleaningTool broom(){
        return new Broom();
    }
    @Bean(name= "vacuumcleaner")
    @Scope("prototype")
    public CleaningTool vacuum(){
        return new VacuumCleaner();
    }
    @Bean(name= "sponge")
    @Scope("prototype")
    public CleaningTool sponge(){
        return new Sponge();
    }

    @Bean
    @Scope(value = "prototype",proxyMode = ScopedProxyMode.INTERFACES)
    public CleaningTool dusty(){
        return new DisposableDuster();
    }
    @Bean(name = "dustyService")
    @Lazy
    public CleaningService disposableDusterService(){
        CleaningServiceImpl dustService = new CleaningServiceImpl();
        dustService.setCleaningTools(null);
        return dustService;

    }
    @Bean
    @Lazy
    public CleaningService broomCleaningService(){
        CleaningServiceImpl broomService = new CleaningServiceImpl();
        broomService.setCleaningTools(null);
        return broomService;
    }
    @Bean
    @Lazy
    @Primary
    public CleaningService vacuumCleaningService(){
        CleaningServiceImpl vacuumService = new CleaningServiceImpl();
        vacuumService.setCleaningTools(null);
        return vacuumService;

    }
    @Bean(name="spongebob")
    @Lazy
    public CleaningService spongeCleaningService(){
        CleaningServiceImpl vacuumService = new CleaningServiceImpl();
        vacuumService.setCleaningTools(null);
        return vacuumService;

    }
}
