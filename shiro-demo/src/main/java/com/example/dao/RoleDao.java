package com.example.dao;

import com.example.model.SysRole;
import org.springframework.data.repository.CrudRepository;

public interface RoleDao extends CrudRepository<SysRole,Integer> {

}
