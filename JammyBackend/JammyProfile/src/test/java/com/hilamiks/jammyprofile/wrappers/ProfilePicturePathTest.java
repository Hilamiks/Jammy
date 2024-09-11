package com.hilamiks.jammyprofile.wrappers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ProfilePicturePathTest {

    @Test
    @DisplayName("Getting path from ProfilePicturePath should yield correct path")
    public void success() {
        //given
        String path = "/resources";
        //when
        ProfilePicturePath ppp = ProfilePicturePath.of(path);
        //then
        Assertions.assertNotNull(ppp.get());
        Assertions.assertEquals(path, ppp.get());
    }

}