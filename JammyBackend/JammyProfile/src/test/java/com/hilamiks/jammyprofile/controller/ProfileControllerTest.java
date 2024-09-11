package com.hilamiks.jammyprofile.controller;

import com.hilamiks.jammyprofile.entity.Profile;
import com.hilamiks.jammyprofile.service.ProfileService;
import com.hilamiks.jammyprofile.util.PageResponse;
import com.hilamiks.jammyprofile.util.ProfileDto;
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
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.UUID;

@ExtendWith(MockitoExtension.class)
class ProfileControllerTest {

    @Mock
    ProfileService profileService;

    @InjectMocks
    ProfileController profileController;

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
        ProfileDto dto = ProfileDto.builder()
            .profileId(profile.getProfileId())
            .profilePicture(null)
            .instrument(profile.getInstrument())
            .username(profile.getUsername())
            .build();
        PageResponse<ProfileDto> pageResponse = PageResponse.<ProfileDto>builder()
            .elements(List.of(dto))
            .totalPages(1)
            .pageSize(1)
            .totalElements(1)
            .build();
        Mockito.when(profileService.findAllProfiles(0, 1))
            .thenReturn(pageResponse);
        //when
        ResponseEntity<PageResponse<ProfileDto>> entity = profileController.getAllProfiles(0, 1);
        //then
        Assertions.assertNotNull(entity.getBody());
        Assertions.assertEquals(1, entity.getBody().getElements().size());
    }

}