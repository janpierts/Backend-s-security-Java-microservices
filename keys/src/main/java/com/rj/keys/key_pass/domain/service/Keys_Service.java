package com.rj.keys.key_pass.domain.service;

import org.springframework.stereotype.Service;

import com.rj.keys.key_pass.domain.model.keys_pass_Entity;
import com.rj.keys.key_pass.domain.ports.in.Keys_ServicePort;
import com.rj.keys.key_pass.domain.ports.out.Keys_RepositoryPort;

@Service
public class Keys_Service implements Keys_ServicePort {
    private final Keys_RepositoryPort repositoryPorts;
    public Keys_Service(Keys_RepositoryPort repositoryPorts) {
        this.repositoryPorts = repositoryPorts;
    }
    @Override
    public keys_pass_Entity SetKey() {
        return repositoryPorts.SetKey();
    }
}