package com.hilamiks.jammyprofile.wrappers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Username {
    private String username;
    public static Username of(String username) {
        return new Username(username);
    }
    public String get() {
        return username;
    }
}
