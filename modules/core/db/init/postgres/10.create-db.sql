-- begin SINGLE_SINGLE
create table SINGLE_SINGLE (
    ID bigint,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    VERSION integer not null,
    NAME varchar(255) not null,
    --
    NUM varchar(255),
    DESCRIPTION varchar(255),
    MULTI_ID bigint,
    --
    primary key (ID)
)^
-- end SINGLE_SINGLE
-- begin SINGLE_MULTI
create table SINGLE_MULTI (
    ID bigint,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    VERSION integer not null,
    NAME varchar(255) not null,
    --
    DESCRIPTION varchar(255),
    --
    primary key (ID)
)^
-- end SINGLE_MULTI
