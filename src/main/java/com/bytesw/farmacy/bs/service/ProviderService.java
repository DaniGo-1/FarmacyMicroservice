package com.bytesw.farmacy.bs.service;

import com.bytesw.farmacy.eis.bo.Provider;

import java.util.List;

public interface ProviderService {

    Provider createProvider(Provider provider);

    Provider getProvider(int id);

    Provider updateProvider(Provider provider);

    Provider deleteProvider(int id);

    List<Provider> getAllProviders();
}
