package com.hilamiks.jammyprofile.service;

import com.hilamiks.jammyprofile.entity.Profile;
import com.hilamiks.jammyprofile.repository.ProfileRepository;
import com.hilamiks.jammyprofile.util.PageResponse;
import com.hilamiks.jammyprofile.util.ProfileDto;
import com.hilamiks.jammyprofile.util.ProfileMapper;
import com.hilamiks.jammyprofile.wrappers.Instrument;
import com.hilamiks.jammyprofile.wrappers.ProfileId;
import com.hilamiks.jammyprofile.wrappers.Username;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.UUID;

@ExtendWith(MockitoExtension.class)
class ProfileServiceTest {

    @Mock
    ProfileRepository profileRepository;

    @Mock
    ProfileMapper profileMapper;

    @InjectMocks
    ProfileService profileService;

    @Test
    public void test() {
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
        Mockito.when(profileRepository.findAll(Mockito.anyInt(), Mockito.anyInt()))
            .thenReturn(List.of(profile));
        ProfileDto dto = ProfileDto.builder()
            .profileId(profile.getProfileId())
            .profilePicture(null)
            .instrument(profile.getInstrument())
            .username(profile.getUsername())
            .build();
        Mockito.when(profileMapper.toProfileDto(Mockito.any()))
            .thenReturn(dto);
        //when
        PageResponse<ProfileDto> profileDtoPageResponse = profileService.findAllProfiles(0, 1);
        //then
        Assertions.assertNotNull(profileDtoPageResponse);
        Assertions.assertEquals(1, profileDtoPageResponse.getTotalElements());
        Assertions.assertFalse(profileDtoPageResponse.getElements().isEmpty());
        Assertions.assertEquals(profileDtoPageResponse.getElements().getFirst(), dto);
    }

}