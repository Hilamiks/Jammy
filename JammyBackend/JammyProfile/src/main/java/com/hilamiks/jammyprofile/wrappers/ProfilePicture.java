package com.hilamiks.jammyprofile.wrappers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProfilePicture {
    private String path;
    public String get() {
        return path;
    }
}
