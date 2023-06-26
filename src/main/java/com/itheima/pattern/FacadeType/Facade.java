package com.itheima.pattern.FacadeType;

public class Facade {
    private final DVDPlayer dvdPlayer;
    private final Porcorn porcorn;
    private final Projector projector;

    public Facade() {
        this.dvdPlayer = DVDPlayer.getInstance();
        this.porcorn = Porcorn.getInstance();
        this.projector = Projector.getInstance();
    }

    public void on(){
        dvdPlayer.on();
        porcorn.on();
        projector.on();
    };

    public void  off(){
        dvdPlayer.off();
        porcorn.off();
        projector.off();
    };

    public void  play(){
        dvdPlayer.play();
        porcorn.play();
        projector.play();
    };
}
