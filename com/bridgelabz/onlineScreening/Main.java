package com.bridgelabz.onlineScreening;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create candidates for different job roles
        SoftwareEngineer candidate1 = new SoftwareEngineer("Ankur");
        DataScientist candidate2 = new DataScientist("Pritish");
        ProductManager candidate3 = new ProductManager("Sakshi");

        // Create resume processing system for different job roles
        Resume<SoftwareEngineer> softwareResumes = new Resume<>();
        Resume<DataScientist> dataResumes = new Resume<>();
        Resume<ProductManager> pmResumes = new Resume<>();

        // Add resumes to their respective processing systems
        softwareResumes.addResume(candidate1);
        dataResumes.addResume(candidate2);
        pmResumes.addResume(candidate3);

        // Display individual processing queues
        System.out.println("Resume for Software Engineer");
        softwareResumes.displayResumes();
        System.out.println("\nResume for Data Scientist");
        dataResumes.displayResumes();
        System.out.println("\nResume for Product Manager");
        pmResumes.displayResumes();

        // Combine all resumes into a single list for AI screening
        List<JobRole> allResumes = new ArrayList<>();
        allResumes.add(candidate1);
        allResumes.add(candidate2);
        allResumes.add(candidate3);

        // AI-driven screening process
        ResumeScreening.screenResumes(allResumes);
    }
}
