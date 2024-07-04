CREATE TABLE `material` (
                            `id` bigint(20) NOT NULL AUTO_INCREMENT,
                            `create_user` varchar(255) NOT NULL,
                            `name` varchar(255) NOT NULL,
                            `num` int(9) NOT NULL,
                            PRIMARY KEY (`id`),
                            CONSTRAINT `fk_user_material` FOREIGN KEY (`createUser`) REFERENCES `user` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `material` (`id`, `create_user`, `name`,`num`) VALUES
                                                              (1, 'user1', 'item1',100),
                                                              (2, 'user2', 'item2',200),
                                                              (3, 'user1', 'item3',300),
                                                              (4, 'user3', 'item4',400);