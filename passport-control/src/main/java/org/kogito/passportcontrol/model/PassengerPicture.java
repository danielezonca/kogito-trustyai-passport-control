package org.kogito.passportcontrol.model;

public class PassengerPicture {

    private final String rawImage;

    public PassengerPicture(String rawImage) {
        this.rawImage = rawImage;
    }

    public String getRawImage() {
        return rawImage;
    }

}