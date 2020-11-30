CREATE TABLE `m_metting`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `title` varchar(200)  COMMENT '会议主题',
  `begin_time` datetime(0)  COMMENT '会议开始时间',
  `end_time` datetime(0)  COMMENT '会议结束时间',
  `qr_code` varchar(200)  COMMENT '会议名称',
  `sdelete` varchar(1) DEFAULT 0 NULL COMMENT '是否删除',
  `create_time` datetime(0) NULL COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 27 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

CREATE TABLE `m_group`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(50)  COMMENT '分组名称',
  `remake` varchar(200)  COMMENT '分组简介',
  `sdelete` varchar(1) DEFAULT 0 NULL COMMENT '是否删除',
  `create_time` datetime(0) NULL COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 27 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

CREATE TABLE `m_user_group`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `userid` bigint(20)  COMMENT '用户ID',
  `groupid` bigint(20)  COMMENT '分组id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 27 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

CREATE TABLE `m_score`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `mettingid` bigint(20)  COMMENT '会议ID',
  `groupid` bigint(20)  COMMENT '分组ID',
  `turns1` decimal(6,2)  COMMENT '第1轮分数',
  `turns2` decimal(6,2)  COMMENT '第2轮分数',
  `turns3` decimal(6,2)  COMMENT '第3轮分数',
  `turns4` decimal(6,2)  COMMENT '第4轮分数',
  `turns5` decimal(6,2)  COMMENT '第5轮分数',
  `totle` decimal(6,2)  COMMENT '总分',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 27 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

CREATE TABLE `m_check`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `mettingid` bigint(20)  COMMENT '会议ID',
  `userid` bigint(20)  COMMENT '用户ID',
  `checkTime` datetime(0)  COMMENT '签到时间',
  `groupid` bigint(20)  COMMENT '会议分组',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 27 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;