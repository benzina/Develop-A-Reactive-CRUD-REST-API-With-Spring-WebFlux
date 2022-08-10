package com.dev.webflex.service.impl;

import com.dev.webflex.entity.Invoice;
import com.dev.webflex.repo.InvoiceRepository;
import com.dev.webflex.service.IInvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class InvoiceServiceImpl implements IInvoiceService {
    @Autowired
    private InvoiceRepository invoiceRepository;

    @Override
    public Mono<Invoice> saveInvoice(Invoice invoice) {
        return invoiceRepository.save(invoice);
    }

    @Override
    public Flux<Invoice> findAllInvoices() {
        return invoiceRepository.findAll().switchIfEmpty(Flux.empty());
    }

    @Override
    public Mono<Invoice> getOneInvoice(Integer id) {
        return invoiceRepository.findById(id).switchIfEmpty(Mono.empty());
    }

    @Override
    public Mono<Void> deleteInvoice(Integer id) {
        return invoiceRepository.deleteById(id);
    }
}
