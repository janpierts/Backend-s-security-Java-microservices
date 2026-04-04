package com.rj.key_service.key_pass.infraestructure.persistence.adapter.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.scheduling.annotation.Scheduled;
import com.rj.key_service.key_pass.domain.ports.in.RotateKeyUseCase;

@Component
public class KeyRotationScheduler {
    private final RotateKeyUseCase rotateKeysUseCase;
    private static final Logger log = LoggerFactory.getLogger(KeyRotationScheduler.class);

    public KeyRotationScheduler(RotateKeyUseCase rotateKeysUseCase) {
        this.rotateKeysUseCase = rotateKeysUseCase;
    }

    @Scheduled(fixedRate = 86400000) 
    public void scheduledRotation() {
        log.info("Iniciando rotación automática...");
        rotateKeysUseCase.execute(); 
    }
}
