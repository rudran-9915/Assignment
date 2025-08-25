package org.example.Assignment9.StudentCourseEnrollment;

import java.util.*;
import java.util.stream.Collectors;

public class EnrollmentSystem {
    public final Set<Course> availableCourses = new HashSet<>();
    public final Map<Student, Set<Course>> registrations = new HashMap<>();

    //Courses

    public boolean addCourse(Course course) {
        return availableCourses.add(course);
    }

    public Course findCourseById(int courseId) {
        for (Course c : availableCourses) {
            if (c.getCourseId() == courseId) return c;
        }
        return null;
    }

    public List<Course> viewAllCourses() {
        return new ArrayList<>(availableCourses);
    }

    //  Students & Registrations

    public boolean addStudent(Student student) {
        if (getStudentKeyById(student.getStudentId()) != null) return false;
        registrations.put(student, new HashSet<>());
        return true;
    }

    public Set<Course> registerStudentForCourses(int studentId, String studentName, Set<Integer> courseIds) {
        Student key = getStudentKeyById(studentId);
        if (key == null) {
            key = new Student(studentId, studentName);
            registrations.put(key, new HashSet<>());
        }

        Set<Course> studentCourses = registrations.get(key);
        for (Integer cid : courseIds) {
            Course course = findCourseById(cid);
            if (course != null) studentCourses.add(course);
        }
        return Collections.unmodifiableSet(studentCourses);
    }

    public boolean addCourseToStudent(int studentId, int courseId) {
        Student key = getStudentKeyById(studentId);
        Course course = findCourseById(courseId);
        if (key == null || course == null) return false;
        return registrations.get(key).add(course);
    }

    public boolean removeCourseFromStudent(int studentId, int courseId) {
        Student key = getStudentKeyById(studentId);
        Course course = findCourseById(courseId);
        if (key == null || course == null) return false;
        return registrations.get(key).remove(course);
    }

    public boolean removeStudent(int studentId) {
        Student key = getStudentKeyById(studentId);
        if (key == null) return false;
        registrations.remove(key);
        return true;
    }

    public boolean updateStudentRegistration(int studentId, Set<Integer> newCourseIds) {
        Student key = getStudentKeyById(studentId);
        if (key == null) return false;
        Set<Course> newSet = new HashSet<>();
        for (Integer cid : newCourseIds) {
            Course c = findCourseById(cid);
            if (c != null) newSet.add(c);
        }
        registrations.put(key, newSet);
        return true;
    }

    //  Searching

    public Set<Course> findCoursesByStudent(int studentId) {
        Student key = getStudentKeyById(studentId);
        if (key == null) return null;
        return Collections.unmodifiableSet(registrations.get(key));
    }

    public List<Student> findStudentsByCourse(int courseId) {
        Course course = findCourseById(courseId);
        if (course == null) return Collections.emptyList();
        return registrations.entrySet().stream()
                .filter(e -> e.getValue().contains(course))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    //Sorting & Views

    public List<Course> getCoursesSortedByName() {
        return availableCourses.stream()
                .sorted(Comparator.comparing(Course::getCourseName, String.CASE_INSENSITIVE_ORDER))
                .collect(Collectors.toList());
    }

    public List<Student> getStudentsSortedByName() {
        return registrations.keySet().stream()
                .sorted(Comparator.comparing(Student::getName, String.CASE_INSENSITIVE_ORDER))
                .collect(Collectors.toList());
    }

    private Student getStudentKeyById(int studentId) {
        for (Student s : registrations.keySet()) {
            if (s.getStudentId() == studentId) return s;
        }
        return null;
    }
}
