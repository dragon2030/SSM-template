CREATE TABLE `user` (
    `id` int NOT NULL AUTO_INCREMENT,
    `name` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '姓名',
    `age` int DEFAULT NULL COMMENT '年龄',
    `people_des` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '人物描述',
    `sex_id` char(1) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '性别标识 1男 2女',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

INSERT INTO `dragon`.`user`(`id`, `name`, `age`, `people_des`, `sex_id`) VALUES (1, 'Jack ', 15, '一个好人', '1');
INSERT INTO `dragon`.`user`(`id`, `name`, `age`, `people_des`, `sex_id`) VALUES (3, 'Mike', 17, '一个超级赛亚人', '2');
