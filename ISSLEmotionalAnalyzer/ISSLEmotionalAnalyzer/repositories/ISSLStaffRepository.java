package com.ISSLEmotionalAnalyzer.ISSLEmotionalAnalyzer.repositories;

import com.ISSLEmotionalAnalyzer.ISSLEmotionalAnalyzer.models.ISSLStaff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISSLStaffRepository extends JpaRepository<ISSLStaff,Long> {

}
