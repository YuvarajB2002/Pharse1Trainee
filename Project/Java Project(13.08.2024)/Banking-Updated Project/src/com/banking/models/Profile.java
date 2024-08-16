package com.banking.models;

/**
 * Represents a user profile in the banking system.
 */
public class Profile {
    private String profileId;
    private String name;
    private String email;

    // Constructor
    public Profile(String profileId, String name, String email) {
        this.profileId = profileId;
        this.name = name;
        this.email = email;
    }

    // Getters and Setters
    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Profile{" +
               "profileId='" + profileId + '\'' +
               ", name='" + name + '\'' +
               ", email='" + email + '\'' +
               '}';
    }
}
