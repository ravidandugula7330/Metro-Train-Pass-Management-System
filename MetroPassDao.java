package com.codegnan.metrotrainpass.dao;

import java.util.List;

import com.codegnan.metrotrainpass.exceptions.MetroPassNotFoundException;
import com.codegnan.metrotrainpass.model.MetroPass;

/*
  MetroPassDao declares the standard CRUD operations
  that need to be implemented for MetroPass entity.
 */
public interface MetroPassDao {

    void save(MetroPass pass);  // CREATE
    List<MetroPass> findAll();  // READ (all)
    MetroPass findById(int id) throws MetroPassNotFoundException; // READ by ID
    MetroPass update(MetroPass pass) throws MetroPassNotFoundException; // UPDATE
    void deleteById(int id) throws MetroPassNotFoundException; // DELETE
}
