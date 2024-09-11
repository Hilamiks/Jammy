package com.hilamiks.jammyprofile.service;

import com.hilamiks.jammyprofile.wrappers.ProfilePicture;
import com.hilamiks.jammyprofile.wrappers.ProfilePicturePath;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

@Service
public class ProfilePictureService {

    public ProfilePicture getProfilePictureFromPath(ProfilePicturePath path) {
        if (StringUtils.isNotBlank(path.get())) {
            return null;
        }
        return null;
    }

}
