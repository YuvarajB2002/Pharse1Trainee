package com.banking.repository;

import com.banking.models.CheckBookRequest;
import java.util.*;

/**
 * Repository for managing CheckBookRequest data.
 */
public class CheckBookRequestRepository {
    private Map<String, CheckBookRequest> checkBookRequestMap = new HashMap<>();

    // Adds a new check book request to the repository
    public void addCheckBookRequest(CheckBookRequest request) {
        checkBookRequestMap.put(request.getRequestId(), request);
    }

    // Retrieves a check book request by its ID
    public CheckBookRequest getCheckBookRequestById(String requestId) {
        return checkBookRequestMap.get(requestId);
    }

    // Updates an existing check book request
    public void updateCheckBookRequest(CheckBookRequest request) {
        checkBookRequestMap.put(request.getRequestId(), request);
    }

    // Deletes a check book request by its ID
    public void deleteCheckBookRequest(String requestId) {
        checkBookRequestMap.remove(requestId);
    }

    // Retrieves all check book requests
    public Collection<CheckBookRequest> getAllCheckBookRequests() {
        return checkBookRequestMap.values();
    }
}
