create table hibernate_sequence (next_val bigint) engine=InnoDB;
insert into hibernate_sequence values ( 1 );
create table transacao (transacao_id bigint not null, descricao_transacao varchar(255), primary key (transacao_id)) engine=InnoDB;
create table transacao (transacao_id bigint not null auto_increment, descricao_transacao varchar(255), primary key (transacao_id)) engine=InnoDB;
