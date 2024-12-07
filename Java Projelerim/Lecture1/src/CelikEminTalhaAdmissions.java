/***********************************************************************
@Title:    LastNameFirstNameAdmissions
@Purpose:  To get familiar with file IO and writing methods
@Author:   (your last first name)
@Date:     (today’s date)
@Version:  1.0
************************************************************************/

import java.io.*;
import java.util.*;

public class CelikEminTalhaAdmissions {

    public static void main(String[] args) throws IOException {
       
        Scanner scanner = new Scanner(System.in);

        System.out.println("SHSU Admissions Program");
        System.out.print("Please enter the name of the file that contains application records: ");
        String inputFileName = scanner.nextLine();

        // Ask the user for the name of the output file where results will be written
        System.out.print("Please enter the name of the file that should contain results: ");
        String outputFileName = scanner.nextLine();

        // Set up file readers and writers
        File inputFile = new File(inputFileName);
        Scanner inputFileScanner = new Scanner(inputFile);
        PrintWriter outputFileWriter = new PrintWriter(new FileWriter(outputFileName));

        // Process each student record in the input file
        while (inputFileScanner.hasNextLine()) {
            String record = inputFileScanner.nextLine();
            String[] fields = record.split(" ");  // Split each record into individual parts (first name, last name, scores)

            // Extract the student's name and scores
            String firstName = fields[0];
            String lastName = fields[1];
            int actScore = Integer.parseInt(fields[2]);
            int satScore = Integer.parseInt(fields[3]);

            // Check if the student is admitted based on their scores
            boolean isAdmitted = isAdmitted(actScore, satScore);

            // Output the admission status to the output file
            outputStatus(isAdmitted, firstName, lastName, actScore, satScore, outputFileWriter);
        }

        // Close the file scanners and writers
        inputFileScanner.close();
        outputFileWriter.close();
    }

    // Method to check if the ACT score is valid (between 0 and 30)
    public static boolean validAct(int score) {
        return score >= 0 && score <= 30;
    }

    // Method to check if the SAT score is valid (between 0 and 1600)
    public static boolean validSat(int score) {
        return score >= 0 && score <= 1600;
    }

    // Method to check if the ACT score meets the minimum requirement (>= 20)
    public static boolean metAct(int score) {
        return score >= 20;
    }

    // Method to check if the SAT score meets the minimum requirement (>= 1000)
    public static boolean metSat(int score) {
        return score >= 1000;
    }

    // Method to determine if the student is admitted (either ACT or SAT score meets the minimum requirement)
    public static boolean isAdmitted(int actScore, int satScore) {
        return metAct(actScore) || metSat(satScore);
    }

    // Method to write the admission status to the output file
    public static void outputStatus(boolean isAdmitted, String firstName, String lastName, int actScore, int satScore, PrintWriter outputFileWriter) {
        if (isAdmitted) {
            // If admitted, check which criteria they met
            if (metAct(actScore) && metSat(satScore)) {
                outputFileWriter.println(firstName + " " + lastName + " is admitted on ACT and SAT scores");
            } else if (metAct(actScore)) {
                outputFileWriter.println(firstName + " " + lastName + " is admitted on ACT score");
            } else if (metSat(satScore)) {
                outputFileWriter.println(firstName + " " + lastName + " is admitted on SAT score");
            }
        } else {
            // If not admitted, explain why
            outputFileWriter.println(firstName + " " + lastName + " is not admitted (ACT and SAT scores are below minimum)");
        }
    }
}



