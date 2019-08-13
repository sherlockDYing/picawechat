
DROP SCHEMA IF EXISTS `picadb`;
CREATE SCHEMA `picadb`;
use `picadb`;

DROP TABLE IF EXISTS user_records;
CREATE TABLE users_records (
  openid varchar(50) NOT NULL,
  username varchar(20),
  identity int,
  primary key (openid)
);

DROP TABLE IF EXISTS questions;
CREATE TABLE questions(
  question_id int NOT NULL ,
  bankId int NOT NULL ,
  bank_name  varchar (50) ,
  contents varchar(600) NOT NULL ,
  answer_offset int NOT NULL ,
  value  int NOT NULL ,
  options varchar (900) ,
  primary key (question_id)
);

DROP TABLE IF EXISTS links;
CREATE TABLE links(
  link_id varchar (20) NOT NULL ,
  bankId int NOT NULL ,
  level  int NOT NULL ,
  url varchar (200) NOT NULL ,
  label varchar (600) ,
  primary key (link_id)
);

DROP TABLE IF EXISTS test_records;
CREATE TABLE test_records(
  record_id varchar (20) NOT NULL ,
  openid varchar (50) NOT NULL ,
  bankId int NOT NULL ,
  score int NOT NULL ,
  create_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  primary key (record_id)
);

DROP TABLE IF EXISTS carousel_resources;
CREATE TABLE  carousel_resources(
  id int NOT NULL ,
  type int NOT NULL ,
  url varchar (200) NOT NULL ,
  label varchar (600) ,
  primary key(id)
);
