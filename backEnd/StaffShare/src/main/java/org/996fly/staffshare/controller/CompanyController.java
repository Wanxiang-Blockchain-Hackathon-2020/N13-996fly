package org.996fly.staffshare.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.github.fge.jackson.JsonLoader;
import org.996fly.staffshare.dao.BlacklistRepository;
import org.996fly.staffshare.model.Po.Blacklist;
import org.996fly.staffshare.service.BlacklistService;
import org.996fly.staffshare.utils.SuperResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
public class CompanyController {

    @Autowired
    BlacklistRepository blacklistRepository;

    BlacklistService blacklistService = new BlacklistService();

    @RequestMapping(value = "/company/addBlacklist", method = RequestMethod.POST)
    public SuperResult addBlacklist(@RequestBody String jsonStr) {
        try {
            JsonNode jsonNode = JsonLoader.fromString(jsonStr);
            String weid = "", description = "";
            JsonNode weidNode = jsonNode.get("weid");
            JsonNode descriptionNode = jsonNode.get("description");
            if (weidNode != null && descriptionNode != null) {
                weid = weidNode.textValue();
                description = descriptionNode.textValue();
                blacklistService.addBlacklist(weid, description);
            } else {
                return SuperResult.fail();
            }
            return SuperResult.ok();
        } catch (Exception e) {
            return SuperResult.fail();
        }
    }

    @RequestMapping(value = "/company/getBlacklist", method = RequestMethod.GET)
    public SuperResult getBlacklist() {
        return SuperResult.ok(blacklistRepository.findAll());
//        return blacklistService.getBlacklist();
    }

    @RequestMapping(value = "/company/getBlacklistsByWeid", method = RequestMethod.POST)
    public SuperResult getBlacklistByWeid(@RequestBody String jsonStr) {
        SuperResult result = null;
        try {
            JsonNode jsonNode = JsonLoader.fromString(jsonStr);
            JsonNode weidNode = jsonNode.get("weid");
            if (weidNode != null) {
                List<Blacklist> list = blacklistRepository.findBlackListsByWeid(weidNode.textValue());
                result = SuperResult.ok(list);
            }
            return result;
        } catch (Exception e) {
            return SuperResult.fail();
        }
    }


}
