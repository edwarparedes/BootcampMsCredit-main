package com.bank.credit.repository;

import com.bank.credit.entity.Credit;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface ICreditRepository extends ReactiveMongoRepository<Credit, String> {
    Flux<Credit> findByClientId(String clientId);
}
