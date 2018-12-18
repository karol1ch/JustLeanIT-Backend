package com.justLearnIT.model;

import java.util.List;

public class IncompletedResponse<T> {
    public List<T> list;
    public boolean isCompleted;

    public IncompletedResponse(List<T> list, boolean isCompleted) {
        this.list = list;
        this.isCompleted = isCompleted;
    }
}
