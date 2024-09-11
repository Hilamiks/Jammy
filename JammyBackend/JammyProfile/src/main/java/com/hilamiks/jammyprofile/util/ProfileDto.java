package com.hilamiks.jammyprofile.util;

import com.hilamiks.jammyprofile.wrappers.Instrument;
import com.hilamiks.jammyprofile.wrappers.ProfileId;
import com.hilamiks.jammyprofile.wrappers.ProfilePicture;
import com.hilamiks.jammyprofile.wrappers.Username;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ProfileDto {

    private ProfileId profileId;
    private Username username;
    private Instrument instrument;
    private ProfilePicture profilePicture;

}