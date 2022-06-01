package neri.dev.com.conexaoaurorajava.service.impl;

import neri.dev.com.conexaoaurorajava.dto.TransacaoDto;
import neri.dev.com.conexaoaurorajava.entities.Transacao;
import neri.dev.com.conexaoaurorajava.mapper.TransacaoMapper;
import neri.dev.com.conexaoaurorajava.repository.TransacaoRepository;
import neri.dev.com.conexaoaurorajava.service.TransacaoService;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransacaoServiceImpl implements TransacaoService {

    @Autowired
    private TransacaoRepository transacaoRepository;

    private TransacaoMapper transacaoMapper;

    private TransacaoMapper mapper
            = Mappers.getMapper(TransacaoMapper.class);

    @Override
    public Transacao saveTransacao(TransacaoDto transacao) {
        Transacao transacaoEntity = mapper.toTransacao(transacao);
        return transacaoRepository.save(transacaoEntity);
    }

    @Override
    public List<Transacao> getAll() {
        return transacaoRepository.findAll();
    }
}
