-- begin SINGLE_SINGLE
alter table SINGLE_SINGLE add constraint FK_SINGLE_SINGLE_ON_MULTI foreign key (MULTI_ID) references SINGLE_MULTI(ID)^
create index IDX_SINGLE_SINGLE_ON_MULTI on SINGLE_SINGLE (MULTI_ID)^
-- end SINGLE_SINGLE
