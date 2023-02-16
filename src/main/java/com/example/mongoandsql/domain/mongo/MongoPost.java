package com.example.mongoandsql.domain.mongo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import javax.persistence.Transient;

@Getter
@Builder
@Document("mongoPost")
public class MongoPost {

    @Transient
    public static final String SEQUENCE_NAME = "post_sequence";

    @Id
    private Long id;

    private Long userSeq;

    private String contents;
}
