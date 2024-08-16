package com.banking.service;

import com.banking.intf.CheckBookRequestIntf;
import com.banking.models.CheckBookRequest;

/**
 * Service class for managing check book requests.
 * Handles business logic related to CheckBookRequest operations.
 */
public class CheckBookRequestService {
    private CheckBookRequestIntf checkBookRequestIntf;

    public CheckBookRequestService(CheckBookRequestIntf checkBookRequestIntf) {
        this.checkBookRequestIntf = checkBookRequestIntf;
    }

    public void createCheckBookRequest(CheckBookRequest request) {
        checkBookRequestIntf.createCheckBookRequest(request);
    }

    public CheckBookRequest getCheckBookRequestById(String requestId) {
        return checkBookRequestIntf.getCheckBookRequestById(requestId);
    }

    public void updateCheckBookRequest(CheckBookRequest request) {
        checkBookRequestIntf.updateCheckBookRequest(request);
    }

    public void deleteCheckBookRequest(String requestId) {
        checkBookRequestIntf.deleteCheckBookRequest(requestId);
    }
}
