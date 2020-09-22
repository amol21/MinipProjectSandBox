package com.contactapp.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.contactapp.entity.ContactEntity;
public interface ContactDtlsRepository extends JpaRepository<ContactEntity, Serializable>{

}
