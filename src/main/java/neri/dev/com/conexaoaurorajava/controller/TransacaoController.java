package neri.dev.com.conexaoaurorajava.controller;

import neri.dev.com.conexaoaurorajava.dto.TransacaoDto;
import neri.dev.com.conexaoaurorajava.entities.Transacao;
import neri.dev.com.conexaoaurorajava.service.TransacaoService;
import neri.dev.com.conexaoaurorajava.service.impl.TransacaoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/v1/transacao")
public class TransacaoController {

    @Autowired
    private TransacaoService transacaoService;

    @PostMapping("/save")
    public Transacao save(@RequestBody TransacaoDto request) {
        return transacaoService.saveTransacao(request);
    }

    @GetMapping("")
    public List<Transacao> getAll(){
        return transacaoService.getAll();
    }
}
