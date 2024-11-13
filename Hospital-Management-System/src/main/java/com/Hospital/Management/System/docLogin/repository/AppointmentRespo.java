package com.Hospital.Management.System.docLogin.repository;

import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository;

import com.Hospital.Management.System.docLogin.entity.Appointment;

@Repository
public interface AppointmentRespo extends JpaRepository<Appointment, Long>{

}
