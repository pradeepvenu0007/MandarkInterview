package com.interview.assesments.mandark;

import java.io.*;
import java.util.*;

public class EmpolyeeList {
    public static void main(String[] args) {
        readAndWriteFile();
    }
    public static void readAndWriteFile() {
        try {
            FileWriter managerFile = new FileWriter("manager.csv");
            FileWriter singleNameFile = new FileWriter("single_name_employees.csv");
            BufferedReader employeeFile = new BufferedReader(new FileReader("employees.csv"));
            employeeFile.readLine();
            String line = "";
            String[] tempArr;
            while((line = employeeFile.readLine()) != null) {
                tempArr = line.split(",");
                if(tempArr[1].equalsIgnoreCase("Manager") && tempArr[2].equalsIgnoreCase("R&D"))
                    managerFile.write(line+"\n");
                if (!tempArr[0].contains(" "))
                    singleNameFile.write(line+"\n");
            }
            employeeFile.close();
            managerFile.flush();
            singleNameFile.flush();
            managerFile.close();
            singleNameFile.close();
            System.out.println("Managers & SingleName employees files were successfully generated!");
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }

    }

}
