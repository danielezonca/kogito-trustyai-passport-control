package org.kogito.passportcontrol.service;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.kogito.passportcontrol.model.PassengerPicture;
import org.kogito.passportcontrol.util.RestService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;
import java.util.concurrent.CompletableFuture;

import static org.kogito.passportcontrol.util.RestRequest.of;

@ApplicationScoped
public class CheckPicture extends AbstractPassportControlService {

//    @ConfigProperty(name = "camera.host", defaultValue = "localhost")
    protected String host;

//    @ConfigProperty(name = "camera.port", defaultValue = "8080")
    protected int port;

//    @ConfigProperty(name = "camera.ssl", defaultValue = "false")
    protected boolean ssl;

//    @ConfigProperty(name = "camera.endpoint")
    protected String endpoint;

    public void checkPicture(String id, PassengerPicture passengerPicture) {
        LOGGER.info("CheckPicture");
        LOGGER.info("id" + id);
        var request = of(host, port, ssl, endpoint);

        CompletableFuture.runAsync(() -> signalToProcess(id, "check-picture", true));
//
//        service.GET(request, httpResponse -> {
//            try {
//                // Enable service
//                var imageBytes = httpResponse.body().getBytes();
//                // var imageBytes = Files.readAllBytes(Paths.get("../../testImages/bradPitt_3.jpg"));
//                // var imageBytes = Files.readAllBytes(Paths.get("../../testImages/angelinaJolie_3.jpg"));
//                // var imageBytes = Files.readAllBytes(Paths.get("../../testImages/nicolasCage_3.jpg"));
//                // var imageBytes = Files.readAllBytes(Paths.get("../../testImages/jackNicholson_1.jpg"));
//                var imageAsBase64 = Base64.getEncoder().encodeToString(imageBytes);
//                // var imageData = new ImageData(imageAsBase64);
//                // signalToProcess(id, "receive-picture", imageData);
//            } catch (Exception e) {
//                LOGGER.error(e.getMessage(), e);
//            }
//        });
    }
}