/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  luotao
 * Created: 2017-8-29
 */


CREATE TABLE `ta_auth_def` (
  `AUTH_ID` int(11) NOT NULL COMMENT '权限标识',
  `AUTH_NAME` varchar(80) NOT NULL COMMENT '权限名称',
  `AUTH_DESC` varchar(128) DEFAULT NULL COMMENT '权限描述\n',
  `CREATE_TIME` date NOT NULL COMMENT '创建时间',
  `STATUS_CD` int(1) NOT NULL COMMENT '权限状态\n1：有效\n0：无效',
  `AUTH_TYPE` int(11) NOT NULL COMMENT '权限类型\n1：菜单权限\n2：数据权限',
  `AUTH_REF_OBJID` varchar(45) NOT NULL COMMENT '权限参考对象ID',
  PRIMARY KEY (`AUTH_ID`,`AUTH_NAME`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统权限定义表';

CREATE TABLE `ta_auth_group` (
  `AUTH_GROUP_ID` int(11) NOT NULL,
  `AUTH_ID` varchar(45) NOT NULL,
  `CREATE_TIME` date DEFAULT NULL,
  PRIMARY KEY (`AUTH_GROUP_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='权限组';

CREATE TABLE `ta_role_auth` (
  `AUTH_GROUP_ID` int(11) NOT NULL COMMENT '权限组标识',
  `AUTH_GROUP_NAME` varchar(128) NOT NULL COMMENT '权限组名称',
  `ROLE_ID` int(11) NOT NULL COMMENT '角色标识',
  `CREATE_TIME` date DEFAULT NULL COMMENT '创建时间',
  `GROUP_DESC` varchar(45) DEFAULT NULL COMMENT '权限组描述',
  PRIMARY KEY (`AUTH_GROUP_ID`,`ROLE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色权限';

CREATE TABLE `tg_user_login` (
  `LOG_ID` bigint(20) NOT NULL,
  `USER_ID` int(11) NOT NULL,
  `LOGIN_TIME` date NOT NULL,
  `LOGIN_WAY` smallint(6) NOT NULL,
  PRIMARY KEY (`LOG_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `tg_user_pwd_chg` (
  `LOG_ID` bigint(20) NOT NULL,
  `USER_ID` int(11) NOT NULL,
  `CHG_TIME` date NOT NULL,
  `CHG_REASON` varchar(45) NOT NULL,
  `CHG_TYPE` int(11) NOT NULL,
  PRIMARY KEY (`LOG_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='密码变更历史表';

CREATE TABLE `to_order_detail` (
  `ORDER_DETAIL_ID` varchar(20) NOT NULL COMMENT '订单明细ID',
  `ORDER_ID` varchar(20) NOT NULL COMMENT '订单ID',
  `PRDCT_INST_ID` varchar(20) NOT NULL COMMENT '产品实例ID',
  `QUANTITY` int(11) NOT NULL COMMENT '购买数量',
  `CREATE_TIME` varchar(45) NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`ORDER_DETAIL_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单明细';

CREATE TABLE `to_order_payment` (
  `ORDER_ID` varchar(20) NOT NULL,
  `PAY_TYPE` int(11) NOT NULL COMMENT '支付类型：\n1：支付\n0：退款',
  `PAY_METHOD` int(11) NOT NULL,
  `PAY_ACCT_ID` varchar(45) NOT NULL,
  `PAYED_TIME` datetime NOT NULL COMMENT '支付时间',
  PRIMARY KEY (`ORDER_ID`,`PAY_TYPE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `to_order_price` (
  `ORDER_DETAIL_ID` varchar(20) NOT NULL COMMENT '订单明细ID',
  `ORDER_ID` varchar(20) NOT NULL COMMENT '订单ID',
  `PRICE` decimal(10,2) NOT NULL COMMENT '订单明细价格',
  `PRICE_REDUCED` decimal(10,2) DEFAULT NULL COMMENT '调整金额，如果是减免则填写负数。',
  `REMARK` varchar(128) DEFAULT NULL COMMENT '备注',
  `CHANGE_TIME` datetime DEFAULT NULL COMMENT '变更时间',
  PRIMARY KEY (`ORDER_DETAIL_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `to_order_price_adjust` (
  `ORDER_ID` varchar(20) NOT NULL,
  `CHANGE_TIME` datetime NOT NULL,
  `CHANGE_TYPE` int(11) NOT NULL,
  `CHANGED_AMOUNT` decimal(10,2) NOT NULL,
  `REMARK` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ORDER_ID`,`CHANGE_TIME`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `to_product_inst` (
  `PRDCT_INST_ID` varchar(20) NOT NULL COMMENT '产品实例ID',
  `PRDCT_ID` varchar(20) NOT NULL COMMENT '产品ID',
  PRIMARY KEY (`PRDCT_INST_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='产品实例';

CREATE TABLE `to_product_inst_attr` (
  `PRDCT_INST_ID` varchar(20) NOT NULL COMMENT '产品实例ID',
  `ATTR_ID` int(11) NOT NULL COMMENT '属性标识',
  `ATTR_VALUE` varchar(45) DEFAULT NULL COMMENT '属性值',
  PRIMARY KEY (`PRDCT_INST_ID`,`ATTR_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='产品实例属性';

CREATE TABLE `to_shopping_cart` (
  `USER_ID` int(11) NOT NULL COMMENT '用户标识',
  `PRDCT_ID` int(11) NOT NULL COMMENT '产品标识',
  `QUANTITY` int(11) NOT NULL COMMENT '商品数量',
  `ADD_TIME` datetime NOT NULL COMMENT '商品加入购物车时间',
  `STATUS_CD` varchar(2) NOT NULL COMMENT '购物车商品状态\n1：有效\n0：无效',
  PRIMARY KEY (`PRDCT_ID`,`USER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户购物车';

CREATE TABLE `to_user_order` (
  `ORDER_ID` varchar(20) NOT NULL COMMENT '订单ID',
  `USER_ID` varchar(20) NOT NULL COMMENT '用户ID',
  `CREATE_TIME` datetime NOT NULL COMMENT '创建时间',
  `STATUS_CD` varchar(4) NOT NULL COMMENT '订单状态\n0：配货\n1：出库\n2：已发货\n3：已收货\n4：退订\n5：完成',
  `PAYED_FLAG` int(11) DEFAULT NULL COMMENT '支付标识\n0：未支付\n1：已支付\n2：已退款',
  `CHANGE_TIME` datetime DEFAULT NULL COMMENT '订单变更时间',
  `AMOUNT` decimal(12,2) NOT NULL COMMENT '订单总价格',
  PRIMARY KEY (`ORDER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户订单';

CREATE TABLE `tp_product` (
  `PRDCT_ID` int(11) NOT NULL COMMENT '产品标识',
  `PRDCT_NAME` varchar(45) NOT NULL COMMENT '产品名称',
  `PRDCT_DESC` varchar(45) DEFAULT NULL COMMENT '产品描述',
  `PRICE` decimal(10,2) NOT NULL COMMENT '价格',
  `CREATE_DATE` date NOT NULL COMMENT '创建时间',
  `STATUS_CD` varchar(4) NOT NULL COMMENT '状态',
  PRIMARY KEY (`PRDCT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='产品定义表';

CREATE TABLE `tp_product_sale` (
  `PRDCT_ID` int(11) NOT NULL COMMENT '产品标识',
  `SALE_PRICE` decimal(10,0) NOT NULL COMMENT '单价：元',
  `SALE_DESC` varchar(45) NOT NULL COMMENT '产品销售时的描述信息',
  `IMG_GROUP_ID` int(11) DEFAULT NULL COMMENT '产品销售时的图片地址',
  PRIMARY KEY (`PRDCT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='产品销售定义';

CREATE TABLE `tp_product_sale_attr` (
  `ATTR_ID` int(11) NOT NULL COMMENT '属性标识',
  `PRDCT_ID` int(11) NOT NULL COMMENT '产品标识',
  `ATTR_TYPE` int(11) NOT NULL COMMENT '属性类型',
  `ATTR_NAME` varchar(45) NOT NULL COMMENT '属性名称',
  `ATTR_VALUE` varchar(1024) DEFAULT NULL COMMENT '属性值',
  PRIMARY KEY (`ATTR_ID`,`PRDCT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='产品销售属性';

CREATE TABLE `tp_product_sale_photo` (
  `IMG_GROUP_ID` int(11) NOT NULL,
  `IMG_ID` int(11) NOT NULL,
  `IMG_URL` varchar(128) NOT NULL,
  `IMG_TYPE` varchar(45) NOT NULL COMMENT '图片类型：\n1 主图\n2 附属图',
  `CREATE_DATE` date NOT NULL,
  PRIMARY KEY (`IMG_GROUP_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='产品销售相册';

CREATE TABLE `ts_menu_def` (
  `MENU_ID` int(11) NOT NULL,
  `MENU_NAME` varchar(45) NOT NULL,
  `CREATE_TIME` date DEFAULT NULL,
  `PARENT_MENU_ID` varchar(45) NOT NULL COMMENT '顶级菜单的上级菜单默认填写0',
  `MENU_HREF` varchar(300) DEFAULT NULL COMMENT '菜单跳转地址',
  PRIMARY KEY (`MENU_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `ts_sequence` (
  `NAME` varchar(50) NOT NULL,
  `CURRENT_VALUE` int(11) NOT NULL,
  `INCREMENT` int(11) NOT NULL,
  PRIMARY KEY (`NAME`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `tu_user` (
  `USER_ID` int(11) NOT NULL,
  `USER_NAME` varchar(45) DEFAULT NULL,
  `NICK_NAME` varchar(45) DEFAULT NULL,
  `REG_NBR` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`USER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户信息';

CREATE TABLE `tu_user_pwd` (
  `USER_ID` int(11) NOT NULL,
  `PASSWORD` varchar(45) NOT NULL,
  `CHG_TIME` date NOT NULL,
  PRIMARY KEY (`USER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;