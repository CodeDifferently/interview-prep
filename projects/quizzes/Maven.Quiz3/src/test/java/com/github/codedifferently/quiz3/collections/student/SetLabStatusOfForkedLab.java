package com.github.codedifferently.quiz3.collections.student;

import com.github.codedifferently.quiz3.collections.Lab;
import com.github.codedifferently.quiz3.collections.LabStatus;
import com.github.codedifferently.quiz3.collections.Student;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 10/12/2018.
 */
public class SetLabStatusOfForkedLab {
    @Test
    public void testCompleted() {
        // given
        String labName = "duplicate deleter";
        Lab lab = new Lab(labName);
        Student student = new Student();
        LabStatus expected = LabStatus.valueOf("COMPLETED");

        // when
        student.forkLab(lab);
        student.setLabStatus(labName, expected);
        LabStatus actual = student.getLabStatus(labName);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testPending() {
        // given
        String labName = "duplicate deleter";
        Lab lab = new Lab(labName);
        Student student = new Student();
        LabStatus expected = LabStatus.valueOf("PENDING");

        // when
        student.forkLab(lab);
        student.setLabStatus(labName, expected);
        LabStatus actual = student.getLabStatus(labName);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIncomplete() {
        // given
        String labName = "duplicate deleter";
        Lab lab = new Lab(labName);
        Student student = new Student();
        LabStatus expected = LabStatus.valueOf("INCOMPLETE");

        // when
        student.forkLab(lab);
        student.setLabStatus(labName, expected);
        LabStatus actual = student.getLabStatus(labName);

        // then
        Assert.assertEquals(expected, actual);
    }
}
