-- phpMyAdmin SQL Dump
-- version 4.1.12
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jun 19, 2014 at 10:54 AM
-- Server version: 5.6.16
-- PHP Version: 5.5.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `maid_cafe`
--
CREATE DATABASE IF NOT EXISTS `maid_cafe` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `maid_cafe`;

-- --------------------------------------------------------

--
-- Table structure for table `Discount`
--

CREATE TABLE IF NOT EXISTS `Discount` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(20) NOT NULL,
  `Category` varchar(6) NOT NULL,
  `Description` varchar(100) NOT NULL,
  `Percentage` int(11) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Dumping data for table `Discount`
--

INSERT INTO `Discount` (`Id`, `Name`, `Category`, `Description`, `Percentage`) VALUES
(1, 'BCA', 'CREDIT', 'BCA Credit Card users get 10% discount', 10),
(2, 'BNI', 'CREDIT', 'BNI Credit Card users get 10% discount', 10),
(3, 'HNY', 'EVENT', 'Happy New Year, get 5% discount', 5),
(4, 'XMAS', 'EVENT', 'Merry Christmas, get 5% discount', 5),
(5, 'CNY', 'EVENT', 'Chinese New Year, get 5% discount', 5);

-- --------------------------------------------------------

--
-- Table structure for table `Inventory`
--

CREATE TABLE IF NOT EXISTS `Inventory` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(20) NOT NULL,
  `Unit` int(11) NOT NULL,
  `@unit` int(11) NOT NULL,
  `Unit_Desc` varchar(15) NOT NULL,
  `Stock_Desc` varchar(15) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=57 ;

--
-- Dumping data for table `Inventory`
--

INSERT INTO `Inventory` (`Id`, `Name`, `Unit`, `@unit`, `Unit_Desc`, `Stock_Desc`) VALUES
(1, 'Water', 29251, 1000, 'Milliliter', 'Liter'),
(2, 'Rice', 143, 5, 'Plate', 'Basket'),
(3, 'Ice', 4, 10, 'Cube', 'Pack'),
(4, 'Sugar', 506, 50, 'Spoon ', 'Pack'),
(5, 'Egg', 260, 16, 'Egg', 'Kilogram'),
(6, 'Onion', 382, 20, 'Piece', 'Kilogram'),
(7, 'Pepper', 258, 25, 'Spoon', 'Bottle'),
(8, 'Ketchup', 5600, 600, 'Milliliter', 'Bottle'),
(9, 'Salt', 286, 30, 'Spoon', 'Pack'),
(10, 'Oil', 18255, 1000, 'Milliliter', 'Bottle'),
(11, 'Mushroom', 126, 10, 'Piece', 'Pack'),
(12, 'Paprika', 394, 40, 'Slice', 'Kilogram'),
(13, 'Meat', 19435, 1000, 'Gram', 'Kilogram'),
(14, 'Cheese', 260, 25, 'Spoon', 'Pack'),
(15, 'Margarine', 223, 50, 'Spoon', 'Pack'),
(16, 'Spaghetti', 18400, 1000, 'Gram', 'Pack'),
(17, 'Tomato', 9800, 1000, 'Gram', 'Kilogram'),
(18, 'Flour', 8445, 1000, 'Gram', 'Pack'),
(19, 'Milk', 10425, 1000, 'Milliliter', 'Bottle'),
(20, 'Baking powder', 95, 20, 'Spoon', 'Pack'),
(21, 'Shrimp', 9800, 1000, 'Gram', 'Kilogram'),
(22, 'Vegetable', 4998, 1000, 'Gram', 'Kilogram'),
(23, 'Noodle', 9750, 1000, 'Gram', 'Kilogram'),
(24, 'Fish', 19750, 1000, 'Gram', 'Kilogram'),
(25, 'Chicken', 14900, 1000, 'Gram', 'Kilogram'),
(26, 'Ginger', 196, 40, 'Slice', 'Kilogram'),
(27, 'Chicken Broth ', 4650, 1000, 'Milliliter', 'Liter'),
(28, 'Seaweed ', 100, 10, 'Slice', 'Pack'),
(29, 'Vinegar', 5000, 1000, 'Milliliter', 'Bottle'),
(30, 'Avocado', 500, 100, 'Slice', 'Kilogram'),
(33, 'Chives', 500, 100, 'Piece', 'Kilogram'),
(34, 'Squid', 501, 50, 'Piece', 'Kilogram'),
(35, 'Mayonaise', 600, 500, 'Milliliter', 'Bottle'),
(36, 'Eggplant', 100, 10, 'Piece', 'Kilogram'),
(37, 'Chilli', 62, 5, 'Piece', 'Kilogram'),
(38, 'Soy sauce', 1200, 1000, 'Milliliter', 'Liter'),
(40, 'Radish', 100, 5, 'Piece', 'Kilogram'),
(41, 'Tea Bag', 98, 25, 'Bag', 'Pack'),
(42, 'Lemon', 100, 2, 'Piece', 'Kilogram'),
(44, 'Coffee Powder', 0, 1000, 'Gram', 'Kilogram'),
(45, 'Syrup', 1700, 1000, 'Milliliter', 'Liter'),
(46, 'Cream', 1900, 1000, 'Milliliter', 'Liter'),
(47, 'Chocolate Powder', 87490, 250, 'Spoon', 'Kilogram'),
(48, 'Milk Powder', 342, 250, 'Spoon', 'Kilogram'),
(49, 'Clove', 100, 50, 'Piece', 'Kilogram'),
(50, 'Soft Drink', 100, 15, 'Can', 'Pack'),
(51, 'Honey', 100, 50, 'Spoon', 'Bottle'),
(52, 'Jelly', 5075, 500, 'Piece', 'Kilogram'),
(53, 'Coconut Liquid', 5000, 500, 'Milliliter', 'Pack'),
(54, 'Strawberry', 6850, 600, 'Gram', 'Pack'),
(55, 'Yoghurt', 1800, 600, 'Gram', 'Pack'),
(56, 'Butter', 3200, 500, 'Gram', 'Pack');

