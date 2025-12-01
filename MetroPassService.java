package com.codegnan.metrotrainpass.service;

import java.util.List;

import com.codegnan.metrotrainpass.exceptions.MetroPassNotFoundException;
import com.codegnan.metrotrainpass.model.MetroPass;


// Service layer interface containing business methods.
// It hides the implementation from the controller.

public interface MetroPassService {

    void addPass(MetroPass pass);
    List<MetroPass> getAllPasses();
    MetroPass getPassById(int id) throws MetroPassNotFoundException;
    MetroPass updatePass(MetroPass pass) throws MetroPassNotFoundException;
    void deletePass(int id) throws MetroPassNotFoundException;
}
