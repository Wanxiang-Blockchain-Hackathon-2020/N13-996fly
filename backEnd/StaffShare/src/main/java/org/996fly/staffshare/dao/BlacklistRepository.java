package org.996fly.staffshare.dao;

import org.996fly.staffshare.model.Po.Blacklist;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BlacklistRepository extends JpaRepository<Blacklist, Long> {
    List<Blacklist> findBlackListsByWeid(String weid);
}
