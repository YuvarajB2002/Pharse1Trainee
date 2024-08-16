package com.banking.service;

import com.banking.intf.ProfileIntf;
import com.banking.models.Profile;

/**
 * Service class for managing profiles.
 * Handles business logic related to Profile operations.
 */
public class ProfileService {
    private ProfileIntf profileIntf;

    public ProfileService(ProfileIntf profileIntf) {
        this.profileIntf = profileIntf;
    }

    public void createProfile(Profile profile) {
        profileIntf.createProfile(profile);
    }

    public Profile getProfileById(String profileId) {
        return profileIntf.getProfileById(profileId);
    }

    public void updateProfile(Profile profile) {
        profileIntf.updateProfile(profile);
    }

    public void deleteProfile(String profileId) {
        profileIntf.deleteProfile(profileId);
    }
}