-- --------------------------------------------------------

--
-- Table structure for table `Kitchen`
--

CREATE TABLE IF NOT EXISTS `Kitchen` (
  `Order_No` int(11) NOT NULL,
  `Priority` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`Priority`),
  KEY `Order_No` (`Order_No`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=19 ;

--
-- Dumping data for table `Kitchen`
--

INSERT INTO `Kitchen` (`Order_No`, `Priority`) VALUES
(17, 17),
(18, 18);

-- --------------------------------------------------------

--
-- Table structure for table `Login`
--

CREATE TABLE IF NOT EXISTS `Login` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Username` varchar(20) NOT NULL DEFAULT '',
  `Password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=13 ;

--
-- Dumping data for table `Login`
--

INSERT INTO `Login` (`Id`, `Username`, `Password`) VALUES
(1, 'admin', 'admin'),
(2, 'cashier', 'cashier'),
(3, 'chef1', 'chef'),
(4, 'waiter1', 'waiter'),
(5, 'waiter2', 'waiter'),
(7, 'waiter3', 'waiter'),
(8, 'waiter4', 'waiter'),
(9, 'chef2', 'chef'),
(10, 'waiter5', 'waiter'),
(11, 'chef3', 'chef'),
(12, 'inventory', 'inventory');

-- --------------------------------------------------------

--
-- Table structure for table `Menu`
--

CREATE TABLE IF NOT EXISTS `Menu` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(20) NOT NULL,
  `Price` int(11) NOT NULL,
  `Category` varchar(8) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=19 ;

--
-- Dumping data for table `Menu`
--

INSERT INTO `Menu` (`Id`, `Name`, `Price`, `Category`) VALUES
(1, 'Aqua', 10000, 'Beverage'),
(2, 'Cold Sweet Tea', 12000, 'Beverage'),
(3, 'Fried Rice', 35000, 'Food'),
(4, 'Omelet', 35000, 'Food'),
(5, 'Spaghetti', 40000, 'Food'),
(6, 'Ramen', 60000, 'Food'),
(7, 'Pancake', 50000, 'Food'),
(8, 'Sushi', 65000, 'Food'),
(9, 'Takoyaki', 45000, 'Food'),
(10, 'Tempura', 50000, 'Food'),
(11, 'Lemon Tea', 18000, 'Beverage'),
(12, 'Coffee', 19000, 'Beverage'),
(13, 'Chocolate Milk', 20000, 'Beverage'),
(14, 'Soft Drink', 15000, 'Beverage'),
(15, 'Pudding', 25000, 'Food'),
(16, 'Cake', 30000, 'Food'),
(17, 'Ice Cream', 24000, 'Food'),
(18, 'Cookie', 19000, 'Food');

-- --------------------------------------------------------

--
-- Table structure for table `Order_List`
--

CREATE TABLE IF NOT EXISTS `Order_List` (
  `Order_No` int(11) NOT NULL AUTO_INCREMENT,
  `Initial_No` varchar(3) NOT NULL,
  `Table_No` varchar(50) NOT NULL,
  `Quantity` int(11) NOT NULL,
  `Menu_Id` int(11) NOT NULL,
  `Staff_Id` int(11) NOT NULL,
  `Status` varchar(10) NOT NULL,
  PRIMARY KEY (`Order_No`),
  KEY `Menu_Id` (`Menu_Id`),
  KEY `Staff_Id` (`Staff_Id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=19 ;

--
-- Dumping data for table `Order_List`
--

INSERT INTO `Order_List` (`Order_No`, `Initial_No`, `Table_No`, `Quantity`, `Menu_Id`, `Staff_Id`, `Status`) VALUES
(7, '1', '1 & 2 & 12', 2, 17, 1, 'DONE'),
(8, '1', '1 & 2 & 12', 1, 7, 1, 'DONE'),
(9, '1', '1 & 2 & 12', 1, 15, 1, 'DONE'),
(10, '1', '1 & 2 & 12', 2, 5, 1, 'DONE'),
(11, '1', '1 & 2 & 12', 1, 13, 1, 'DONE'),
(12, '1', '1 & 2 & 12', 1, 1, 1, 'DONE'),
(17, '12', '1 & 2 & 12', 1, 16, 1, 'QUEUING'),
(18, '12', '1 & 2 & 12', 2, 18, 1, 'QUEUING');

-- --------------------------------------------------------

--
-- Table structure for table `Recipe`
--

CREATE TABLE IF NOT EXISTS `Recipe` (
  `Item_Id` int(11) NOT NULL DEFAULT '0',
  `Requirement` int(11) NOT NULL,
  `Menu_Id` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`Item_Id`,`Menu_Id`),
  KEY `Menu_Id` (`Menu_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Recipe`
--

INSERT INTO `Recipe` (`Item_Id`, `Requirement`, `Menu_Id`) VALUES
(1, 599, 1),
(1, 300, 2),
(1, 50, 4),
(1, 1000, 5),
(1, 1000, 6),
(1, 935, 8),
(1, 200, 10),
(1, 500, 11),
(1, 200, 12),
(1, 300, 13),
(1, 250, 17),
(2, 1, 3),
(2, 2, 8),
(3, 5, 2),
(3, 5, 11),
(4, 2, 2),
(4, 1, 6),
(4, 1, 7),
(4, 2, 8),
(4, 10, 11),
(4, 2, 13),
(4, 3, 15),
(4, 3, 16),
(4, 2, 18),
(5, 1, 3),
(5, 3, 4),
(5, 1, 7),
(5, 3, 9),
(5, 1, 10),
(5, 6, 16),
(5, 1, 18),
(6, 3, 3),
(6, 2, 4),
(6, 6, 5),
(6, 1, 6),
(7, 1, 3),
(7, 1, 4),
(7, 1, 5),
(8, 100, 5),
(8, 250, 10),
(9, 1, 3),
(9, 1, 4),
(9, 1, 6),
(9, 1, 8),
(9, 1, 9),
(10, 100, 3),
(10, 250, 5),
(10, 45, 6),
(10, 30, 9),
(11, 4, 4),
(11, 2, 10),
(12, 1, 4),
(13, 250, 4),
(13, 200, 5),
(13, 250, 6),
(14, 2, 4),
(14, 7, 5),
(15, 2, 4),
(15, 1, 7),
(15, 2, 16),
(16, 400, 5),
(17, 50, 5),
(18, 45, 5),
(18, 100, 7),
(18, 175, 9),
(18, 180, 10),
(18, 175, 16),
(18, 225, 18),
(19, 200, 7),
(19, 400, 15),
(19, 25, 16),
(19, 150, 17),
(20, 1, 7),
(20, 1, 9),
(21, 200, 6),
(21, 100, 10),
(22, 2, 6),
(23, 250, 6),
(24, 250, 6),
(24, 200, 8),
(25, 100, 6),
(26, 4, 6),
(26, 1, 10),
(27, 350, 6),
(27, 350, 9),
(28, 6, 8),
(29, 125, 8),
(29, 30, 10),
(30, 10, 8),
(33, 1, 9),
(34, 2, 9),
(35, 50, 9),
(36, 1, 10),
(37, 5, 3),
(37, 3, 6),
(37, 2, 10),
(38, 30, 3),
(38, 15, 5),
(38, 30, 6),
(38, 100, 9),
(38, 30, 10),
(40, 1, 10),
(41, 1, 2),
(41, 3, 11),
(42, 3, 11),
(44, 50, 12),
(45, 50, 12),
(45, 100, 17),
(46, 100, 12),
(47, 50, 12),
(47, 3, 13),
(47, 1, 16),
(47, 3, 18),
(48, 4, 13),
(50, 1, 14),
(52, 5, 15),
(54, 100, 15),
(54, 50, 17),
(55, 600, 17),
(56, 100, 18);

-- --------------------------------------------------------

--
-- Table structure for table `Sales`
--

CREATE TABLE IF NOT EXISTS `Sales` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Receipt_No` int(11) NOT NULL,
  `Menu_Id` int(11) NOT NULL,
  `Price` int(11) NOT NULL,
  `Quantity` int(11) NOT NULL,
  `Table_No` varchar(50) NOT NULL,
  `Staff_Id` int(11) NOT NULL,
  `Sales_Date` date NOT NULL,
  `CC_Disc_Id` int(11) DEFAULT NULL,
  `CC_Disc_Percent` int(11) DEFAULT NULL,
  `Event_Disc_Id` int(11) DEFAULT NULL,
  `Event_Disc_Percent` int(11) DEFAULT NULL,
  `Total` int(11) DEFAULT NULL,
  PRIMARY KEY (`Id`),
  KEY `Menu_Id` (`Menu_Id`),
  KEY `Staff_Id` (`Staff_Id`),
  KEY `CC_Disc_Id` (`CC_Disc_Id`),
  KEY `Event_Disc_Id` (`Event_Disc_Id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=74 ;

--
-- Dumping data for table `Sales`
--

INSERT INTO `Sales` (`Id`, `Receipt_No`, `Menu_Id`, `Price`, `Quantity`, `Table_No`, `Staff_Id`, `Sales_Date`, `CC_Disc_Id`, `CC_Disc_Percent`, `Event_Disc_Id`, `Event_Disc_Percent`, `Total`) VALUES
(21, 1, 12, 19000, 4, '4 & 7', 1, '2014-06-10', NULL, NULL, 5, 5, 86640),
(22, 1, 4, 35000, 1, '4 & 7', 1, '2014-06-10', NULL, NULL, 5, 5, 39900),
(23, 1, 7, 50000, 2, '4 & 7', 1, '2014-06-10', NULL, NULL, 5, 5, 114000),
(24, 1, 15, 25000, 1, '4 & 7', 1, '2014-06-10', NULL, NULL, 5, 5, 28500),
(25, 1, 10, 50000, 3, '4 & 7', 1, '2014-06-10', NULL, NULL, 5, 5, 171000),
(26, 2, 16, 30000, 2, '1 & 2', 1, '2014-06-11', 1, 10, 3, 5, 61560),
(27, 2, 2, 12000, 1, '1 & 2', 1, '2014-06-11', 1, 10, 3, 5, 12312),
(28, 3, 13, 20000, 2, '1 & 2', 1, '2014-06-12', NULL, NULL, NULL, NULL, 48000),
(29, 3, 11, 18000, 2, '1 & 2', 1, '2014-06-12', NULL, NULL, NULL, NULL, 43200),
(30, 3, 6, 60000, 7, '1 & 2', 1, '2014-06-12', NULL, NULL, NULL, NULL, 504000),
(31, 4, 1, 10000, 1, '5', 1, '2014-06-13', NULL, NULL, NULL, NULL, 12000),
(32, 4, 6, 60000, 1, '5', 1, '2014-06-13', NULL, NULL, NULL, NULL, 72000),
(33, 5, 12, 19000, 2, '5', 1, '2014-06-13', 1, 10, NULL, NULL, 41040),
(34, 5, 5, 40000, 2, '5', 1, '2014-06-13', 1, 10, NULL, NULL, 86400),
(43, 6, 16, 30000, 6, '1 & 5', 1, '2014-06-13', 2, 10, NULL, NULL, 32400),
(44, 6, 13, 20000, 5, '1 & 5', 1, '2014-06-13', 2, 10, NULL, NULL, 21600),
(45, 6, 9, 45000, 1, '1 & 5', 1, '2014-06-13', 2, 10, NULL, NULL, 48600),
(46, 6, 10, 50000, 3, '1 & 5', 1, '2014-06-13', 2, 10, NULL, NULL, 54000),
(47, 7, 13, 20000, 1, '6', 1, '2014-05-14', 1, 10, NULL, NULL, 21600),
(48, 7, 12, 19000, 1, '6', 1, '2014-05-14', 1, 10, NULL, NULL, 20520),
(49, 7, 2, 12000, 1, '6', 1, '2014-05-14', 1, 10, NULL, NULL, 12960),
(50, 7, 18, 19000, 1, '6', 1, '2014-05-14', 1, 10, NULL, NULL, 20520),
(51, 7, 3, 35000, 2, '6', 1, '2014-05-14', 1, 10, NULL, NULL, 75600),
(52, 8, 13, 20000, 1, '2', 1, '2014-07-14', NULL, NULL, NULL, NULL, 24000),
(53, 8, 12, 19000, 1, '2', 1, '2014-07-14', NULL, NULL, NULL, NULL, 22800),
(54, 8, 3, 35000, 2, '2', 1, '2014-06-14', NULL, NULL, NULL, NULL, 84000),
(55, 8, 4, 35000, 2, '2', 1, '2014-06-14', NULL, NULL, NULL, NULL, 84000),
(56, 8, 15, 25000, 3, '2', 1, '2014-06-14', NULL, NULL, NULL, NULL, 90000),
(57, 8, 6, 60000, 1, '2', 1, '2014-06-14', NULL, NULL, NULL, NULL, 72000),
(58, 9, 1, 10000, 2, '1', 1, '2014-06-14', 1, 10, 4, 5, 20520),
(59, 9, 5, 40000, 1, '1', 1, '2014-06-14', 1, 10, 4, 5, 41040),
(60, 10, 3, 35000, 2, '1', 1, '2014-06-14', NULL, NULL, 5, 5, 79800),
(61, 10, 7, 50000, 2, '1', 1, '2014-06-14', NULL, NULL, 5, 5, 114000),
(62, 10, 5, 40000, 1, '1', 1, '2014-06-14', NULL, NULL, 5, 5, 45600),
(63, 11, 4, 35000, 4, '1 & 2', 1, '2014-06-14', NULL, NULL, 4, 5, 159600),
(64, 11, 15, 25000, 1, '1 & 2', 1, '2014-06-14', NULL, NULL, 4, 5, 28500),
(65, 11, 12, 19000, 1, '1 & 2', 1, '2014-06-14', NULL, NULL, 4, 5, 21660),
(66, 12, 1, 10000, 3, '1 & 2', 1, '2014-06-14', NULL, NULL, NULL, NULL, 36000),
(67, 12, 16, 30000, 3, '1 & 2', 1, '2014-06-14', NULL, NULL, NULL, NULL, 108000),
(68, 12, 3, 35000, 2, '1 & 2', 1, '2014-06-14', NULL, NULL, NULL, NULL, 84000),
(69, 12, 7, 50000, 2, '1 & 2', 1, '2014-06-14', NULL, NULL, NULL, NULL, 120000),
(70, 13, 16, 30000, 1, '1 & 2', 1, '2014-06-15', 1, 10, 5, 5, 30780),
(71, 13, 2, 12000, 2, '1 & 2', 1, '2014-06-15', 1, 10, 5, 5, 24624),
(72, 13, 3, 35000, 1, '1 & 2', 1, '2014-06-15', 1, 10, 5, 5, 35910),
(73, 13, 17, 24000, 1, '1 & 2', 1, '2014-06-15', 1, 10, 5, 5, 24624);

-- --------------------------------------------------------

--
-- Table structure for table `Staff`
--

CREATE TABLE IF NOT EXISTS `Staff` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Last_name` varchar(20) NOT NULL,
  `First_name` varchar(20) NOT NULL,
  `User_Id` int(11) DEFAULT NULL,
  `Address` varchar(100) NOT NULL,
  `Phone` varchar(20) NOT NULL,
  `Position` varchar(30) NOT NULL,
  PRIMARY KEY (`Id`),
  KEY `User_Id` (`User_Id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=12 ;

--
-- Dumping data for table `Staff`
--

INSERT INTO `Staff` (`Id`, `Last_name`, `First_name`, `User_Id`, `Address`, `Phone`, `Position`) VALUES
(1, 'Hayami', 'Saori', 4, 'Hiroshima, Japan', '1234567', 'Waiter'),
(2, 'Rudy', 'Rudy', 1, 'Fukushima, Japan', '0856432432', 'Admin'),
(3, 'Yanagimoto', 'Yoshino', 5, 'Kagawa, Japan', '2345678', 'Waiter'),
(4, 'Tawaraya', 'Nari', 7, 'Tokyo, Japan', '3456789', 'Waiter'),
(5, 'Shizuma', 'Naomi', 8, 'Tokushima, Japan', '4567890', 'Waiter'),
(6, 'Tsukioka', 'Kazuko', 10, 'Tokyo, Japan', '5678901', 'Waiter'),
(7, 'Liukapisa Sherlim', 'Edwinner', 3, 'Hokkaido, Japan', '0816432432', 'Chef'),
(8, 'Salimane', 'Valdorista', 9, 'Okinawa, Japan', '0826432432', 'Chef'),
(9, 'Lukito Nagaria', 'Geraldi', 11, 'Osaka, Japan', '0836432432', 'Chef'),
(10, 'Christian Ray', 'Jehoshaphat', 2, 'Shizuoka, Japan', '0846432432', 'Cashier'),
(11, 'Calvin', 'Calvin', 12, 'Hokkaido, Japan', '0866432432', 'Inventory Manager');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `Kitchen`
--
ALTER TABLE `Kitchen`
  ADD CONSTRAINT `Kitchen_ibfk_1` FOREIGN KEY (`Order_No`) REFERENCES `Order_List` (`Order_No`);

--
-- Constraints for table `Order_List`
--
ALTER TABLE `Order_List`
  ADD CONSTRAINT `Order_List_ibfk_1` FOREIGN KEY (`Menu_Id`) REFERENCES `Menu` (`Id`),
  ADD CONSTRAINT `Order_List_ibfk_2` FOREIGN KEY (`Staff_Id`) REFERENCES `Staff` (`Id`);

--
-- Constraints for table `Recipe`
--
ALTER TABLE `Recipe`
  ADD CONSTRAINT `Recipe_ibfk_1` FOREIGN KEY (`Menu_Id`) REFERENCES `Menu` (`Id`),
  ADD CONSTRAINT `Recipe_ibfk_2` FOREIGN KEY (`Item_Id`) REFERENCES `Inventory` (`Id`);

--
-- Constraints for table `Sales`
--
ALTER TABLE `Sales`
  ADD CONSTRAINT `Sales_ibfk_1` FOREIGN KEY (`Menu_Id`) REFERENCES `Menu` (`Id`),
  ADD CONSTRAINT `Sales_ibfk_2` FOREIGN KEY (`Staff_Id`) REFERENCES `Staff` (`Id`),
  ADD CONSTRAINT `Sales_ibfk_3` FOREIGN KEY (`CC_Disc_Id`) REFERENCES `Discount` (`Id`),
  ADD CONSTRAINT `Sales_ibfk_4` FOREIGN KEY (`Event_Disc_Id`) REFERENCES `Discount` (`Id`);

--
-- Constraints for table `Staff`
--
ALTER TABLE `Staff`
  ADD CONSTRAINT `Staff_ibfk_1` FOREIGN KEY (`User_Id`) REFERENCES `Login` (`Id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
