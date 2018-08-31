package qa.com.royston.springboot.database.hello.SpringBootApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import qa.com.royston.springboot.database.hello.SpringBootApp.model.SpringBootDataModel;

@Repository
public interface SpringBootRepository extends JpaRepository<SpringBootDataModel, Long> {

}
