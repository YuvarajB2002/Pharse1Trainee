package com.banking.repository;

import com.banking.models.Profile;
import java.util.*;

/**
 * Repository for managing Profile data.
 */
public class ProfileRepository {
    private Map<String, Profile> profileMap = new HashMap<>();

    // Adds a new profile to the repository
    public void addProfile(Profile profile) {
        profileMap.put(profile.getProfileId(), profile);
    }

    // Retrieves a profile by its ID
    public Profile getProfileById(String profileId) {
        return profileMap.get(profileId);
    }

    // Updates an existing profile
    public void updateProfile(Profile profile) {
        profileMap.put(profile.getProfileId(), profile);
    }

    // Deletes a profile by its ID
    public void deleteProfile(String profileId) {
        profileMap.remove(profileId);
    }

    // Retrieves all profiles
    public Collection<Profile> getAllProfiles() {
        return profileMap.values();
    }
}
