package com.example.pacman;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public abstract class Spokelse extends Entitet{
    protected Circle posisjon;
    protected String retning,retningSjekk;
    public Spokelse(double x, double y) {
        super(x, y);
        posisjon = new Circle(x, y, 10);
    }
    public abstract void bevegelse();
    public void utenforSjekk(Spokelse spokelse){
        if (Spill.utenforHøyre.contains(spokelse.boks) ){
            spokelse.posisjon.setCenterX(-20);
        }
        if (Spill.utenforVenstre.contains(spokelse.boks) ){
            spokelse.posisjon.setCenterX(580);
        }
    }
}

