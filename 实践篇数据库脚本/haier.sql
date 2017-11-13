/*
MySQL Data Transfer
Source Host: localhost
Source Database: haier
Target Host: localhost
Target Database: haier
Date: 2010-10-15 16:55:20
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for books
-- ----------------------------
CREATE TABLE `books` (
  `isbn` varchar(20) NOT NULL default '',
  `bookName` varchar(150) NOT NULL default '',
  `publisherID` int(11) default NULL,
  `price` decimal(10,2) NOT NULL,
  `count` int(11) default '0',
  `pic` varchar(50) default NULL,
  `description` varchar(1000) default NULL,
  PRIMARY KEY  (`isbn`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for userdetail
-- ----------------------------
CREATE TABLE `userdetail` (
  `username` varchar(20) NOT NULL,
  `userpass` varchar(20) NOT NULL,
  `role` int(4) default '0',
  `regtime` datetime default NULL,
  `lognum` int(11) default '0',
  PRIMARY KEY  (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records 
-- ----------------------------
INSERT INTO `books` VALUES ('8996733', 'C++ Primer Plus（第五版）中文版', '1', '55.44', '10', '8996733.jpg', '本书针对C++初学者，从C语言基础知识开始介绍，然后在此基础上详细阐述C++新增的特性，因此不要求读者有较多C语言方面的背景知识。本书可作为高等院校C++课程的教材，也可供初学者自学C++时使用。');
INSERT INTO `books` VALUES ('9011122', 'C#设计模式', '2', '35.70', '15', '9011122.jpg', '本书是第一部关于C#和.NET设计模式的权威指导著作，为基于C#语言和Microsoft ? .NET框架的开发人员学习设计模式和应用设计模式提供了一个完整全面的理论框架和大量的详细应用实例。本书内容覆盖了所有23个经典的“四人小组”设计模式，具体包括：适配器，外观，合成，桥接，单件，观察者，中介者，代理，职责链，享元，生成器，工厂方法，抽象工厂，原型，备忘录，模板方法，状态，策略，命令，解释器，装饰，迭代器，以及访问者等模式。本书提供了大量的C#代码，解释说明了在.NET框架下如何应用上述设计模式。读者在阅读本书之后，将会对关于C#语言和Microsoft .NET框架的设计模式的整体概念、基本原理、内部实现有一个清晰的认识，并可以将设计模式应用于基于C#语言和.NET框架的面向对象软件开发实践当中。本书还提供了丰富的附录资源，有兴趣的读者可以通过利用这些资源进一步增强对设计模式的理解。');
INSERT INTO `books` VALUES ('9025178', 'C++程序设计教程（第二版）', '2', '39.50', '30', '9025178.jpg', '本书是《C++程序设计教程》的第二版。然而从指导思想、内容结构、写作特点等方面，都以全新的面貌呈现于读者。全书全部重新执笔，代码全部重写，涵盖了基本C++编程方法的全部技术特征。\r\n本书以C++标准为蓝本，从过程化编程的基本描述，到对象化编程的方法展开，乃至高级编程的实质揭示，形成一条自然流畅的主线，通俗易懂，形象风趣。本书在内容结构上自成体系，并以独特的描述手法，辐射到计算机专业其他诸课程，体系严谨，结构独特。\r\n作者在长期的教学、科研实践以及ACM大学生程序设计竞赛培训工作中，总结出了许多难能可贵的教学经验，能使读者快捷而准确地找到编程技术要领，洞穿C++内部实现要害，直击抽象编程本质。\r\n\r\n');
INSERT INTO `books` VALUES ('9221944', '精通CSS--高级Web标准解决方案', '1', '39.00', '22', '9221944.jpg', '本书将最有用的CSS技术汇总在一起，在介绍基本的CSS概念和最佳实践之后，讨论了核心的CSS技术，例如图像、链接、列表操纵、表单设计、数据表格设计以及纯CSS布局。每一章内容由浅入深，直到建立比较复杂的示例。之后本书用两章讨论招数、过滤器、bug和bug修复，最后由Simon Collison和Cameron Moll两位杰出的CSS设计人员，将书中讨论的许多技术组合起来，给出了两个实例研究，这两个实例研究将书中讨论的许多技术组合起来，使读者不仅理解工作原理，而且能够学到如何将它们应用在实际项目中，迅速精通CSS，成为CSS专家。本书还集中介绍了现实的浏览器问题，是弥补CSS知识欠缺不可或缺的参考书。本书弥补了一直以来CSS图书的空白。正因如此，英文版出版后，一时洛阳纸贵，多次重印，并迅速登上Amazon图书排行榜前列，最高时甚至与哈里·波特并驾齐驱，创造了计算机图书的销售奇迹。\r\n本书适合具有(X)HTML和CSS基本知识的任何网页设计人员阅读。\r\n');
INSERT INTO `books` VALUES ('9222502', 'C#高级编程（第4版）', '2', '128.00', '25', '9222502.jpg', 'C＃经典名著！也是Wrox红皮书中最畅销的品种之一，从第一版开始就名满天下；其第3版被中华读书报、CSDN、《程序员》等机构评选为2005年最权威的十大IT图书之一（第2名）；在中国版协、中国出版科学研究所、《出版参考》杂志组织的“2005年度输出版、引进版优秀图书”评选活动中获得“2005年度引进版科技类优秀图书”奖。第4版面向C＃ 2005在全面展示.NET新特性的同时继续完善原有的内容，是有一些C＃基础知识的学习者或者想迁移到C＃的其他程序员全面掌握C＃的首选教程。 \r\n');
INSERT INTO `books` VALUES ('9286670', 'Effective C#中文版', '1', '41.65', '33', '9286670.jpg', '本书围绕一些重要的主题，包括C#语言元素、．NET资源管理、使用C#表达设计、创建二进制组件和使用框架等，讲述了最常见的50个问题的解决方案，为程序员提供了在使用C#语言和．NET库时如何提高编程效率的建议。本书通过将每个条款构建在之前的条款之上，并合理地利用之前的条款，来让读者最大限度地学习书中的内容，为其在不同的情况下能够使用最佳的构造而提供指导。.\r\n本书适于各种层次的C#程序员阅读，同时可以推荐给高校教师（尤其是软件学院教授C#/．NET课程的老师），作为C#双语教学的参考书。\r\nC#与C++、Java等语言的相似性大大降低了学习难度，但是，C#所具有的大量独特的特性和实现细节，有时又会使程序员适得其反：他们往往根据既有经验，错误地选用了不恰当的技术，从而导致各种问题。与此同时，随着数年来C#的广泛应用，业界在充分利用C#的强大功能编写快速、高效和可靠的程序方面也积累了丰富的最佳实践。');
INSERT INTO `books` VALUES ('9316709', 'C# 2005 Business Objects', '3', '61.40', '21', '9316709.jpg', '本书描述了怎样应用面向对象的概念来进行.NET应用程序的架构、设计和开发。作者将重点放在了面向业务的对象，即业务对象和怎样在包括Web和客户机/服务器结构的不同分布式环境中来实现它们。本书使用了大量的.NET技术，面向对象的设计与编程思想，以及分布式架构。本书的前半部分叙述了如何在.NET环境创建这个框架来支持面向对象的应用程序开发的流程，后半部分应用这个框架创建了一个带有几个不同接口的示例应用程序，本书适合C#应用开发人员阅读。');
INSERT INTO `userdetail` VALUES ('admin', '123456', '1', '2010-02-25 01:22:03', '3');
INSERT INTO `userdetail` VALUES ('dingcq', 'dingcq', '1', '2010-02-25 02:20:07', '0');
INSERT INTO `userdetail` VALUES ('haier', 'soft', '1', '2010-02-25 02:22:50', '0');
INSERT INTO `userdetail` VALUES ('wangwu', 'wangwu', '0', '2010-02-25 02:23:43', '0');
INSERT INTO `userdetail` VALUES ('zhangsan', 'zhangsan', '0', '2010-02-25 12:20:39', '0');
INSERT INTO `userdetail` VALUES ('zhangxp', 'zhangxp', '1', '2010-02-25 12:20:51', '0');
INSERT INTO `userdetail` VALUES ('zhaokeling', 'zhaokeling', '1', '2010-02-25 01:36:50', '0');
INSERT INTO `userdetail` VALUES ('zhaokl', 'zhaokl', '1', '2010-02-25 02:21:03', '0');
INSERT INTO `userdetail` VALUES ('zkl', '123456', '0', '2010-02-25 09:31:44', '8');
