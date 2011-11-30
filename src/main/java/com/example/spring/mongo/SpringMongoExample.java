package com.example.spring.mongo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.data.document.mongodb.MongoOperations;
import org.springframework.data.document.mongodb.query.Criteria;
import org.springframework.data.document.mongodb.query.Query;

import com.example.spring.mongo.model.Employee;

public class SpringMongoExample {
    private MongoOperations mongoOperation;

    public SpringMongoExample() {
	ApplicationContext appContext = new GenericXmlApplicationContext("spring-mongo-config.xml");
	MongoOperations mongoOperation = (MongoOperations) appContext.getBean("mongoTemplate");
	this.mongoOperation = mongoOperation;
    }

    public static void main(String[] args) {
	SpringMongoExample springMongoExample = new SpringMongoExample();
	Employee employee = springMongoExample.createEmployeeObject();

	springMongoExample.saveEmployee(employee);

	springMongoExample.findEmployee();
    }

    /**
     * Create data model
     * 
     * @return employee
     */
    private Employee createEmployeeObject() {
	Employee employee = new Employee();
	employee.setId(543);
	employee.setName("Ranjan Kumar");
	employee.setDepartment("Lab");
	employee.setDesignation("Architect");
	return employee;
    }

    /**
     * Save new employee in the database
     */
    private void saveEmployee(Employee employee) {
	mongoOperation.save("EmployeeDetails", employee);
    }

    /**
     * Find the newly added employee from the database
     */

    private Employee findEmployee() {
	Query query = new Query(Criteria.where("designation").is("Architect"));
	Employee storedEmployee = mongoOperation.findOne("EmployeeDetails", query, Employee.class);
	System.out.println("stored employee : " + storedEmployee.toString());
	return storedEmployee;
    }
}
