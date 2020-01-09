package be.intecbrussel.springdemo.services.implementations;

import be.intecbrussel.springdemo.services.CleaningTool;

public class DisposableDuster implements CleaningTool {
    private boolean filthy= false;

    public DisposableDuster() {
        System.out.println("constructor message: constructing disposable duster");
    }

    @Override
    public void doCleanJob() {
        if(!filthy){
        System.out.println("swifferdeswif");}
        else{
            System.out.println("you wouldnt wipe your glasses with a filthy piece of paper");
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
