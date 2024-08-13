package com.banking.service;

import com.banking.impl.CheckBookRequestImpl;
import com.banking.models.CheckBookRequest;
import com.banking.repository.CheckBookRequestRepository;

import java.util.List;

public class CheckBookRequestService {
    public void manageCheckBookRequests() {
        CheckBookRequestImpl checkBookRequestImpl = new CheckBookRequestImpl();
        CheckBookRequestRepository checkBookRequestRepository = new CheckBookRequestRepository();

        // Add all checkbook requests
        List<CheckBookRequest> requests = checkBookRequestRepository.getSampleCheckBookRequests();
        checkBookRequestImpl.addAllCheckBookRequests(requests);

        // Read a checkbook request
        CheckBookRequest request = checkBookRequestImpl.getCheckBookRequest("C001");
        System.out.println("Request Status: " + request.getStatus() + ", Number of Leaves: " + request.getNumberOfLeaves());

        // Update a checkbook request
        request.setStatus("approved");
        checkBookRequestImpl.updateCheckBookRequest("C001", request);

        // Delete a checkbook request
        checkBookRequestImpl.deleteCheckBookRequest("C002");

        // Display all remaining checkbook requests
        System.out.println("Remaining CheckBook Requests: ");
        for (CheckBookRequest remainingRequest : checkBookRequestImpl.getCheckBookRequests().values()) {
            System.out.println("Request ID: " + remainingRequest.getRequestId() + ", Status: " + remainingRequest.getStatus());
        }
    }
}
