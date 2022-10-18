package com.taco.cloud.authorizationserver.repositories;

import org.springframework.lang.Nullable;
import org.springframework.security.oauth2.server.authorization.client.RegisteredClient;

// This repository maintains details about clients that might be asking for authorization on behalf of users
public interface RegisteredClientRepository {
    @Nullable
    RegisteredClient findById(String id);

    @Nullable
    RegisteredClient findByClientId(String clientId);
}
