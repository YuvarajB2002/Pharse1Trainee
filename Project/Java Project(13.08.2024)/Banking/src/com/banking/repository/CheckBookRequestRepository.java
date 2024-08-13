package com.banking.repository;

import com.banking.models.CheckBookRequest;

import java.util.ArrayList;
import java.util.List;

public class CheckBookRequestRepository {
    public List<CheckBookRequest> getSampleCheckBookRequests() {
        List<CheckBookRequest> requests = new ArrayList<>();
        requests.add(new CheckBookRequest("C001", "101", 25, "2024-08-05", "pending"));
        requests.add(new CheckBookRequest("C002", "102", 50, "2024-08-06", "approved"));
        return requests;
    }
}
