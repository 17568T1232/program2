package com.Centum.Smartvault.repository;

import com.Centum.Smartvault.entity.Userdetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Userrepository extends JpaRepository<Userdetails,Integer> {

}
