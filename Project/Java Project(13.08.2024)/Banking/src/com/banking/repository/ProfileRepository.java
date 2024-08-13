package com.banking.repository;

import com.banking.models.Profile;

import java.util.ArrayList;
import java.util.List;

public class ProfileRepository {
    public List<Profile> getSampleProfiles() {
        List<Profile> profiles = new ArrayList<>();
        profiles.add(new Profile("1", "John Doe", "john@example.com"));
        profiles.add(new Profile("2", "Jane Doe", "jane@example.com"));
        return profiles;
    }
}

