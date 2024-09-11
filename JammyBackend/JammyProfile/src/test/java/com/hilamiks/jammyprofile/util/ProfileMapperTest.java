package com.hilamiks.jammyprofile.util;

import com.hilamiks.jammyprofile.entity.Profile;
import com.hilamiks.jammyprofile.service.ProfilePictureService;
import com.hilamiks.jammyprofile.wrappers.Instrument;
import com.hilamiks.jammyprofile.wrappers.ProfileId;
import com.hilamiks.jammyprofile.wrappers.Username;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.UUID;

@ExtendWith(MockitoExtension.class)
class ProfileMapperTest {

    @Mock
    ProfilePictureService profilePictureService;

    @InjectMocks
    ProfileMapper mapper;

    @Test
    @DisplayName("When converting profile to DTO without picture fields should be equal")
    public void success() {
        //given
        ProfileId id = ProfileId.of(UUID.randomUUID().toString());
        Username username = new Username("John Doe");
        Instrument instrument = new Instrument("Guitar");
        Profile profile = Profile.builder()
            .profileId(id)
            .profilePicturePath(null)
            .username(username)
            .instrument(instrument)
            .build();
        Mockito.doReturn(null).when(profilePictureService).getProfilePictureFromPath(Mockito.any());
        //when
        ProfileDto dto = mapper.toProfileDto(profile);

        //then
        Assertions.assertNotNull(dto);
        Assertions.assertEquals(dto.getProfileId(), profile.getProfileId());
        Assertions.assertEquals(dto.getUsername(), profile.getUsername());
        Assertions.assertEquals(dto.getInstrument(), profile.getInstrument());
    }

}