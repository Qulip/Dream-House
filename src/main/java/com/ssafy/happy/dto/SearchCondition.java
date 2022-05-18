package com.ssafy.happy.dto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
public class SearchCondition {
    // 한 페이지에 몇개나 보여줄 것인지 결정한다.
    public final int countPerPage = 10;

    // 검색 컬럼으로 기본인 none은 검색하지 않는다. ex) isbn
    private String key = "none";

    // 검색어: ex: 111-222-3333
    private String word;

    // 검색 결과를 정렬할 컬럼 이름으로 기본인 none은 정렬하지 않는다., ex)author
    private String orderBy = "none";

    // 정렬 방향으로 기본은 asc
    private String orderByDir = "asc";

    // 현재 페이지 번호로 offset을 계산할 때 사용된다. 기본 페이지는 1이다.
    private int currentPage = 1;

    private boolean limit = true;

    public SearchCondition(String key, String word) {
        this(key, word, "none");
    }

    public SearchCondition(String key, String word, String orderBy) {
        this(key, word, orderBy, "asc");
    }

    public SearchCondition(String key, String word, String orderBy, String orderByDir) {
        this(key, word, orderBy, orderByDir, 1);
    }

    public SearchCondition(String key, String word, String orderBy, String orderByDir, int currentPage) {
        this.key = key;
        this.word = word;
        this.orderBy = orderBy;
        this.orderByDir = orderByDir;
        this.currentPage = currentPage;
    }
}