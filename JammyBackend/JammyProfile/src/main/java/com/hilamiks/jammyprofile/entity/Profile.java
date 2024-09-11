package com.hilamiks.jammyprofile.entity;

import com.hilamiks.jammyprofile.wrappers.Instrument;
import com.hilamiks.jammyprofile.wrappers.ProfileId;
import com.hilamiks.jammyprofile.wrappers.ProfilePicturePath;
import com.hilamiks.jammyprofile.wrappers.Username;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Profile {

    private ProfileId id;
    private Username username;
    private Instrument instrument;
    private ProfilePicturePath profilePicturePath;

}
