package com.example.healthmonitoringdoctor;

/**
 * Created by rtrev on 11/10/2016.
 */

class Patient {
    String name;
    String lastVisit;
    String threshold;


    Patient(String name, String lastVisit, String threshold) {
        this.name = name;
        this.lastVisit = lastVisit;
        this.threshold = threshold;
    }
}
