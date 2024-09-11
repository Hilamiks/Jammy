package com.hilamiks.jammyprofile.controller;

import com.hilamiks.jammyprofile.service.ProfileService;
import com.hilamiks.jammyprofile.util.PageResponse;
import com.hilamiks.jammyprofile.util.ProfileDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/profiles")
public class ProfileController {

    private final ProfileService profileService;

    @GetMapping
    public ResponseEntity<PageResponse<ProfileDto>> getAllProfiles(
        @RequestParam(required = false, defaultValue = "0", name = "page") int page,
        @RequestParam(required = false, defaultValue = "10", name = "size") int size
    ) {
        return ResponseEntity.ok(profileService.findAllProfiles(page, size));
    }

}
