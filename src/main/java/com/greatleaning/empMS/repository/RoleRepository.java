package com.greatlearning.empMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.greatlearning.empMS.entity.Role;

public interface RoleRepository  extends JpaRepository<Role, Integer>{

}