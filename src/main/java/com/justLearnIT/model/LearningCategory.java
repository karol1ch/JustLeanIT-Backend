package com.justLearnIT.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LearningCategory {
    String name;
    String description;
}
