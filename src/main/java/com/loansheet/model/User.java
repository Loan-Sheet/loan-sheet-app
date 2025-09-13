package com.loansheet.model;

import com.google.cloud.firestore.annotation.DocumentId;
import com.google.cloud.spring.data.firestore.Document;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collectionName = "users")
public class User {
    @DocumentId
    private String id;
    private String name;
    private String email;
}
