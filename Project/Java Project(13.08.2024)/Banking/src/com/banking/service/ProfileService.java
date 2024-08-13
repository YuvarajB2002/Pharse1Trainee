package com.banking.service;

import com.banking.impl.ProfileImpl;
import com.banking.models.Profile;
import com.banking.repository.ProfileRepository;

import java.util.List;

public class ProfileService {
    public void manageProfiles() {
        ProfileImpl profileImpl = new ProfileImpl();
        ProfileRepository profileRepository = new ProfileRepository();

        // Add all profiles
        List<Profile> profiles = profileRepository.getSampleProfiles();
        profileImpl.addAllProfiles(profiles);

        // Read a profile
        Profile profile = profileImpl.getProfile("1");
        System.out.println("Profile Name: " + profile.getName());

        // Update a profile
        profile.setName("John Smith");
        profileImpl.updateProfile("1", profile);

        // Delete a profile
        profileImpl.deleteProfile("2");
    }
}

