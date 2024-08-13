package com.banking.intf;

import java.util.List;

import com.banking.models.Profile;

public interface ProfileIntf {
    void addProfile(Profile profile);
    void addAllProfiles(List<Profile> profiles);
    Profile getProfile(String id);
    void updateProfile(String id, Profile profile);
    void deleteProfile(String id);
}


