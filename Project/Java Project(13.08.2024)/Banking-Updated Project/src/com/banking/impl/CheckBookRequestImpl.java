package com.banking.impl;

import com.banking.intf.CheckBookRequestIntf;
import com.banking.models.CheckBookRequest;
import com.banking.repository.CheckBookRequestRepository;

/**
 * Implementation of CheckBookRequestIntf using CheckBookRequestRepository for data storage.
 */
public class CheckBookRequestImpl implements CheckBookRequestIntf {
    private CheckBookRequestRepository checkBookRequestRepository = new CheckBookRequestRepository();

    @Override
    public void createCheckBookRequest(CheckBookRequest request) {
        checkBookRequestRepository.addCheckBookRequest(request);
    }

    @Override
    public CheckBookRequest getCheckBookRequestById(String requestId) {
        return checkBookRequestRepository.getCheckBookRequestById(requestId);
    }

    @Override
    public void updateCheckBookRequest(CheckBookRequest request) {
        checkBookRequestRepository.updateCheckBookRequest(request);
    }

    @Override
    public void deleteCheckBookRequest(String requestId) {
        checkBookRequestRepository.deleteCheckBookRequest(requestId);
    }
}
