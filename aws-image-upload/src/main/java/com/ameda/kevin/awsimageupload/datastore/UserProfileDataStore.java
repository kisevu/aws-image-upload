package com.ameda.kevin.awsimageupload.datastore;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.ameda.kevin.awsimageupload.profile.UserProfile;

@Repository
public class UserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();
    static {
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(),
                "kevin", null));
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(),
                "paul", null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}