DROP TABLE car.car;
DROP TABLE car.journal;
DROP TABLE car.reserve;
DROP TABLE car.userinfo;

CREATE TABLE IF NOT EXISTS `car`.car
(
  id     BIGINT       NOT NULL AUTO_INCREMENT COMMENT 'PK',
  name   VARCHAR(100) NOT NULL COMMENT '차 이름',
  num   VARCHAR(20)  NOT NULL COMMENT '차 번호',
  km   VARCHAR(50)      NOT NULL COMMENT '차 주행거리',
  PRIMARY KEY (id)
) COMMENT '차량';

CREATE TABLE IF NOT EXISTS `car`.journal
(
  id    BIGINT      NOT NULL AUTO_INCREMENT COMMENT 'PK',
  jkm         VARCHAR(50) NOT NULL COMMENT '주행거리',
  condi         VARCHAR(100) NOT NULL COMMENT '차량 상태',
  uni       VARCHAR(100) NOT NULL COMMENT '특이 사항',
  jname     VARCHAR(100) NOT NULL COMMENT '운행자 이름',
  jcarnum     VARCHAR(100) NOT NULL COMMENT '운행차량 번호',
  jrt     VARCHAR(100) NOT NULL COMMENT '예약 시간',
  jdest    VARCHAR(100) NOT NULL COMMENT '행선지',
  jpurpose    VARCHAR(100) NOT NULL COMMENT '운행 목적',
  date DATETIME NOT NULL COMMENT '작성 시간',
  PRIMARY KEY (id)
) COMMENT '운행일지';

CREATE TABLE IF NOT EXISTS `car`.reserve
(
  id    BIGINT      NOT NULL AUTO_INCREMENT COMMENT 'PK',
  purpose         VARCHAR(100) NOT NULL COMMENT '이용 목적',
  dest         VARCHAR(100) NOT NULL COMMENT '목적지',
  rt       VARCHAR(100) NOT NULL COMMENT '예약 시간',
  rcarnum    VARCHAR(100) NOT NULL COMMENT '예약 차 번호',
  rname    VARCHAR(100) NOT NULL COMMENT '예약자 이름',
  PRIMARY KEY (id)
) COMMENT '예약';


CREATE TABLE IF NOT EXISTS `car`.userinfo
(
  id    BIGINT      NOT NULL AUTO_INCREMENT COMMENT 'PK',
  email        VARCHAR(100) NOT NULL COMMENT '아이디',
  password         VARCHAR(100) NOT NULL COMMENT '비밀번호',
  auth       VARCHAR(10) NOT NULL COMMENT '접근권한',
  PRIMARY KEY (id)
) COMMENT '회원';

