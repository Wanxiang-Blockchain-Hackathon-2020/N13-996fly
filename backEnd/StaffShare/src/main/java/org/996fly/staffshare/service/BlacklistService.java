package org.996fly.staffshare.service;

import org.996fly.staffshare.dao.BlacklistRepository;
import org.996fly.staffshare.model.Po.Blacklist;
import org.996fly.staffshare.utils.SuperResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class BlacklistService {

    @Autowired
    BlacklistRepository blacklistRepository;

    public SuperResult addBlacklist(String weid, String description) {
        Blacklist blackList = blacklistRepository.save(new Blacklist(weid, description));
        if (blackList == null) {
            return SuperResult.fail();
        }
        return SuperResult.ok();
    }

    public SuperResult findBlacklistByWeid(String weid) {
        List<Blacklist> list = blacklistRepository.findBlackListsByWeid(weid);
        return SuperResult.ok(list);
    }


    public SuperResult getBlacklist() {
        List<Blacklist> all = blacklistRepository.findAll();
        return SuperResult.ok(all);
    }

}
