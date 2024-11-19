package com.example.directdemocracy.service;

import com.example.directdemocracy.dao.ReferendumDAO;
import com.example.directdemocracy.model.Referendum;

import java.util.List;

public class ReferendumService {
    private ReferendumDAO referendumDAO;

    public ReferendumService() {
        this.referendumDAO = new ReferendumDAO();
    }

    public List<Referendum> getAllReferendums() {
        return referendumDAO.getAllReferendums();
    }

    public boolean createReferendum(Referendum referendum) {
        return referendumDAO.insertReferendum(referendum);
    }
}
