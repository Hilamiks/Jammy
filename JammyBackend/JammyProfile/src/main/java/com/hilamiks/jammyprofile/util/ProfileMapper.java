package com.hilamiks.jammyprofile.util;

import com.hilamiks.jammyprofile.entity.Profile;
import org.springframework.stereotype.Service;

@Service
public class ProfileMapper {

    public ProfileDto toProfileDto(Profile profile) {
        return ProfileDto.builder()
            .id(profile.getId())
            .profilePicture(profile.getProfilePicture())
            .instrument(profile.getInstrument())
            .username(profile.getUsername())
            .build();
    }

}
