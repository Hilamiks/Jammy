package com.hilamiks.jammyprofile.wrappers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.UUID;

class ProfileIdTest {

    @Test
    @DisplayName("Creating profile id using \"with\" should yield correct id")
    public void getSuccess() {
        //given
        String id = UUID.randomUUID().toString();
        ProfileId profileId = ProfileId.of(id);
        //when
        String extractedId = profileId.getProfileId();
        //then
        Assertions.assertNotNull(extractedId);
        Assertions.assertEquals(id, extractedId);
    }

}