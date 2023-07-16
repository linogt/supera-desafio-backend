package br.com.banco.repository;

import br.com.banco.model.Transferencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;;
import java.util.List;

@Repository
public interface TransferenciaRepository extends JpaRepository<Transferencia,Long> {

    @Query(nativeQuery = true, value = "SELECT * FROM TRANSFERENCIA WHERE " +
            "(DATA_TRANSFERENCIA >= ?1 OR ?1 IS NULL) AND " +
            "(DATA_TRANSFERENCIA <= ?2 OR ?2 IS NULL) AND " +
            "(NOME_OPERADOR_TRANSACAO LIKE CONCAT('%', ?3, '%') OR ?3 IS NULL)")
    List<Transferencia> getTransferencias(String dataInicial, String dataFinal, String nomeOperador);


}
