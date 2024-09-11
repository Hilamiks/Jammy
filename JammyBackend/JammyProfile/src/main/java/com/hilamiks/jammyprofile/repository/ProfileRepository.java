package com.hilamiks.jammyprofile.repository;

import com.hilamiks.jammyprofile.entity.Profile;
import com.hilamiks.jammyprofile.wrappers.Instrument;
import com.hilamiks.jammyprofile.wrappers.ProfileId;
import com.hilamiks.jammyprofile.wrappers.Username;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class ProfileRepository {
    public List<Profile> findAll(int page, int size) {
        ArrayList<Profile> profiles = new ArrayList<Profile>();
        for (int i = 0; i < size; i++) {
            Profile profile = Profile.builder()
                .id(ProfileId.with(UUID.randomUUID().toString()))
                .profilePicture(null)
                .instrument(new Instrument("Guitar"))
                .username(Username.of("User" + i))
                .build();
            profiles.add(profile);
        }
        return profiles;
    }
}
