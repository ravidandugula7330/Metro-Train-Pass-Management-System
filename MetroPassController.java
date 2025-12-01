package com.codegnan.metrotrainpass.controller;

import java.util.List;

import com.codegnan.metrotrainpass.exceptions.MetroPassNotFoundException;
import com.codegnan.metrotrainpass.model.MetroPass;
import com.codegnan.metrotrainpass.service.MetroPassService;
import com.codegnan.metrotrainpass.service.MetroPassServiceImpl;


// Controller (main class) used for testing the whole CRUD application.
// Creates sample pass records, displays, updates and deletes them.

public class MetroPassController {

    public static void main(String[] args) {

        MetroPassService service = new MetroPassServiceImpl();

        // Adding new Metro Passes
        service.addPass(new MetroPass(1, "Ravi", "Weekly", "7 Days", "PENDING"));
        service.addPass(new MetroPass(2, "Surya", "Monthly", "30 Days", "PENDING"));
        service.addPass(new MetroPass(3, "Sravya", "Quarterly", "90 Days", "PENDING"));

        System.out.println("Metro Passes Added Successfully\n");
        System.out.println("------- All Metro Pass Records -------");

        List<MetroPass> passList = service.getAllPasses();
        for (MetroPass pass : passList) {
            System.out.println(pass);
        }

        // Fetching by ID
        System.out.println("\nFetching Pass with ID 2");
        try {
            System.out.println(service.getPassById(2));
        } catch (MetroPassNotFoundException e) {
            e.printStackTrace();
        }

        // Updating - approving pass with ID 1
        System.out.println("\nApproving Pass with ID 1");
        try {
            MetroPass updated = service.updatePass(new MetroPass(1, "Ravi", "Weekly", "7 Days", "APPROVED"));
            System.out.println("Updated Record: " + updated);
        } catch (MetroPassNotFoundException e) {
            e.printStackTrace();
        }

        // Deleting pass with ID 3
        System.out.println("\nDeleting Pass with ID 3");
        try {
            service.deletePass(3);
            System.out.println("Pass deleted successfully");
        } catch (MetroPassNotFoundException e) {
            e.printStackTrace();
        }

        // Printing final record after operations
        System.out.println("\n------- Final Metro Pass List -------");
        passList = service.getAllPasses();
        for (MetroPass pass : passList) {
            System.out.println(pass);
        }
    }
}
