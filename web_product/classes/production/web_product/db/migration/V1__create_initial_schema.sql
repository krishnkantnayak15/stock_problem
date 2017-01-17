CREATE TABLE `products` (
  `id`       INT          NOT NULL AUTO_INCREMENT,
  `version`  INT          NOT NULL DEFAULT 0,
  `name`    VARCHAR(255) NOT NULL,
  `stocknumber`  VARCHAR(255)   NOT NULL ,
  `description`   VARCHAR(255)   NULL,
  `rating` FLOAT  ,
  `noofreviews`   INT  ,
  `listprice`  DOUBLE NOT NULL,
  `percentOff`  FLOAT,
  `actualprice`  DOUBLE NOT NULL,
  `quantity`   INT  ,
  `isrestricted` BOOLEAN DEFAULT  FALSE   ,
  PRIMARY KEY (`id`));