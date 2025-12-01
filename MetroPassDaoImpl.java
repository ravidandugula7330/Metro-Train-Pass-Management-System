package com.codegnan.metrotrainpass.dao;

import java.util.ArrayList;
import java.util.List;

import com.codegnan.metrotrainpass.exceptions.MetroPassNotFoundException;
import com.codegnan.metrotrainpass.model.MetroPass;

/*
  MetroPassDaoImpl implements MetroPassDao interface using an ArrayList
  to store MetroPass objects — this acts as an in-memory database.
 */

public class MetroPassDaoImpl implements MetroPassDao {

    // Acts as database table
    List<MetroPass> passList = new ArrayList<>();

    @Override
    public void save(MetroPass pass) {
        passList.add(pass);  // Add new pass to list
    }

    @Override
    public List<MetroPass> findAll() {
        return passList; // Return full records
    }

    @Override
    public MetroPass findById(int id) throws MetroPassNotFoundException {
        for (MetroPass p : passList) {
            if (p.getPassId() == id) {
                return p;  // Found
            }
        }
        throw new MetroPassNotFoundException("Pass with ID " + id + " Not Found");
    }

    @Override
    public MetroPass update(MetroPass updatedPass) throws MetroPassNotFoundException {
        for (int i = 0; i < passList.size(); i++) {
            if (passList.get(i).getPassId() == updatedPass.getPassId()) {
                passList.set(i, updatedPass); // Replace old record with new one
                return updatedPass;
            }
        }
        throw new MetroPassNotFoundException("Pass with ID " + updatedPass.getPassId() + " Not Found — cannot update");
    }

    @Override
    public void deleteById(int id) throws MetroPassNotFoundException {
        boolean removed = false;
        for (int i = 0; i < passList.size(); i++) {
            if (passList.get(i).getPassId() == id) {
                passList.remove(i); // Remove record from list
                removed = true;
                break;
            }
        }
        if (!removed) {
            throw new MetroPassNotFoundException("Pass with ID " + id + " Not Found — cannot delete");
        }
    }
}
