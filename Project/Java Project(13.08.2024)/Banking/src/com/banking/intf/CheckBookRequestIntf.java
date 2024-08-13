package com.banking.intf;

import com.banking.models.CheckBookRequest;

import java.util.List;

public interface CheckBookRequestIntf {
    void addCheckBookRequest(CheckBookRequest request);
    void addAllCheckBookRequests(List<CheckBookRequest> requests);
    CheckBookRequest getCheckBookRequest(String requestId);
    void updateCheckBookRequest(String requestId, CheckBookRequest request);
    void deleteCheckBookRequest(String requestId);
}
