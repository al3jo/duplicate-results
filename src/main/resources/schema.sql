drop table if exists dt_page;
drop table if exists dt_module;

create table DT_MODULE (
  id IDENTITY  primary key,
  label varchar(30) not NULL,
  display_name varchar(40) not NULL
);

create table DT_PAGE (
  id IDENTITY primary key,
  name varchar(50) not null,
  action varchar(50) not null,
  description varchar(255),
  module_id bigint not null REFERENCES dt_module(id)
);