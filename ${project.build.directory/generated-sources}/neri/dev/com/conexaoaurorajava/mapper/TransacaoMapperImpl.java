package neri.dev.com.conexaoaurorajava.mapper;

import javax.annotation.processing.Generated;
import neri.dev.com.conexaoaurorajava.dto.TransacaoDto;
import neri.dev.com.conexaoaurorajava.entities.Transacao;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-01T10:19:17-0300",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 18 (Oracle Corporation)"
)
@Component
public class TransacaoMapperImpl implements TransacaoMapper {

    @Override
    public TransacaoDto toTransacaoDto(Transacao source) {
        if ( source == null ) {
            return null;
        }

        TransacaoDto transacaoDto = new TransacaoDto();

        return transacaoDto;
    }

    @Override
    public Transacao toTransacao(TransacaoDto destination) {
        if ( destination == null ) {
            return null;
        }

        Transacao transacao = new Transacao();

        return transacao;
    }
}
