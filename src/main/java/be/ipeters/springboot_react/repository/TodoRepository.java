package be.ipeters.springboot_react.repository;

import be.ipeters.springboot_react.modal.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo,Long> {
}
