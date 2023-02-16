package com.example.mongoandsql.domain.mongo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document(collection = "database_sequences")
@Getter
@Setter
public class DatabaseSequence {
    @Id
    private String id;
    private Long seq;
}
