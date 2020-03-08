package org.996fly.staffshare.dao;

import org.996fly.staffshare.model.Po.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, String> {

    List<User> findUsersByRole(int role);

}
