package com.cure.connects.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cure.connects.model.RegisterInfo;

public interface CureConnectRepository extends JpaRepository<RegisterInfo,String>
{

}
