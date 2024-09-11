package com.hilamiks.jammyprofile.util;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class PageResponse<T> {
    List<T> elements;
    int pageNumber;
    int pageSize;
    int totalElements;
    boolean isFirst;
    boolean isLast;
    int totalPages;
}
