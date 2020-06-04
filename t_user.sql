CREATE TABLE `t_user` (
  `uid` int(10) NOT NULL AUTO_INCREMENT,
  `uname` varchar(40) DEFAULT NULL,
  `pwd` varchar(100) CHARACTER SET latin1 NOT NULL,
  `sex` char(2) CHARACTER SET latin1 NOT NULL,
  `age` int(3) DEFAULT NULL,
  `birth` date DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

INSERT INTO `t_user` VALUES (1, '张三', '123', '0', 17, '2000-10-10');
INSERT INTO `t_user` VALUES (2, '王五', '456', '1', 18, '2000-10-10');
