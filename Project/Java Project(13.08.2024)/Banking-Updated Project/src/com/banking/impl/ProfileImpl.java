package com.banking.impl;

import com.banking.intf.ProfileIntf;
import com.banking.models.Profile;
import com.banking.repository.ProfileRepository;

/**
 * Implementation of ProfileIntf using ProfileRepository for data storage.
 */
public class ProfileImpl implements ProfileIntf {
    private ProfileRepository profileRepository = new ProfileRepository();

    @Override
    public void createProfile(Profile profile) {
        profileRepository.addProfile(profile);
    }

    @Override
    public Profile getProfileById(String profileId) {
        return profileRepository.getProfileById(profileId);
    }

    @Override
    public void updateProfile(Profile profile) {
        profileRepository.updateProfile(profile);
    }

    @Override
    public void deleteProfile(String profileId) {
        profileRepository.deleteProfile(profileId);
    }
}
