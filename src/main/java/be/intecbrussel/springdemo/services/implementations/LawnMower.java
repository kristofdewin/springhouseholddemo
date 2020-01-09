package be.intecbrussel.springdemo.services.implementations;

import be.intecbrussel.springdemo.services.GardeningTool;
import org.springframework.stereotype.Component;

@Component
public class LawnMower implements GardeningTool {
    public LawnMower() {
        System.out.println("constructing lawnmower");
    }

    @Override
    public void doGardenJob() {
        System.out.println("mowowowowowowowow!");
    }
}
