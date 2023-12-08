package org.willxu.algorithm.service.integer;

import org.willxu.algorithm.provide.Employee;

import java.util.List;

public interface EmployeeImportance {
    /**
     * You have a data structure of employee information, including the
     * employee's unique ID, importance value, and direct
     * subordinates' IDs.
     * <p>
     * You are given an array of employees employees where:
     * <p>
     * - employees[i].id is the ID of the i^th employee.
     * - employees[i].importance is the importance value of the i^th
     *   employee.
     * - employees[i].subordinates is a list of the IDs of the direct
     *   subordinates of the ith employee.
     * <p>
     * Given an integer id that represents an employee's ID, return the
     * total importance value of this employee and all their direct and
     * indirect subordinates.
     *
     * @param employees 1 <= employees.length <= 2000
     *                  1 <= employees[i].id <= 2000
     *                  All employees[i].id are unique.
     *                  -100 <= employees[i].importance <= 100
     *                  One employee has at most one direct leader and
     *                  may have several subordinates.
     * @param id The IDs in employees[i].subordinates are valid IDs.
     */
    int getImportance(List<Employee> employees, int id);
}
