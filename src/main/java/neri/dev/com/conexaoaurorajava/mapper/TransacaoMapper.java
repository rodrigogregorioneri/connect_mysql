package neri.dev.com.conexaoaurorajava.mapper;

import neri.dev.com.conexaoaurorajava.dto.TransacaoDto;
import neri.dev.com.conexaoaurorajava.entities.Transacao;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface TransacaoMapper {

    TransacaoDto toTransacaoDto(Transacao source);

    Transacao toTransacao(TransacaoDto destination);
}
