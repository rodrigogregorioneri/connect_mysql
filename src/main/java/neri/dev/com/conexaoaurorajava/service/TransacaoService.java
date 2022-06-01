package neri.dev.com.conexaoaurorajava.service;

import neri.dev.com.conexaoaurorajava.dto.TransacaoDto;
import neri.dev.com.conexaoaurorajava.entities.Transacao;

import java.util.List;


public interface TransacaoService {

    Transacao saveTransacao(TransacaoDto transacao);

    List<Transacao> getAll();
}
