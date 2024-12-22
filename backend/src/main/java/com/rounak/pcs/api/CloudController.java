package com.rounak.pcs.api;

import com.rounak.pcs.model.AddCloudCredentialsRequest;
import com.rounak.pcs.service.CloudService;  // Service class to handle business logic
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/clouds")  // Mapping the base path for this controller
public class CloudController implements com.rounak.pcs.api.DefaultApi {

    private final CloudService cloudService;

    // Injecting the CloudService to handle the business logic
    public CloudController(CloudService cloudService) {
        this.cloudService = cloudService;
    }

    // POST /clouds : Add cloud credentials
    @Override
    @PostMapping
    public ResponseEntity<Void> addCloudCredentials(
            @RequestBody AddCloudCredentialsRequest addCloudCredentialsRequest) {
        // Call service to process the cloud credentials addition
        cloudService.addCloudCredentials(addCloudCredentialsRequest);
        return ResponseEntity.status(HttpStatus.CREATED).build();  // HTTP 201 Created
    }

    // GET /clouds : List cloud providers
    @Override
    @GetMapping
    public ResponseEntity<List<String>> listCloudProviders() {
        // Call service to get the list of cloud providers
        List<String> cloudProviders = cloudService.getCloudProviders();
        return ResponseEntity.ok(cloudProviders);  // HTTP 200 OK
    }
}
