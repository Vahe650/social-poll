CREATE TABLE `poll` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `end_date` date DEFAULT NULL,
  `is_active` bit(1) DEFAULT NULL,
  `start_date` date DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8


CREATE TABLE `question` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `number` bigint DEFAULT NULL,
  `question` varchar(255) DEFAULT NULL,
  `poll_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKs9uu0i9ipek2tnqty4ohdek27` (`poll_id`),
  CONSTRAINT `FKs9uu0i9ipek2tnqty4ohdek27` FOREIGN KEY (`poll_id`) REFERENCES `poll` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8