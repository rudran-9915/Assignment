package org.example.Assignment7.UniversityExamEligibility;

public class ExamEligibility {
    public void checkEligibility(String studentName, double attendancePercent) throws LowAttendanceException {
        if (attendancePercent < 75.0) {
            throw new LowAttendanceException("Attendance below 75%. Not eligible for exam");
        }

    }
}
