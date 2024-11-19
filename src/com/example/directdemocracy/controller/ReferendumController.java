package com.example.directdemocracy.controller;

import com.example.directdemocracy.model.Referendum;
import com.example.directdemocracy.service.ReferendumService;

import java.util.List;

public class ReferendumController {
    private ReferendumService referendumService;

    public ReferendumController() {
        this.referendumService = new ReferendumService();
    }

    public List<Referendum> getReferendums() {
        return referendumService.getAllReferendums();
    }

    public boolean createReferendum(String title, String description) {
        Referendum referendum = new Referendum();
        referendum.setTitle(title);
        referendum.setDescription(description);
        return referendumService.createReferendum(referendum);
    }
}
