package com.rj.key_service.infraestructure.persistence.adapter.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.scheduling.annotation.Scheduled;
import com.rj.key_service.domain.ports.in.RotateKeyUseCase;

@Component
public class KeyRotationScheduler {
    private final RotateKeyUseCase rotateKeysUseCase;
    private static final Logger log = LoggerFactory.getLogger(KeyRotationScheduler.class);

    public KeyRotationScheduler(RotateKeyUseCase rotateKeysUseCase) {
        this.rotateKeysUseCase = rotateKeysUseCase;
    }
    // Se ejecuta cada 24 horas (86400000 ms)
    // O usa cron para medianoche: @Scheduled(cron = "0 0 0 * * *")
    @Scheduled(fixedRate = 86400000) 
    public void scheduledRotation() {
        log.info("Iniciando rotación automática...");
        rotateKeysUseCase.execute(); 
    }
}
