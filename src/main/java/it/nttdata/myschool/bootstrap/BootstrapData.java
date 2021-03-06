package it.nttdata.myschool.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import it.nttdata.myschool.model.SchoolClass;
import it.nttdata.myschool.model.Student;
import it.nttdata.myschool.repository.SchoolClassRepository;
import it.nttdata.myschool.repository.StudentRepository;

@Component
public class BootstrapData implements CommandLineRunner{

    @Autowired
    private SchoolClassRepository schoolClassRepository;
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
        
        SchoolClass class1 = new SchoolClass("1A");
        SchoolClass class2 = new SchoolClass("1B");
        SchoolClass class3 = new SchoolClass("1C");

        Student student1 = new Student("Naruto","Uzumaki",10,class1);
        Student student2 = new Student("Sasuke","Uchiha",10,class1);
        Student student3 = new Student("Shikamaru","Nara",10,class1);
        Student student4 = new Student("Sakura","Haruno",10,class2);
        Student student5 = new Student("Gaara","DelDeserto",10,class3);
        Student student6 = new Student("Shisui","Uchiha",10,class3);

        schoolClassRepository.save(class1);
        schoolClassRepository.save(class2);
        schoolClassRepository.save(class3);

        studentRepository.save(student1);
        studentRepository.save(student2);
        studentRepository.save(student3);
        studentRepository.save(student4);
        studentRepository.save(student5);
        studentRepository.save(student6);

        
    }
    
}
