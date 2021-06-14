/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Polanco
 */
package ex39;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        App fValues = new App();
        fValues.sortingRecords();
    }

    public void sortingRecords() {
        var ofListEmployees = currentEmployees();
        sortsEmployees(ofListEmployees);
        printTemplate(ofListEmployees);
    }

    public void printTemplate(List<Map<String, String>> employees) {
        System.out.println("Name                | Position          | Separation Date");
        System.out.println("--------------------|-------------------|----------------");
        for (Map<String, String> theEmployee : employees) {
            System.out.printf("%-20s|%-19s|%s%n", theEmployee.get("first") + " " + theEmployee.get("last"),
                                            theEmployee.get("position"), theEmployee.get("separationDate"));
        }
    }

    public Map<String, String> data(String first, String last, String position, String separationDate) {
        return Map.of(
                "first", first,
                "last", last,
                "position", position,
                "separationDate", separationDate
        );
    }

    public List<Map<String, String>> currentEmployees() {
        return Arrays.asList(
                data(   "John",
                        "Johnson",
                        " Manager",
                        " 2016-12-31"),
                data(   "Tou",
                        "Xiong",
                        " Software Engineer",
                        " 2016-10-05"),
                data(   "Michaela",
                        "Michaelson",
                        " District Manager",
                        " 2015-12-19"),
                data(   "Jake",
                        "Jacobson",
                        " Programmer",
                        " "),
                data(   "Jacquelyn",
                        "Jackson",
                        " DBA",
                        ""),
                data(   "Sally",
                        "Weber",
                        " Web Developer",
                        " 2015-12-18")
        );
    }


    public void sortsEmployees(List<Map<String, String>> emp) {
        Comparator<Map<String, String>> comparator;
        comparator = Comparator.comparing((Map<String, String> stringMap) -> stringMap.get("last"));
        emp.sort(comparator);
    }


}
