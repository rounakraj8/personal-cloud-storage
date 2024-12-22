package com.rounak.pcs.service;

import com.rounak.pcs.model.AddCloudCredentialsRequest;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CloudService {

    // Method to add cloud credentials
    public void addCloudCredentials(AddCloudCredentialsRequest addCloudCredentialsRequest) {
        // Logic to add the cloud credentials, for example, save them to a database
        // (not implemented here)
        System.out.println("Adding cloud credentials: " + addCloudCredentialsRequest);
    }

    // Method to list available cloud providers
    public List<String> getCloudProviders() {
        // Logic to return the list of cloud providers (can be fetched from a database or predefined)
        return Arrays.asList("AWS", "GCP", "Azure");
    }
}
