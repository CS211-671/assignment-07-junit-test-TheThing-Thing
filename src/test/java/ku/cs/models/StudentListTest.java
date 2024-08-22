package ku.cs.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

    @Test
    public void testAddNewStudentAndFindStudentById() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("66xxxxx1", "Joe");
        studentList.addNewStudent("66xxxxx2", "Jill");


        Student student = studentList.findStudentById("66xxxxx1");

        String expected = "Joe";
        String actual = student.getName();
        assertEquals(expected, actual);
    }

    @Test
    public void testAddNewStudentAndGiveScoreToId() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("66xxxxx1", "Joe",50);
        studentList.addNewStudent("66xxxxx2", "Jill",80);

        studentList.giveScoreToId("66xxxxx1",25.0);

        String actual = studentList.viewGradeOfId("66xxxxx1");
        String expected = "B";
        assertEquals(expected, actual);

    }

}