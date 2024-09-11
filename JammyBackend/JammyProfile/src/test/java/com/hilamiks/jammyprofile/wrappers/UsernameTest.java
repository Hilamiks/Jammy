package com.hilamiks.jammyprofile.wrappers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UsernameTest {

    @Test
    public void success() {
        //given
        String username = "JohnDoe";
        //when
        Username usernameWrapper = Username.of(username);
        //then
        Assertions.assertNotNull(usernameWrapper.getUsername());
        Assertions.assertEquals(usernameWrapper.getUsername(), username);
    }

}