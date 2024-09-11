package com.hilamiks.jammyprofile.wrappers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProfilePicturePath {
    private String path;
    public String get() {
        return this.getPath();
    }
    public static ProfilePicturePath of(String path) {
        return new ProfilePicturePath(path);
    }
}
