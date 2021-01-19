CREATE TABLE `report_input`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `system` varchar(1) COMMENT '数据来源系统 0：国药；1：达沃斯；2：智合健',
  `goodscode` varchar(100)  COMMENT '商品编码',
  `goodsname` varchar(500)  COMMENT '商品名称',
  `goodsmodle` varchar(300)  COMMENT '商品规格',
  `suppliername` varchar(500)  COMMENT '供应商名称',
  `suppliercode` varchar(100)  COMMENT '供应商编码',
  `batch` varchar(200)  COMMENT '批次',
  `orderno` varchar(200)  COMMENT '订单号',
  `orderline` varchar(200)  COMMENT '订单号',
  `ordertype` varchar(20)  COMMENT '单据类型',
  `price` decimal(12,4)  COMMENT '采购单价',
  `count` decimal(12,4)  COMMENT '采购数量',
  `unit` varchar(200)  COMMENT '商品单位',
  `inputtime` datetime  COMMENT '采购时间',
  `factorycode` varchar(200)  COMMENT '厂家编码',
  `factoryname` varchar(500)  COMMENT '生产厂家',
  `productline` varchar(500)  COMMENT '产品线名称',
  `productlinecode` varchar(200)  COMMENT '产品线编码',
  `createtime` datetime  COMMENT '导入时间',
  `related` varchar(200)  COMMENT '关联系统采购销售单号',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 27 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;


CREATE TABLE `report_time`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `system` varchar(1) COMMENT '数据来源系统 0：国药；1：达沃斯；2：智合健',
  `type` varchar(1) COMMENT '类型 0：采购；1：销售',
  `createtime` datetime  COMMENT '导入时间',
  `max` datetime  COMMENT '最大数据时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 27 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

//初始化数据
INSERT INTO gyqx.report_time (`system`, `type`, createtime, max) values ('0', '0', STR_TO_DATE('2000-01-1', '%Y-%m-%d'), STR_TO_DATE('2000-01-1', '%Y-%m-%d'));
INSERT INTO gyqx.report_time (`system`, `type`, createtime, max) values ('0', '1', STR_TO_DATE('2000-01-1', '%Y-%m-%d'), STR_TO_DATE('2000-01-1', '%Y-%m-%d'));
INSERT INTO gyqx.report_time (`system`, `type`, createtime, max) values ('1', '0', STR_TO_DATE('2000-01-1', '%Y-%m-%d'), STR_TO_DATE('2000-01-1', '%Y-%m-%d'));
INSERT INTO gyqx.report_time (`system`, `type`, createtime, max) values ('1', '1', STR_TO_DATE('2000-01-1', '%Y-%m-%d'), STR_TO_DATE('2000-01-1', '%Y-%m-%d'));
INSERT INTO gyqx.report_time (`system`, `type`, createtime, max) values ('2', '0', STR_TO_DATE('2000-01-1', '%Y-%m-%d'), STR_TO_DATE('2000-01-1', '%Y-%m-%d'));
INSERT INTO gyqx.report_time (`system`, `type`, createtime, max) values ('2', '1', STR_TO_DATE('2000-01-1', '%Y-%m-%d'), STR_TO_DATE('2000-01-1', '%Y-%m-%d'));

CREATE TABLE `report_output`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `system` varchar(1) COMMENT '数据来源系统 0：国药；1：达沃斯；2：智合健',
  `goodscode` varchar(100)  COMMENT '商品编码',
  `goodsname` varchar(500)  COMMENT '商品名称',
  `goodsmodle` varchar(300)  COMMENT '商品规格',
  `suppliername` varchar(500)  COMMENT '销售商名称',
  `suppliercode` varchar(100)  COMMENT '销售商编码',
  `batch` varchar(200)  COMMENT '批次',
  `orderno` varchar(200)  COMMENT '订单号',
  `orderline` varchar(200)  COMMENT '订单行号',
  `ordertype` varchar(20)  COMMENT '单据类型',
  `price` decimal(12,4)  COMMENT '单价',
  `count` decimal(12,4)  COMMENT '数量',
  `unit` varchar(200)  COMMENT '商品单位',
  `inputtime` datetime  COMMENT '销售时间',
  `factorycode` varchar(200)  COMMENT '厂家编码',
  `factoryname` varchar(500)  COMMENT '生产厂家',
  `productline` varchar(500)  COMMENT '产品线名称',
  `productlinecode` varchar(200)  COMMENT '产品线编码',
  `createtime` datetime  COMMENT '导入时间',
  `related` varchar(200)  COMMENT '关联系统销售销售单号',

  `cost` decimal(12,4)  COMMENT '成本',
  `sum` decimal(12,4)  COMMENT '销售额',
  `costprice` decimal(12,4)  COMMENT '成本单价',
  `origprice` decimal(12,4)  COMMENT '原始单价',
  `origcost` decimal(12,4)  COMMENT '原始成本',
  `origsum` decimal(12,4)  COMMENT '原始销售额',
  `origflag` varchar(1)  COMMENT '是否溯源成功  0:成功， 1：失败',
  `origcount` decimal(12,4)  COMMENT '溯源数量',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 27 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;