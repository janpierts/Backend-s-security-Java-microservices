package com.rj.keys.domain.ports.in;

import java.util.List;
import com.rj.keys.domain.model.private_key_Entity;
import com.rj.keys.domain.model.public_keys_Entity;

public interface Keys_ServicePort {
    List<public_keys_Entity> getPublicKeys();
    private_key_Entity getPrivateKey();
}
