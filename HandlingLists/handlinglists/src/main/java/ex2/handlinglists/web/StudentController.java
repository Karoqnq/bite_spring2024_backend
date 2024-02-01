package ex2.handlinglists.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ex2.handlinglists.domain.Student;

@Controller
public class StudentController {

    @GetMapping("/studentlist") // Instead of /hello I used /studentlist as otherwise I would've had to change the name of my html

    public String StudentList(Model model) {
        List<Student> students = createStudentList();
        model.addAttribute("students", students);
        return "studentlist";
    }

    private List<Student> createStudentList() {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Karoliina", "Raud"));
        students.add(new Student("Eszter", "Kozar"));
        students.add(new Student("Sof", "Lindberg"));
        return students;
    }
}
