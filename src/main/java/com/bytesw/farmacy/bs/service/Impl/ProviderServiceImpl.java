package com.bytesw.farmacy.bs.service.Impl;

import com.bytesw.farmacy.bs.dao.ProviderRepository;
import com.bytesw.farmacy.bs.service.ProviderService;
import com.bytesw.farmacy.eis.bo.Provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProviderServiceImpl implements ProviderService {

    private ProviderRepository providerRepository;

    @Autowired
    public ProviderServiceImpl(ProviderRepository providerRepository){
        this.providerRepository = providerRepository;
    }

    @Override
    public Provider createProvider(Provider provider) {
        Provider response = this.providerRepository.save(provider);
        return response;
    }

    @Override
    public Provider getProvider(int id) {
        Optional<Provider> response = this.providerRepository.findById(id);
        return response.isPresent() ? response.get() : new Provider();
    }

    @Override
    public Provider updateProvider(Provider provider) {
        Provider response = this.providerRepository.save(provider);
        return response;
    }

    @Override
    public Provider deleteProvider(int id) {
        Optional<Provider> response = this.providerRepository.findById(id);
        this.providerRepository.deleteById(id);
        return response.isPresent() ? response.get() : new Provider();
    }

    @Override
    public List<Provider> getAllProviders() {
        List<Provider> response = this.providerRepository.findAll();
        return response;
    }
}
