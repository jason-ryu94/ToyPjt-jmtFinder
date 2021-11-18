package jason.toyproject.jmtfinder.app.store.repository;

import jason.toyproject.jmtfinder.app.store.entity.MenuEntity;
import org.aspectj.lang.JoinPoint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends JpaRepository<MenuEntity, String> {

}
