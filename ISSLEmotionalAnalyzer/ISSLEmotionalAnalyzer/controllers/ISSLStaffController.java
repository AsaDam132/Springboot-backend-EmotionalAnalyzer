package com.ISSLEmotionalAnalyzer.ISSLEmotionalAnalyzer.controllers;

import com.ISSLEmotionalAnalyzer.ISSLEmotionalAnalyzer.models.ISSLStaff;
import com.ISSLEmotionalAnalyzer.ISSLEmotionalAnalyzer.services.ISSLStaffServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/staff")

public class ISSLStaffController {

    ISSLStaffServices isslStaffServices = new ISSLStaffServices();


          @GetMapping("/allstaff")
        public ResponseEntity<List<ISSLStaff>> getAllStaff () {
            List<ISSLStaff> employees = isslStaffServices.findAllStaff();
            return new ResponseEntity<>(employees, HttpStatus.OK);
        }

        @GetMapping("/findstaff/{id}")
        public ResponseEntity<ISSLStaff> getEmployeeById (@PathVariable("id") Long id) {
            ISSLStaff staff = isslStaffServices.findStaffById(id);
            return new ResponseEntity<>(staff, HttpStatus.OK);
        }

        @PostMapping("/addstaff")
        public ResponseEntity<ISSLStaff> addEmployee(@RequestBody ISSLStaff isslStaff) {
            ISSLStaff newStaff = isslStaffServices.addStaff(isslStaff);
            return new ResponseEntity<>(newStaff, HttpStatus.CREATED);
        }

        @PutMapping("/updatestaff")
        public ResponseEntity<ISSLStaff> updateStaff(@RequestBody ISSLStaff isslStaff) {
            ISSLStaff updateStaff = isslStaffServices.updateAllStaff(isslStaff);
            return new ResponseEntity<>(updateStaff, HttpStatus.OK);
        }

        @DeleteMapping("/deletestaff/{id}")
        public ResponseEntity<?> deleteStaff(@PathVariable("id") Long id) {
            isslStaffServices.deleteStaff(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }



