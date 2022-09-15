package com.ameda.kevin.awsimageupload.profile;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.ameda.kevin.awsimageupload.datastore.*;

@Repository
public class UserProfileDataAccessService {
    private final UserProfileDataStore UserProfileDataStore;

    @Autowired
    public UserProfileDataAccessService(UserProfileDataStore UserProfileDataStore) {
        this.UserProfileDataStore = UserProfileDataStore;
    }

    public List<UserProfile> getUserProfiles() {
        return UserProfileDataStore.getUserProfiles();
    }
}
