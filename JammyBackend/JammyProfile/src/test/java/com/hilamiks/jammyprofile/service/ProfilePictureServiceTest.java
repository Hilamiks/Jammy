package com.hilamiks.jammyprofile.service;

import com.hilamiks.jammyprofile.wrappers.ProfilePicture;
import com.hilamiks.jammyprofile.wrappers.ProfilePicturePath;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ProfilePictureServiceTest {

    ProfilePictureService profilePictureService = new ProfilePictureService();

    @Test
    public void stubTest() {
        //given

        //when
        ProfilePicture pp = profilePictureService
            .getProfilePictureFromPath(ProfilePicturePath.of(""));
        //then
        Assertions.assertNull(pp);
    }

    @Test
    public void stubTest2() {
        //given

        //when
        ProfilePicture pp = profilePictureService
            .getProfilePictureFromPath(ProfilePicturePath.of("asdf"));
        //then
        Assertions.assertNull(pp);
    }

    @Test
    public void stubTest3() {
        //given

        //when
        ProfilePicture pp = profilePictureService
            .getProfilePictureFromPath(ProfilePicturePath.of(null));
        //then
        Assertions.assertNull(pp);
    }

}