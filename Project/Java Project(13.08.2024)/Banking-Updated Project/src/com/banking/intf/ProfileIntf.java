package com.banking.intf;

import com.banking.models.Profile;

/**
 * Interface for Profile operations.
 * Defines methods for CRUD operations related to Profile.
 */
public interface ProfileIntf {
    void createProfile(Profile profile);
    Profile getProfileById(String profileId);
    void updateProfile(Profile profile);
    void deleteProfile(String profileId);
}
