package br.com.banco.controller;

import br.com.banco.model.Transferencia;
import br.com.banco.service.TransferenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000/")
public class TransferenciaController {
    @Autowired
    TransferenciaService transferenciaService;

    @RequestMapping(value = "/transferencia", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getFiltered(@RequestParam(required = false) String dataInicial, @RequestParam(required = false) String dataFinal, @RequestParam(required = false) String nomeOperador) {

        List<Transferencia> transferencias = transferenciaService.getFiltered(dataInicial, dataFinal, nomeOperador);

        return new ResponseEntity<>(transferencias, HttpStatus.OK);

    }

}
