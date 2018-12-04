package guerbai.f651_700;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};

public class GetImportance {

    private Map<Integer, Employee> ee = new HashMap<>();

    private int recursion(Employee employee) {
        int result = employee.importance;
        for (int i: employee.subordinates) {
            result += recursion(ee.get(i));
        }
        return result;
    }

    private int getImportance(List<Employee> employees, int id) {
        for (Employee employee: employees) {
            ee.put(employee.id, employee);
        }
        return recursion(ee.get(id));
    }
}
