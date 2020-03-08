package org.996fly.staffshare.dao;

import org.996fly.staffshare.model.Po.Contract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractRepository extends JpaRepository<Contract, String> {

    Contract findByName(String name);

}
