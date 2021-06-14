/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Polanco
 */
package ex34;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        App employ = new App();
        employ.currentEmployees();
    }

    public void currentEmployees(){
        var emp = new ArrayList<>(List.of("John Smith", "Jackie Jackson",
                "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"));
        printEmployees(emp);
        if (!deleteEmployees(emp)){
            System.out.println("Entry does not exist");
        }
        else{
            System.out.println();
            printEmployees(emp);
        }
    }

    private void printEmployees(List<String> emp){
        System.out.printf("There are %d employees:%n", emp.size());
        emp.forEach(System.out::println);
    }

    private boolean deleteEmployees(List<String> emp){
        System.out.println();
        System.out.print("Enter an employee to remove: ");
        Scanner removeEmployee = new Scanner(System.in);
        var employee = removeEmployee.nextLine();
        return emp.remove(employee);
    }
}
