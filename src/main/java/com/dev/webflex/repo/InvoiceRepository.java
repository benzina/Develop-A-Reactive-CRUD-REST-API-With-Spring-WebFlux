package com.dev.webflex.repo;

import com.dev.webflex.entity.Invoice;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface InvoiceRepository extends ReactiveMongoRepository<Invoice,Integer> {
}
