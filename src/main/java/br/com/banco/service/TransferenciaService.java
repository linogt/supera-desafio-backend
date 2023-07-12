package br.com.banco.service;

import br.com.banco.model.Transferencia;
import br.com.banco.repository.TransferenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Service
public class TransferenciaService {

    @Autowired
    TransferenciaRepository transferenciaRepository;

    public List<Transferencia> getFiltered(String dataInicial, String dataFinal, String nomeOperador) {

        List<Transferencia> transferencias = transferenciaRepository.getFiltered(dataInicial, dataFinal, nomeOperador);

        return transferencias;

    }

}
