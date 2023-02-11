-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Feb 11, 2023 at 07:13 PM
-- Server version: 5.7.36
-- PHP Version: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `phonebook`
--

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE IF NOT EXISTS `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(30);

-- --------------------------------------------------------

--
-- Table structure for table `todo`
--

DROP TABLE IF EXISTS `todo`;
CREATE TABLE IF NOT EXISTS `todo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(250) COLLATE utf8_turkish_ci NOT NULL,
  `sumary` varchar(250) COLLATE utf8_turkish_ci NOT NULL,
  `decripton` varchar(250) COLLATE utf8_turkish_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=30 DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Dumping data for table `todo`
--

INSERT INTO `todo` (`id`, `name`, `sumary`, `decripton`) VALUES
(1, 'jhfdjksd', 'sdf', 'sdfsdf'),
(25, 'mmmmmmmmm', 'sdf', 'sdfsdf'),
(16, 'jhfdjksd', 'sdf', 'sdfsdf'),
(17, 'jhfdjksd', 'sdf', 'sdfsdf'),
(18, 'jhfdjksd', 'sdf', 'sdfsdf'),
(19, 'jhfdjksd', 'sdf', 'sdfsdf'),
(20, 'jhfdjksd', 'sdf', 'sdfsdf'),
(21, 'jhfdjksd', 'sdf', 'sdfsdf'),
(22, 'mmmmmmmmm', 'sdf', 'sdfsdf'),
(23, 'mmmmmmmmm', 'sdf', 'sdfsdf'),
(24, 'mmmmmmmmm', 'sdf', 'sdfsdf'),
(26, 'mmmmmmmmm', 'sdf', 'sdfsdf'),
(27, 'mmmmmmmmm', 'sdf', 'sdfsdf'),
(28, 'mmmmmmmmm', 'sdf', 'sdfsdf'),
(29, 'mmmmmmmmm', 'sdf', 'sdfsdf');

-- --------------------------------------------------------

--
-- Table structure for table `tutorial`
--

DROP TABLE IF EXISTS `tutorial`;
CREATE TABLE IF NOT EXISTS `tutorial` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(250) COLLATE utf8_turkish_ci NOT NULL,
  `description` varchar(250) COLLATE utf8_turkish_ci NOT NULL,
  `published` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=14 DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Dumping data for table `tutorial`
--

INSERT INTO `tutorial` (`id`, `title`, `description`, `published`) VALUES
(1, 'dfgdfg', 'dfgdfg', 1),
(2, 'ffffffffffffff', 'dfgdfg', 1),
(3, 'dfgdfg', 'dfgdfg', 1),
(4, 'dfgdfg', 'dfgdfg', 1),
(5, 'dfgdfg', 'dfgdfg', 0),
(6, 'dfgdfg', 'dfgdfg', 0),
(7, 'dfgdfg', 'dfgdfg', 0),
(8, 'dfgdfg', 'dfgdfg', 0),
(9, 'dfgdfg', 'dfgdfg', 0),
(10, 'dfgdfg', 'dfgdfg', 0),
(11, 'dfgdfg', 'dfgdfg', 0),
(12, 'dfgdfg', 'dfgdfg', 0),
(13, 'dfgdfg', 'dfgdfg', 0);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(250) COLLATE utf8_turkish_ci NOT NULL,
  `email` int(250) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
