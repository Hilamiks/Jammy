package com.hilamiks.jammyprofile.service;

import com.hilamiks.jammyprofile.entity.Profile;
import com.hilamiks.jammyprofile.repository.ProfileRepository;
import com.hilamiks.jammyprofile.util.PageResponse;
import com.hilamiks.jammyprofile.util.ProfileDto;
import com.hilamiks.jammyprofile.util.ProfileMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProfileService {

    private final ProfileRepository profileRepository;
    private final ProfileMapper profileMapper;

    public PageResponse<ProfileDto> findAllProfiles(int page, int size) {
        List<Profile> profiles = profileRepository.findAll(page, size);
        List<ProfileDto> profileDtos = profiles.stream()
            .map(profileMapper::toProfileDto)
            .toList();
        return PageResponse.<ProfileDto>builder()
            .elements(profileDtos)
            .isFirst(page == 0)
            .isLast(false)
            .pageNumber(page)
            .pageSize(size)
            .totalElements(profileDtos.size())
            .totalPages(30)
            .build();
    }

}
