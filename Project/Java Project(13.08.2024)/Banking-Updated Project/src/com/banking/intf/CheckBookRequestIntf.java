package com.banking.intf;

import com.banking.models.CheckBookRequest;

/**
 * Interface for CheckBookRequest operations.
 * Defines methods for CRUD operations related to CheckBookRequest.
 */
public interface CheckBookRequestIntf {
    void createCheckBookRequest(CheckBookRequest request);
    CheckBookRequest getCheckBookRequestById(String requestId);
    void updateCheckBookRequest(CheckBookRequest request);
    void deleteCheckBookRequest(String requestId);
}
