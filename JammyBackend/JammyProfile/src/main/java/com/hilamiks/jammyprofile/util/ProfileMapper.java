package com.hilamiks.jammyprofile.util;

import com.hilamiks.jammyprofile.entity.Profile;
import com.hilamiks.jammyprofile.service.ProfilePictureService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProfileMapper {

    private final ProfilePictureService profilePictureService;

    public ProfileDto toProfileDto(Profile profile) {
        return ProfileDto.builder()
            .profileId(profile.getProfileId())
            .profilePicture(profilePictureService.getProfilePictureFromPath(profile.getProfilePicturePath()))
            .instrument(profile.getInstrument())
            .username(profile.getUsername())
            .build();
    }

}
