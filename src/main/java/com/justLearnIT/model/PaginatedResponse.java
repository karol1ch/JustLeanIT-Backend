package com.justLearnIT.model;

import java.util.Collections;
import java.util.List;

public class PaginatedResponse<T> {
    public static final int pageSize = 10;
    public List<T> list;
    public boolean hasMore;

    public PaginatedResponse(List<T> list, int pageNumber) {
        this.hasMore = list.size() >= (pageNumber + 1) * pageSize;
        if (hasMore)
            this.list = list.subList(pageNumber * pageSize, this.hasMore ? (pageNumber + 1) * pageSize : list.size());
        else
            this.list = Collections.emptyList();
    }
}
