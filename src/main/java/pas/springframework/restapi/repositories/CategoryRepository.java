package pas.springframework.restapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pas.springframework.restapi.domain.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {


}
