package com.example.exceptions.demoexceptions;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(path = "/add")
    public String add(@RequestParam() String firstName, @RequestParam String lastName) {
        Employee result = employeeService.add(firstName, lastName);
        return generateMessage(result, "Successfully added");
    }

    @GetMapping(path = "/remove")
    public String remove(@RequestParam String firstName, @RequestParam String lastName) {
        Employee result = employeeService.remove(firstName, lastName);
        return generateMessage(result, "Successfully deleted");
    }

    @GetMapping(path = "/find")
    public Employee find(@RequestParam String firstName, @RequestParam String lastName) {
        return employeeService.find(firstName, lastName);
    }

    private String generateMessage(Employee employee, String status) {
        return String.format("Employee %s %s %s.",
                employee.getFirstName(),
                employee.getLastName(),
                status
        );
    }

}
