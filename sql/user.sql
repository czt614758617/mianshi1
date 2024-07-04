CREATE TABLE `user` (
                        `id` bigint(20) NOT NULL AUTO_INCREMENT,
                        `username` varchar(255) NOT NULL,
                        PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- 插入数据示例
INSERT INTO `user` (`id`, `username`) VALUES
                                          (1, 'user1'),
                                          (2, 'user2'),
                                          (3, 'user3');
ALTER TABLE `user` ADD INDEX `idx_username` (`username`);