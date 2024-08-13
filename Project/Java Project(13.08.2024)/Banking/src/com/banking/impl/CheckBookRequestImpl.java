package com.banking.impl;

import com.banking.intf.CheckBookRequestIntf;
import com.banking.models.CheckBookRequest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckBookRequestImpl implements CheckBookRequestIntf {
    private Map<String, CheckBookRequest> checkBookRequests = new HashMap<>();

    @Override
    public void addCheckBookRequest(CheckBookRequest request) {
        checkBookRequests.put(request.getRequestId(), request);
    }

    @Override
    public void addAllCheckBookRequests(List<CheckBookRequest> requestsList) {
        for (CheckBookRequest request : requestsList) {
            checkBookRequests.put(request.getRequestId(), request);
        }
    }

    @Override
    public CheckBookRequest getCheckBookRequest(String requestId) {
        return checkBookRequests.get(requestId);
    }

    @Override
    public void updateCheckBookRequest(String requestId, CheckBookRequest request) {
        checkBookRequests.put(requestId, request);
    }

    @Override
    public void deleteCheckBookRequest(String requestId) {
        checkBookRequests.remove(requestId);
    }

	public Map<String, CheckBookRequest> getCheckBookRequests() {
		return checkBookRequests;
	}

	public void setCheckBookRequests(Map<String, CheckBookRequest> checkBookRequests) {
		this.checkBookRequests = checkBookRequests;
	}
}
