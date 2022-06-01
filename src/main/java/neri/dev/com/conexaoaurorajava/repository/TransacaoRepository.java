package neri.dev.com.conexaoaurorajava.repository;

import neri.dev.com.conexaoaurorajava.entities.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransacaoRepository extends JpaRepository<Transacao, Long> {
}
