package com.rj.key_service.key_pass.infraestructure.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rj.key_service.key_pass.domain.service.Keys_Service;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.rj.key_service.key_pass.domain.model.keys_Entity;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/api/security/keys")
public class KeysServiceController {
    private final Keys_Service keysService;
    public KeysServiceController(Keys_Service keysService) {
        this.keysService = keysService;
    }
    @PostMapping("SetKey")
    public ResponseEntity<keys_Entity> setKey() {
        keys_Entity key = keysService.SetKey();
        return new ResponseEntity<>(key, HttpStatus.CREATED);
    }
}
