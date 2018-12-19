package com.justLearnIT.model;

import java.util.Collections;
import java.util.List;

public class PaginatedResponse<T> {
    public static final int pageSize = 10;
    public List<T> list;
    public boolean hasMore;

    public PaginatedResponse(List<T> list, int pageNumber) {
        System.out.println("pageNumber=" + pageNumber + ", list.size()=" + list.size());

        int begin = pageNumber * pageSize;
        int end = Math.min((pageNumber + 1) * pageSize, list.size());
        if (begin < end) {
            this.hasMore = list.size() > end;
            this.list = list.subList(pageNumber * pageSize, end);
        } else {
            this.hasMore = false;
            this.list = Collections.emptyList();
        }
    }
}