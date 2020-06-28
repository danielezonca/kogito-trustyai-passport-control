package org.kogito.passportcontrol.service;

import io.vertx.core.json.JsonArray;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.kogito.passportcontrol.util.PostData;
import org.kogito.passportcontrol.util.RestService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import static org.kogito.passportcontrol.util.RestRequest.of;

@ApplicationScoped
public class DisplayExitInformation extends AbstractPassportControlService {

    private static final String CONTENT_TYPE = "image/jpeg";
    private static final String fileName = "tmp.jpg";
    private static final String name = "file";
    private static final String unknown = "unknown";

//    @ConfigProperty(name = "recognition.service.host", defaultValue = "localhost")
    protected String host;

//    @ConfigProperty(name = "recognition.service.port", defaultValue = "8080")
    protected int port;

//    @ConfigProperty(name = "recognition.service.ssl", defaultValue = "false")
    protected boolean ssl;

//    @ConfigProperty(name = "recognition.service.endpoint")
    protected String endpoint;



    public void display() {
        LOGGER.info("Display Exit Information");
        var request = of(host, port, ssl, endpoint);
        var postData = PostData.of(name, fileName, null /* imageData.getImage() */, CONTENT_TYPE);
//        service.POSTForm(request, postData, rawQuote -> {
//            LOGGER.info("result " + rawQuote.bodyAsString());
//            var matches = rawQuote.bodyAsJsonObject().getJsonArray("faces");
//            var user = extractMatchName(matches);
//            LOGGER.info("Recognized user: " + user);
//            // signalToProcess(id, "receive-user", user);
//        });
    }

    protected String extractMatchName(JsonArray matches) {
        if(matches.size() == 0) {
            return unknown;
        }
        var matchedId = matches.getJsonObject(0).getString("id");
        return matchedId.substring(0, matchedId.lastIndexOf("_"));
    }
}