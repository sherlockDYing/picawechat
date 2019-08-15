
DROP SCHEMA IF EXISTS `picadb`;
CREATE SCHEMA `picadb`;
use `picadb`;
/**
用户信息
 */
DROP TABLE IF EXISTS user_records;
CREATE TABLE users_records (
  openid varchar(50) NOT NULL,
  username varchar(20),
  identity int,--0为无，1为医学生，2为普通用户
  primary key (openid)
);
/**
题库信息
 */
DROP TABLE IF EXISTS bank_info;
CREATE TABLE bank_info (
  bankId int not null auto_increment ,
  bank_name varchar (50) not null ,
  primary key (bankId)
);
/**
题目信息，受题库信息主键bankId约束
 */
DROP TABLE IF EXISTS questions;
CREATE TABLE questions(
  question_id int NOT NULL auto_increment,
  bankId int NOT NULL ,
  son_id int NOT NULL ,
  contents varchar(600) NOT NULL ,
  answer_offset int NOT NULL ,
  value  int NOT NULL ,
  options varchar (900) ,
  primary key (question_id),
  constraint bank_info_bankid
  foreign key (bankId) references bank_info(bankId)
);
/**
分享链接受题库bankId约束
 */
DROP TABLE IF EXISTS links;
CREATE TABLE links(
  link_id int NOT NULL auto_increment,
  bankId int NOT NULL ,
  level  int NOT NULL ,
  url varchar (400) NOT NULL ,
  label varchar (600) ,
  primary key (link_id) ,
  constraint bank_id_info
  foreign key (bankId) references bank_info(bankId)
);
/**
测试记录，受题库bankId和用户openid约束
 */
DROP TABLE IF EXISTS test_records;
CREATE TABLE test_records(
  record_id int NOT NULL auto_increment ,
  openid varchar (50) NOT NULL ,
  bankId int NOT NULL ,
  score int NOT NULL ,
  total int NOT NULL ,
  create_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  primary key (record_id),
  constraint user_openid_test_records
  foreign key (openid) references users_records(openid),
  constraint bank_bankid_test_records
  foreign key (bankId) references bank_info(bankId)
);

DROP TABLE IF EXISTS video_resources;
CREATE TABLE  video_resources(
  id int NOT NULL auto_increment ,
  url varchar (400) NOT NULL ,
  imgurl varchar (400) ,
  label varchar (600) ,
  primary key(id)
);
DROP TABLE IF EXISTS article_resources;
CREATE TABLE  article_resources(
  id int NOT NULL auto_increment ,
  url varchar (400) NOT NULL ,
  label varchar (600) ,
  primary key(id)
);
