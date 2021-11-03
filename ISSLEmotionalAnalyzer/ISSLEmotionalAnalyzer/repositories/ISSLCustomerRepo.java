package com.ISSLEmotionalAnalyzer.ISSLEmotionalAnalyzer.repositories;

import com.ISSLEmotionalAnalyzer.ISSLEmotionalAnalyzer.models.ISSLCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISSLCustomerRepo extends JpaRepository<ISSLCustomer,Long> {
}
