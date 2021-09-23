package DataAccessLayer;

import Entities.Student;
import Entities.StudentSearchRequest;

import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
    private static ArrayList<Student> _studentsRepo = new ArrayList<Student>();

    public void add(Student student){
        _studentsRepo.add(student);
    }

    public List<Student> getAll(){
        return _studentsRepo;
    }

    public List<Student> getExellents(){
        return _studentsRepo.stream().filter(x -> x.getAverage() >= 4).toList();
    }

    public List<Student> getBlockchainExperts(){
        return _studentsRepo.stream().filter(Student::getIsKnownBlockchain).toList();
    }

    public List<Student> get(StudentSearchRequest request){
        List<Student> students = new ArrayList<Student>();

        for (Student s : _studentsRepo){
            if (request.isBlockchainExpert && s.getIsKnownBlockchain()){
                students.add(s);
            }
            else if (request.isExellent && s.isExellent()){
                students.add(s);
            } else if(!request.isExellent && !request.isBlockchainExpert){
                students.add(s);
            }
        }

        return students;
    }

    public static void initRepo(){
        _studentsRepo.add(new Student("Андреева Ирина", 3.48, false ));
        _studentsRepo.add(new Student("Анферова Анастасия", 4.45, false ));
        _studentsRepo.add(new Student("Беднов Андрей", 4.98, true ));
        _studentsRepo.add(new Student("Белозуб Яна", 4.5, true ));
        _studentsRepo.add(new Student("Белоус Алексей", 3.84, true ));
        _studentsRepo.add(new Student("Котума Андрей", 3, false ));
        _studentsRepo.add(new Student("Колодин Денис", 3.01, false ));
    }

}
