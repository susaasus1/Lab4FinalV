package com.itmo.being;

import com.itmo.notalive.*;

public class Hemuliha extends Born {

    private String descriptions = "маленькая ";
    private Born whoInteractsWith = new Guests();
    private Craft Where = new Home();
    private Craft have = new Tea();

    public Hemuliha() {
        setName("Хемулиха ");
    }

    public String getDescriptions() {
        return descriptions;
    }

    public Born getWhoInteractsWith() {
        return whoInteractsWith;
    }

    public Craft getWhere() {
        return Where;
    }

    public Craft getHave() {
        return have;
    }
}
