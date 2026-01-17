package com.example.excel;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaonRepo extends ListCrudRepository<Loan,Long> {
}
