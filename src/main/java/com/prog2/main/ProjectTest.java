package com.prog2.main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProjectTest {

	@Test
	void toStringTest1() {
		
        Teacher dean = new Teacher("Tom", 40, "M", "1000 Ottawa Street", "111-2222", 1, "Math", 2, true, true, 32);
        Department department = new Department(100, "Computer Science", dean);

        String expected = "Department{id=100, name=Computer Science, dean=Person{name=Tom, age=40, gender=M, address=1000 Ottawa Street, phone=111-2222, type=teacher, id=1, specialty=Math, degree=2, dean=true, fullTime=true, hoursWorked=32}, teachers=[], staff=[]}";
        assertEquals(expected, department.toString());
	}
	
    @Test
    void toStringTest2() {

        Teacher dean2 = new Teacher("Jerry", 45, "M", "2000 Ottawa Street", "333-4444", 2, "Physics", 3, true, true, 32);
        Department department2 = new Department(200, "Physics", dean2);

        String expected2 = "Department{id=200, name=Physics, dean=Person{name=Jerry, age=45, gender=M, address=2000 Ottawa Street, phone=333-4444, type=teacher, id=2, specialty=Physics, degree=3, dean=true, fullTime=true, hoursWorked=32}, teachers=[], staff=[]}";
        assertEquals(expected2, department2.toString());
    }
    
    @Test
    void computePayRollTeacherTest1() {
        Teacher fullTimeTeacher = new Teacher("Steve", 35, "M", "101 Rue Pee1", "111-2222", 1, "Science", 2, false, true, 32);
        Teacher partTimeTeacher = new Teacher("Maria", 30, "F", "235 Rue young", "333-4444", 2, "English", 1, false, false, 20);

        double expectedFullTimePayRoll = (32 * fullTimeTeacher.getDegreeRate() * 2) * 0.85;
        double expectedPartTimePayRoll = (partTimeTeacher.hoursWorked * partTimeTeacher.getDegreeRate() * 2) * 0.76;

        assertEquals(expectedFullTimePayRoll, fullTimeTeacher.ComputePayRoll(), 0.01);
        assertEquals(expectedPartTimePayRoll, partTimeTeacher.ComputePayRoll(), 0.01);
    }
    
    @Test
    void computePayRollStaffTest1() {
        Staff staffMember1 = new Staff("Alice", 28, "F", "1111 Atwater St", "555-qqqq", "Program director", 40);
        Staff staffMember2 = new Staff("Bob", 45, "M", "630 rue William", "555-4321", "Janitor", 30);

        double expectedStaffMember1PayRoll = (staffMember1.getWorkload() * 32 * 2) * 0.75;
        double expectedStaffMember2PayRoll = (staffMember2.getWorkload() * 32 * 2) * 0.75;

        assertEquals(expectedStaffMember1PayRoll, staffMember1.ComputePayRoll(), 0.01);
        assertEquals(expectedStaffMember2PayRoll, staffMember2.ComputePayRoll(), 0.01);
    }
}
