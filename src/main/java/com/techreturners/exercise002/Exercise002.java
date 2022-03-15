package com.techreturners.exercise002;

public class Exercise002 {

    public boolean isFromManchester(Person person) {
        // For now keep it simple!
        return person.getLocation().equalsIgnoreCase("Manchester");
    }

    public boolean canWatchFilm(Person person, int ageLimit) {
        // For now keep it simple!
        return person.getAge() >= ageLimit;
    }
    
}
