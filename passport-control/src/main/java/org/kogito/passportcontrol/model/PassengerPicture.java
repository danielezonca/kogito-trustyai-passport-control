package org.kogito.passportcontrol.model;

public class PassengerPicture {

    private String rawImage;

    public PassengerPicture() {
    }

    public PassengerPicture(String rawImage) {
        this.rawImage = rawImage;
    }

    public String getRawImage() {
        return rawImage;
    }

    public void setRawImage(String rawImage) {
        this.rawImage = rawImage;
    }
}