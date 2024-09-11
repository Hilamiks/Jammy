package com.hilamiks.jammyprofile.repository;

import com.hilamiks.jammyprofile.entity.Profile;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class ProfileRepositoryTest {

    ProfileRepository profileRepository = new ProfileRepository();

    @Test
    public void testStub() {
        //given
        int page = 0;
        int size = 10;
        //when
        List<Profile> profileList= profileRepository.findAll(page, size);
        //then
        Assertions.assertEquals(size, profileList.size());
    }

}