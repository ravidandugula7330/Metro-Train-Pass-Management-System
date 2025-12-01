package com.codegnan.metrotrainpass.service;

import java.util.List;

import com.codegnan.metrotrainpass.dao.MetroPassDao;
import com.codegnan.metrotrainpass.dao.MetroPassDaoImpl;
import com.codegnan.metrotrainpass.exceptions.MetroPassNotFoundException;
import com.codegnan.metrotrainpass.model.MetroPass;


// Service implementation class that calls DAO layer.
// Business logic / validation can be added here if needed.

public class MetroPassServiceImpl implements MetroPassService {

    // Service communicates with DAO
    MetroPassDao dao = new MetroPassDaoImpl();

    @Override
    public void addPass(MetroPass pass) {
        dao.save(pass);
    }

    @Override
    public List<MetroPass> getAllPasses() {
        return dao.findAll();
    }

    @Override
    public MetroPass getPassById(int id) throws MetroPassNotFoundException {
        return dao.findById(id);
    }

    @Override
    public MetroPass updatePass(MetroPass pass) throws MetroPassNotFoundException {
        return dao.update(pass);
    }

    @Override
    public void deletePass(int id) throws MetroPassNotFoundException {
        dao.deleteById(id);
    }
}
