package pl.gobio.Student.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(new Student(
                1L,
                "Jan",
                "Kowalski",
                LocalDate.of(2000, Month.AUGUST, 6),
                23,
                "kowalski12345@gmail.com"
        ));
    }
}
