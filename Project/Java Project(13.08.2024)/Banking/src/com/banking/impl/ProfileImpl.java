package com.banking.impl;

import com.banking.intf.ProfileIntf;
import com.banking.models.Profile;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProfileImpl implements ProfileIntf {
    private Map<String, Profile> profiles = new HashMap<>();

    @Override
    public void addProfile(Profile profile) {
        profiles.put(profile.getId(), profile);
    }

    @Override
    public void addAllProfiles(List<Profile> profilesList) {
        for (Profile profile : profilesList) {
            profiles.put(profile.getId(), profile);
        }
    }

    @Override
    public Profile getProfile(String id) {
        return profiles.get(id);
    }

    @Override
    public void updateProfile(String id, Profile profile) {
        profiles.put(id, profile);
    }

    @Override
    public void deleteProfile(String id) {
        profiles.remove(id);
    }
}

