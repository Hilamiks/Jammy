package com.hilamiks.jammyprofile.wrappers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProfileId {
    private String profileId;
    public static ProfileId of(String profileId) {
        return new ProfileId(profileId);
    }
}
