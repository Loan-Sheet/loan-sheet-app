package com.loansheet.repository;

import com.google.cloud.spring.data.firestore.FirestoreReactiveRepository;
import com.loansheet.model.User;

public interface UserRepository extends FirestoreReactiveRepository<User> {
}
