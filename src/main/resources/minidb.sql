
DROP SCHEMA IF EXISTS `picadb`;
CREATE SCHEMA `picadb`;
use `picadb`;

DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  openid varchar(50) NOT NULL,
  username varchar(20),
  identity int,
  primary key (openid)
);

DROP TABLE IF EXISTS questions;
CREATE TABLE questions(
  question_id varchar (50) NOT NULL,
  kind varchar (50) NOT NULL ,
  question_bank varchar(600) NOT NULL ,
  answer varchar (300) NOT NULL ,
  options varchar (900) ,
  primary key (question_id)
);

DROP TABLE IF EXISTS links;
CREATE TABLE links(
  link_id varchar (20) NOT NULL ,
  kind varchar (50) NOT NULL ,
  score_low int NOT  NULL ,
  score_high int NOT NULL ,
  link varchar (100) NOT NULL ,
  primary key ( link_id)
);

DROP TABLE IF EXISTS test_records;
CREATE TABLE test_records(
  record_id varchar (20) NOT NULL ,
  openid varchar (50) NOT NULL ,
  kind varchar (50) NOT NULL ,
  score int NOT NULL ,
  primary key (record_id)
);