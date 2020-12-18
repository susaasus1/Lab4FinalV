package com.itmo.being;

import com.itmo.notalive.Poster;
import com.itmo.notalive.Roof;

import java.net.PortUnreachableException;

public class Kids extends Born {

    private Roof whereClimbed;
    private Poster giveWhat;
    private Snusmumrik toWhom;

    public Kids(Poster giveWhat, Roof whereClimbed, Snusmumrik toWhom) {
        setName(" малыша ");
        this.giveWhat = giveWhat;
        this.whereClimbed = whereClimbed;
        this.toWhom = toWhom;
    }


    public Roof getWhereClimbed() {
        return whereClimbed;
    }

    public Poster getGiveWhat() {
        return giveWhat;
    }

    public Snusmumrik getToWhom() {
        return toWhom;
    }

    public void setGiveWhat(Poster giveWhat) {
        this.giveWhat = giveWhat;
    }
}
