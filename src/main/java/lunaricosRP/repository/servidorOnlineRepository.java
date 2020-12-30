package lunaricosRP.repository;

import lunaricosRP.models.servidorOnline;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface servidorOnlineRepository extends JpaRepository<servidorOnline, Long> {
}
