package com.hilamiks.jammyprofile.wrappers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Instrument {
    private String instrument;
    public String get() {
        return instrument;
    }
}
