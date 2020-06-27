package org.kogito.passportcontrol.service;

import org.jboss.logging.Logger;
import org.kie.kogito.process.Process;
import org.kie.kogito.process.impl.Sig;

import javax.inject.Inject;
import javax.inject.Named;

public abstract class AbstractPassportControlService {

    protected final Logger LOGGER = Logger.getLogger(this.getClass().getName());

    @Inject
    @Named("PassportControl")
    Process<?> p;

    protected void signalToProcess(String processId, String signalName, Object signalPayload) {
        var pi = p.instances().findById(processId)
                .orElseThrow(() -> new IllegalStateException("Impossible to find process with ID " + processId));
        pi.send(Sig.of(signalName, signalPayload));
    }
}