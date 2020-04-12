package ro.dbts.sb_sone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.dbts.sb_sone.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {}
