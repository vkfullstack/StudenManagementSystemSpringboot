package in.vk.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.vk.main.Entity.Student;

public interface StudnetRepo extends JpaRepository<Student, Long> {

}
