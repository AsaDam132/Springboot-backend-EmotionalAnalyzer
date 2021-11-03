package com.ISSLEmotionalAnalyzer.ISSLEmotionalAnalyzer.services;

import com.ISSLEmotionalAnalyzer.ISSLEmotionalAnalyzer.models.ISSLStaff;
import com.ISSLEmotionalAnalyzer.ISSLEmotionalAnalyzer.repositories.ISSLStaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ISSLStaffServices {
    @Autowired
    ISSLStaffRepository isslStaffRepository;


    public ISSLStaff addStaff(ISSLStaff isslStaff){

        isslStaff.setStaffCode(UUID.randomUUID().toString());

        return isslStaffRepository.save(isslStaff);
    }

    public List<ISSLStaff> findAllStaff(){
        return  isslStaffRepository.findAll();
    }
    public ISSLStaff updateAllStaff(ISSLStaff isslStaff){

        return isslStaffRepository.save(isslStaff);

    }
    public  ISSLStaff findStaffById(Long id){

        return isslStaffRepository.findById(id).get();
    }


    public  void deleteStaff(Long id){

        isslStaffRepository.deleteById(id);
    }
}

