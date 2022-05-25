-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: May 25, 2022 at 09:50 AM
-- Server version: 8.0.23
-- PHP Version: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `techmiss`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
CREATE TABLE IF NOT EXISTS `admin` (
  `AID` char(5) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `fname` varchar(255) NOT NULL,
  `lname` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `address` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `dob` varchar(255) NOT NULL,
  `gender` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `mobile` int DEFAULT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`AID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`AID`, `fname`, `lname`, `address`, `dob`, `gender`, `mobile`, `email`, `password`) VALUES
('A001', 'Chandra', 'Rathnayake', 'Kurunegala', 'YYYY-MM-DD', 'Femal', 714585256, 'chandrarathnayake@gmal.com', 'chandra@12345'),
('A002', 'Kapil', 'Gamage', 'Kandy', 'YYYY-MM-DD', 'Male', 715425865, 'kapilgamage@gmail.com', 'kapil@12345');

-- --------------------------------------------------------

--
-- Table structure for table `attendance`
--

DROP TABLE IF EXISTS `attendance`;
CREATE TABLE IF NOT EXISTS `attendance` (
  `st_id` char(6) NOT NULL,
  `sub_id` char(7) NOT NULL,
  `day` date NOT NULL,
  `type` enum('T','P') NOT NULL,
  `hours` int DEFAULT NULL,
  `status` enum('0','1') DEFAULT NULL,
  PRIMARY KEY (`st_id`,`sub_id`,`day`,`type`),
  KEY `sub_id` (`sub_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `attendance`
--

INSERT INTO `attendance` (`st_id`, `sub_id`, `day`, `type`, `hours`, `status`) VALUES
('tg001', 'ICT2113', '2020-08-01', 'T', 2, '1'),
('tg001', 'ICT2113', '2020-08-02', 'P', 2, '1'),
('tg001', 'ICT2123', '2020-08-01', 'T', 2, '1'),
('tg001', 'ICT2123', '2020-08-02', 'P', 2, '1'),
('tg001', 'ICT2133', '2020-08-01', 'T', 2, '1'),
('tg001', 'ICT2133', '2020-08-02', 'P', 2, '1'),
('tg001', 'ICT2142', '2020-08-01', 'T', 1, '1'),
('tg001', 'ICT2142', '2020-08-02', 'P', 1, '1'),
('tg001', 'ICT2153', '2020-08-01', 'T', 2, '1'),
('tg001', 'ICT2153', '2020-08-02', 'P', 2, '1'),
('tg001', 'TCS2112', '2020-08-01', 'T', 1, '1'),
('tg001', 'TCS2112', '2020-08-02', 'T', 1, '1'),
('tg002', 'ICT2113', '2020-08-01', 'T', 2, '1'),
('tg002', 'ICT2113', '2020-08-02', 'P', 2, '1'),
('tg002', 'ICT2123', '2020-08-01', 'T', 2, '1'),
('tg002', 'ICT2123', '2020-08-02', 'P', 2, '1'),
('tg002', 'ICT2133', '2020-08-01', 'T', 2, '0'),
('tg002', 'ICT2133', '2020-08-02', 'P', 2, '1'),
('tg002', 'ICT2142', '2020-08-01', 'T', 1, '0'),
('tg002', 'ICT2142', '2020-08-02', 'P', 1, '1'),
('tg002', 'ICT2153', '2020-08-01', 'T', 2, '0'),
('tg002', 'ICT2153', '2020-08-02', 'P', 2, '1'),
('tg002', 'TCS2112', '2020-08-01', 'T', 1, '1'),
('tg002', 'TCS2112', '2020-08-02', 'T', 1, '1'),
('tg003', 'ICT2113', '2020-08-01', 'T', 2, '1'),
('tg003', 'ICT2113', '2020-08-02', 'P', 2, '1'),
('tg003', 'ICT2123', '2020-08-01', 'T', 2, '1'),
('tg003', 'ICT2123', '2020-08-02', 'P', 2, '1'),
('tg003', 'ICT2133', '2020-08-01', 'T', 2, '1'),
('tg003', 'ICT2133', '2020-08-02', 'P', 2, '1'),
('tg003', 'ICT2142', '2020-08-01', 'T', 1, '1'),
('tg003', 'ICT2142', '2020-08-02', 'P', 1, '1'),
('tg003', 'ICT2153', '2020-08-01', 'T', 2, '1'),
('tg003', 'ICT2153', '2020-08-02', 'P', 2, '1'),
('tg003', 'TCS2112', '2020-08-01', 'T', 1, '0'),
('tg003', 'TCS2112', '2020-08-02', 'T', 1, '1'),
('tg004', 'ICT2113', '2020-08-01', 'T', 2, '1'),
('tg004', 'ICT2113', '2020-08-02', 'P', 2, '1'),
('tg004', 'ICT2123', '2020-08-01', 'T', 2, '1'),
('tg004', 'ICT2123', '2020-08-02', 'P', 2, '1'),
('tg004', 'ICT2133', '2020-08-01', 'T', 2, '1'),
('tg004', 'ICT2133', '2020-08-02', 'P', 2, '1'),
('tg004', 'ICT2142', '2020-08-01', 'T', 1, '0'),
('tg004', 'ICT2142', '2020-08-02', 'P', 1, '1'),
('tg004', 'ICT2153', '2020-08-01', 'T', 2, '1'),
('tg004', 'ICT2153', '2020-08-02', 'P', 2, '0'),
('tg004', 'TCS2112', '2020-08-01', 'T', 1, '1'),
('tg004', 'TCS2112', '2020-08-02', 'T', 1, '1'),
('tg005', 'ICT2113', '2020-08-01', 'T', 2, '1'),
('tg005', 'ICT2113', '2020-08-02', 'P', 2, '1'),
('tg005', 'ICT2123', '2020-08-01', 'T', 2, '0'),
('tg005', 'ICT2123', '2020-08-02', 'P', 2, '1'),
('tg005', 'ICT2133', '2020-08-01', 'T', 2, '1'),
('tg005', 'ICT2133', '2020-08-02', 'P', 2, '0'),
('tg005', 'ICT2142', '2020-08-01', 'T', 1, '1'),
('tg005', 'ICT2142', '2020-08-02', 'P', 1, '1'),
('tg005', 'ICT2153', '2020-08-01', 'T', 2, '1'),
('tg005', 'ICT2153', '2020-08-02', 'P', 2, '1'),
('tg005', 'TCS2112', '2020-08-01', 'T', 1, '1'),
('tg005', 'TCS2112', '2020-08-02', 'T', 1, '1'),
('tg006', 'ICT2113', '2020-08-01', 'T', 2, '1'),
('tg006', 'ICT2113', '2020-08-02', 'P', 2, '0'),
('tg006', 'ICT2123', '2020-08-01', 'T', 2, '1'),
('tg006', 'ICT2123', '2020-08-02', 'P', 2, '1'),
('tg006', 'ICT2133', '2020-08-01', 'T', 2, '1'),
('tg006', 'ICT2133', '2020-08-02', 'P', 2, '1'),
('tg006', 'ICT2142', '2020-08-01', 'T', 1, '1'),
('tg006', 'ICT2142', '2020-08-02', 'P', 1, '1'),
('tg006', 'ICT2153', '2020-08-01', 'T', 2, '0'),
('tg006', 'ICT2153', '2020-08-02', 'P', 2, '0'),
('tg006', 'TCS2112', '2020-08-01', 'T', 1, '1'),
('tg006', 'TCS2112', '2020-08-02', 'T', 1, '1'),
('tg007', 'ICT2113', '2020-08-01', 'T', 2, '1'),
('tg007', 'ICT2113', '2020-08-02', 'P', 2, '1'),
('tg007', 'ICT2123', '2020-08-01', 'T', 2, '1'),
('tg007', 'ICT2123', '2020-08-02', 'P', 2, '1'),
('tg007', 'ICT2133', '2020-08-01', 'T', 2, '1'),
('tg007', 'ICT2133', '2020-08-02', 'P', 2, '1'),
('tg007', 'ICT2142', '2020-08-01', 'T', 1, '1'),
('tg007', 'ICT2142', '2020-08-02', 'P', 1, '1'),
('tg007', 'ICT2153', '2020-08-01', 'T', 2, '1'),
('tg007', 'ICT2153', '2020-08-02', 'P', 2, '1'),
('tg007', 'TCS2112', '2020-08-01', 'T', 1, '1'),
('tg007', 'TCS2112', '2020-08-02', 'T', 1, '1'),
('tg008', 'ICT2113', '2020-08-01', 'T', 2, '1'),
('tg008', 'ICT2113', '2020-08-02', 'P', 2, '1'),
('tg008', 'ICT2123', '2020-08-01', 'T', 2, '1'),
('tg008', 'ICT2123', '2020-08-02', 'P', 2, '0'),
('tg008', 'ICT2133', '2020-08-01', 'T', 2, '1'),
('tg008', 'ICT2133', '2020-08-02', 'P', 2, '1'),
('tg008', 'ICT2142', '2020-08-01', 'T', 1, '1'),
('tg008', 'ICT2142', '2020-08-02', 'P', 1, '0'),
('tg008', 'ICT2153', '2020-08-01', 'T', 2, '1'),
('tg008', 'ICT2153', '2020-08-02', 'P', 2, '1'),
('tg008', 'TCS2112', '2020-08-01', 'T', 1, '1'),
('tg008', 'TCS2112', '2020-08-02', 'T', 1, '1'),
('tg009', 'ICT2113', '2020-08-01', 'T', 2, '1'),
('tg009', 'ICT2113', '2020-08-02', 'P', 2, '1'),
('tg009', 'ICT2123', '2020-08-01', 'T', 2, '1'),
('tg009', 'ICT2123', '2020-08-02', 'P', 2, '1'),
('tg009', 'ICT2133', '2020-08-01', 'T', 2, '1'),
('tg009', 'ICT2133', '2020-08-02', 'P', 2, '1'),
('tg009', 'ICT2142', '2020-08-01', 'T', 1, '1'),
('tg009', 'ICT2142', '2020-08-02', 'P', 1, '1'),
('tg009', 'ICT2153', '2020-08-01', 'T', 2, '1'),
('tg009', 'ICT2153', '2020-08-02', 'P', 2, '1'),
('tg009', 'TCS2112', '2020-08-01', 'T', 1, '1'),
('tg009', 'TCS2112', '2020-08-02', 'T', 1, '1'),
('tg010', 'ICT2113', '2020-08-01', 'T', 2, '0'),
('tg010', 'ICT2113', '2020-08-02', 'P', 2, '1'),
('tg010', 'ICT2123', '2020-08-01', 'T', 2, '1'),
('tg010', 'ICT2123', '2020-08-02', 'P', 2, '1'),
('tg010', 'ICT2133', '2020-08-01', 'T', 2, '1'),
('tg010', 'ICT2133', '2020-08-02', 'P', 2, '1'),
('tg010', 'ICT2142', '2020-08-01', 'T', 1, '1'),
('tg010', 'ICT2142', '2020-08-02', 'P', 1, '1'),
('tg010', 'ICT2153', '2020-08-01', 'T', 2, '1'),
('tg010', 'ICT2153', '2020-08-02', 'P', 2, '1'),
('tg010', 'TCS2112', '2020-08-01', 'T', 1, '0'),
('tg010', 'TCS2112', '2020-08-02', 'T', 1, '0');

-- --------------------------------------------------------

--
-- Table structure for table `ca_marks`
--

DROP TABLE IF EXISTS `ca_marks`;
CREATE TABLE IF NOT EXISTS `ca_marks` (
  `sub_id` char(7) NOT NULL,
  `st_id` char(6) NOT NULL,
  `q1` decimal(5,2) DEFAULT NULL,
  `q2` decimal(5,2) DEFAULT NULL,
  `q3` decimal(5,2) DEFAULT NULL,
  `q4` decimal(5,2) DEFAULT NULL,
  `ass1` decimal(5,2) DEFAULT NULL,
  `ass2` decimal(5,2) DEFAULT NULL,
  `ass3` decimal(5,2) DEFAULT NULL,
  `mid` decimal(5,2) DEFAULT NULL,
  PRIMARY KEY (`sub_id`,`st_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ca_marks`
--

INSERT INTO `ca_marks` (`sub_id`, `st_id`, `q1`, `q2`, `q3`, `q4`, `ass1`, `ass2`, `ass3`, `mid`) VALUES
('ICT2113', 'tg001', '78.00', '62.00', '54.00', NULL, NULL, NULL, NULL, '65.00'),
('ICT2113', 'tg002', '46.00', '25.00', '96.00', NULL, NULL, NULL, NULL, '84.00'),
('ICT2113', 'tg003', '45.00', '23.00', '89.00', NULL, NULL, NULL, NULL, '68.00'),
('ICT2113', 'tg004', '74.00', '57.00', '56.00', NULL, NULL, NULL, NULL, '85.00'),
('ICT2113', 'tg005', '100.00', '75.00', '84.00', NULL, NULL, NULL, NULL, '0.00'),
('ICT2113', 'tg006', '74.00', '85.00', '96.00', NULL, NULL, NULL, NULL, '32.00'),
('ICT2113', 'tg007', '74.00', '57.00', '56.00', NULL, NULL, NULL, NULL, '85.00'),
('ICT2113', 'tg008', '100.00', '75.00', '84.00', NULL, NULL, NULL, NULL, '0.00'),
('ICT2113', 'tg009', '74.00', '85.00', '96.00', NULL, NULL, NULL, NULL, '32.00'),
('ICT2113', 'tg010', '78.00', '62.00', '54.00', NULL, NULL, NULL, NULL, '65.00'),
('ICT2123', 'tg001', '50.00', '89.00', '45.00', NULL, '65.00', '53.00', '75.00', NULL),
('ICT2123', 'tg002', '76.00', '63.00', '78.00', NULL, '96.00', '59.50', '63.00', NULL),
('ICT2123', 'tg003', '46.00', '89.00', '63.00', NULL, '75.00', '63.00', '73.00', NULL),
('ICT2123', 'tg004', '10.00', '50.00', '45.00', NULL, '65.00', '55.00', '63.00', NULL),
('ICT2123', 'tg005', '89.00', '92.00', '75.00', NULL, '89.00', '62.00', '68.00', NULL),
('ICT2123', 'tg006', '63.00', '76.00', '52.00', NULL, '43.00', '80.00', '63.00', NULL),
('ICT2123', 'tg007', '89.00', '63.00', '41.00', NULL, '63.00', '45.00', '36.00', NULL),
('ICT2123', 'tg008', '79.00', '63.00', '52.00', NULL, '46.00', '93.00', '79.00', NULL),
('ICT2123', 'tg009', '63.00', '45.00', '78.00', NULL, '96.00', '46.00', '70.00', NULL),
('ICT2123', 'tg010', '96.00', '45.00', '73.00', NULL, '45.00', '70.00', '90.00', NULL),
('ICT2133', 'tg001', '25.00', '0.00', '78.00', NULL, NULL, NULL, NULL, '96.00'),
('ICT2133', 'tg002', '56.00', '42.00', '36.00', NULL, NULL, NULL, NULL, '78.00'),
('ICT2133', 'tg003', '99.00', '65.00', '32.00', NULL, NULL, NULL, NULL, '17.00'),
('ICT2133', 'tg004', '88.00', '97.00', '76.00', NULL, NULL, NULL, NULL, '48.00'),
('ICT2133', 'tg005', '25.00', '74.00', '64.00', NULL, NULL, NULL, NULL, '38.00'),
('ICT2133', 'tg006', '75.00', '65.00', '24.00', NULL, NULL, NULL, NULL, '79.00'),
('ICT2133', 'tg007', '99.00', '65.00', '32.00', NULL, NULL, NULL, NULL, '17.00'),
('ICT2133', 'tg008', '88.00', '97.00', '76.00', NULL, NULL, NULL, NULL, '48.00'),
('ICT2133', 'tg009', '25.00', '74.00', '64.00', NULL, NULL, NULL, NULL, '38.00'),
('ICT2133', 'tg010', '75.00', '65.00', '24.00', NULL, NULL, NULL, NULL, '79.00'),
('ICT2142', 'tg001', '80.00', '89.00', '56.00', '23.00', '0.00', '86.00', '0.00', '45.00'),
('ICT2142', 'tg002', '0.00', '89.00', '78.00', '96.00', '73.00', '45.00', NULL, '12.00'),
('ICT2142', 'tg003', '45.00', '36.00', '72.00', '45.00', '69.00', '30.00', NULL, '89.00'),
('ICT2142', 'tg004', '63.00', '75.00', '68.00', '49.00', '63.00', '75.00', NULL, '49.00'),
('ICT2142', 'tg005', '96.00', '79.00', '63.00', '85.00', '91.00', '20.00', NULL, '36.00'),
('ICT2142', 'tg006', '73.00', '84.00', '67.00', '78.00', '37.00', '68.00', NULL, '55.00'),
('ICT2142', 'tg007', '45.00', '36.00', '72.00', '45.00', '67.00', '30.00', '67.00', '89.00'),
('ICT2142', 'tg008', '63.00', '75.00', '68.00', '49.00', '63.00', '75.00', NULL, '49.00'),
('ICT2142', 'tg009', '96.00', '79.00', '63.00', '85.00', '91.00', '20.00', NULL, '36.00'),
('ICT2142', 'tg010', '73.00', '84.00', '67.00', '78.00', '37.00', '68.00', NULL, '55.00'),
('ICT2153', 'tg001', '63.00', '89.00', '45.00', NULL, '63.00', '70.00', '65.50', NULL),
('ICT2153', 'tg002', '89.00', '75.00', '63.00', NULL, '40.00', '63.00', '70.00', NULL),
('ICT2153', 'tg003', '68.00', '87.00', '46.00', NULL, '58.00', '78.00', '47.00', NULL),
('ICT2153', 'tg004', '69.00', '34.00', '15.00', NULL, '78.00', '62.00', '38.00', NULL),
('ICT2153', 'tg005', '57.00', '48.00', '65.00', NULL, '58.00', '66.00', '74.00', NULL),
('ICT2153', 'tg006', '47.00', '52.00', '36.00', NULL, '55.00', '99.00', '65.00', NULL),
('ICT2153', 'tg007', '68.00', '87.00', '46.00', NULL, '58.00', '78.00', '47.00', NULL),
('ICT2153', 'tg008', '69.00', '34.00', '15.00', NULL, '78.00', '62.00', '38.00', NULL),
('ICT2153', 'tg009', '57.00', '48.00', '65.00', NULL, '58.00', '66.00', '74.00', NULL),
('ICT2153', 'tg010', '47.00', '52.00', '36.00', NULL, '55.00', '99.00', '65.00', NULL),
('TCS2112', 'tg001', '63.00', '89.00', '75.00', NULL, '46.00', '56.00', '81.00', NULL),
('TCS2112', 'tg002', '89.00', '78.00', '69.50', NULL, '90.00', '65.00', '76.00', NULL),
('TCS2112', 'tg003', '89.00', '63.00', '41.00', NULL, '63.00', '45.00', '36.00', NULL),
('TCS2112', 'tg004', '79.00', '63.00', '52.00', NULL, '46.00', '93.00', '79.00', NULL),
('TCS2112', 'tg005', '63.00', '45.00', '78.00', NULL, '96.00', '46.00', '70.00', NULL),
('TCS2112', 'tg006', '96.00', '45.00', '73.00', NULL, '45.00', '70.00', '90.00', NULL),
('TCS2112', 'tg007', '89.00', '63.00', '41.00', NULL, '63.00', '45.00', '36.00', NULL),
('TCS2112', 'tg008', '79.00', '63.00', '52.00', NULL, '46.00', '93.00', '79.00', NULL),
('TCS2112', 'tg009', '63.00', '45.00', '78.00', NULL, '96.00', '46.00', '70.00', NULL),
('TCS2112', 'tg010', '96.00', '45.00', '73.00', NULL, '45.00', '70.00', '90.00', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `course`
--

DROP TABLE IF EXISTS `course`;
CREATE TABLE IF NOT EXISTS `course` (
  `co_id` char(4) NOT NULL,
  `co_dept_id` char(6) NOT NULL,
  `co_name` varchar(10) NOT NULL,
  PRIMARY KEY (`co_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `course`
--

INSERT INTO `course` (`co_id`, `co_dept_id`, `co_name`) VALUES
('co01', 'depICT', 'ICT');

-- --------------------------------------------------------

--
-- Table structure for table `department`
--

DROP TABLE IF EXISTS `department`;
CREATE TABLE IF NOT EXISTS `department` (
  `d_id` char(6) NOT NULL,
  `d_name` varchar(40) NOT NULL,
  PRIMARY KEY (`d_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `department`
--

INSERT INTO `department` (`d_id`, `d_name`) VALUES
('depICT', 'Information Communication Technology');

-- --------------------------------------------------------

--
-- Table structure for table `final_exam_marks`
--

DROP TABLE IF EXISTS `final_exam_marks`;
CREATE TABLE IF NOT EXISTS `final_exam_marks` (
  `sub_id` char(7) NOT NULL,
  `st_id` char(6) NOT NULL,
  `practical` decimal(5,2) DEFAULT NULL,
  `theory` decimal(5,2) DEFAULT NULL,
  PRIMARY KEY (`sub_id`,`st_id`),
  KEY `st_id` (`st_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `final_exam_marks`
--

INSERT INTO `final_exam_marks` (`sub_id`, `st_id`, `practical`, `theory`) VALUES
('ICT2113', 'tg001', '54.00', '65.00'),
('ICT2113', 'tg002', '46.00', '24.00'),
('ICT2113', 'tg003', '45.00', '23.00'),
('ICT2113', 'tg004', '74.00', '55.00'),
('ICT2113', 'tg005', '100.00', '0.00'),
('ICT2113', 'tg006', '75.00', '92.00'),
('ICT2123', 'tg001', '80.00', '89.00'),
('ICT2123', 'tg002', '75.00', '65.00'),
('ICT2123', 'tg003', '50.00', '56.00'),
('ICT2123', 'tg004', '65.50', '70.00'),
('ICT2123', 'tg005', '45.90', '60.00'),
('ICT2123', 'tg006', '70.00', '81.00'),
('ICT2133', 'tg001', '78.00', '96.00'),
('ICT2133', 'tg002', '56.00', '78.00'),
('ICT2133', 'tg003', '99.00', '17.00'),
('ICT2133', 'tg004', '76.00', '48.00'),
('ICT2133', 'tg005', '25.00', '38.00'),
('ICT2133', 'tg006', '75.00', '65.00'),
('ICT2142', 'tg001', '0.00', '80.00'),
('ICT2142', 'tg002', NULL, '65.50'),
('ICT2142', 'tg003', NULL, '79.00'),
('ICT2142', 'tg004', NULL, '98.00'),
('ICT2142', 'tg005', NULL, '63.00'),
('ICT2142', 'tg006', NULL, '55.00'),
('ICT2153', 'tg001', '63.00', '0.00'),
('ICT2153', 'tg002', '88.00', '70.00'),
('ICT2153', 'tg003', '68.00', '47.00'),
('ICT2153', 'tg004', '62.00', '38.00'),
('ICT2153', 'tg005', '66.00', '74.00'),
('ICT2153', 'tg006', '47.00', '65.00'),
('TCS2112', 'tg001', '63.00', '75.50'),
('TCS2112', 'tg002', '73.00', '56.00'),
('TCS2112', 'tg003', '50.00', '70.00'),
('TCS2112', 'tg004', '96.00', '49.00'),
('TCS2112', 'tg005', '79.00', '53.00'),
('TCS2112', 'tg006', '96.00', '75.00');

-- --------------------------------------------------------

--
-- Table structure for table `lecturer`
--

DROP TABLE IF EXISTS `lecturer`;
CREATE TABLE IF NOT EXISTS `lecturer` (
  `lec_id` char(5) NOT NULL,
  `lec_dept_id` char(6) NOT NULL,
  `fName` varchar(255) NOT NULL,
  `lName` varchar(255) NOT NULL,
  `dob` date NOT NULL,
  `address` varchar(40) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `gender` enum('F','M') NOT NULL,
  `mobile` int DEFAULT NULL,
  `email` varchar(255) NOT NULL,
  `position` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`lec_id`),
  KEY `lec_dept_id` (`lec_dept_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `medical`
--

DROP TABLE IF EXISTS `medical`;
CREATE TABLE IF NOT EXISTS `medical` (
  `st_id` char(6) NOT NULL,
  `sub_id` char(7) NOT NULL,
  `day` date NOT NULL,
  `type` enum('T','P') NOT NULL,
  `hours` int DEFAULT NULL,
  PRIMARY KEY (`st_id`,`day`,`sub_id`,`type`),
  KEY `sub_id` (`sub_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `medical`
--

INSERT INTO `medical` (`st_id`, `sub_id`, `day`, `type`, `hours`) VALUES
('tg001', 'TCS2112', '2020-08-01', 'T', 2),
('tg002', 'TCS2112', '2020-08-01', 'T', 2),
('tg002', 'ICT2123', '2020-08-02', 'P', 2),
('tg002', 'ICT2153', '2020-08-02', 'P', 2),
('tg003', 'ICT2142', '2020-08-01', 'T', 2),
('tg003', 'ICT2123', '2020-08-02', 'P', 2),
('tg005', 'TCS2112', '2020-08-01', 'T', 2),
('tg006', 'ICT2133', '2020-08-01', 'T', 2),
('tg006', 'ICT2153', '2020-08-02', 'P', 2),
('tg007', 'ICT2113', '2020-08-01', 'T', 2),
('tg007', 'ICT2133', '2020-08-01', 'T', 2),
('tg008', 'ICT2113', '2020-08-01', 'T', 2),
('tg008', 'ICT2142', '2020-08-01', 'T', 2),
('tg008', 'ICT2153', '2020-08-02', 'P', 2),
('tg009', 'ICT2142', '2020-08-01', 'T', 2),
('tg010', 'ICT2113', '2020-08-01', 'T', 2),
('tg010', 'ICT2123', '2020-08-02', 'P', 2);

-- --------------------------------------------------------

--
-- Table structure for table `notice`
--

DROP TABLE IF EXISTS `notice`;
CREATE TABLE IF NOT EXISTS `notice` (
  `no` int NOT NULL AUTO_INCREMENT,
  `date` varchar(10) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `notice` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`no`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `notice`
--

INSERT INTO `notice` (`no`, `date`, `title`, `notice`) VALUES
(1, '2020-08-03', 'Mid Exam', 'Mid examination will be on next week.'),
(2, '2020-08-05', 'Exam time table', 'Al time tables are in techmis');

-- --------------------------------------------------------

--
-- Table structure for table `students`
--

DROP TABLE IF EXISTS `students`;
CREATE TABLE IF NOT EXISTS `students` (
  `SID` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `dep_id` char(6) CHARACTER SET latin1 COLLATE latin1_swedish_ci DEFAULT NULL,
  `fname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `lname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `gender` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `mobile` int DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`SID`),
  KEY `dep_id` (`dep_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `students`
--

INSERT INTO `students` (`SID`, `dep_id`, `fname`, `lname`, `dob`, `gender`, `address`, `email`, `mobile`, `password`) VALUES
('tg001', 'depICT', 'kasun', 'Lakshitha', '1998-08-30', 'M', '23,mainroad.matara', 'kasun@gmail.com', 712736485, 'student01'),
('tg002', 'depICT', 'madurangha', 'lakshith', '2016-05-04', 'M', '56,Palawaththa Road,Polonnaruwa', 'manuranghalakshith@gmail.com', 752347841, 'student02'),
('tg003', 'depICT', 'dasun', 'kannangara', '2013-05-02', 'M', '2B,main road,badulla', 'dasunkannangara@gmail.com', 716123789, 'student03'),
('tg004', 'depICT', 'dasuni', 'pereara', '2022-05-13', 'F', '71/c,new Road,Bibile', 'dasuniperera@gmail.com', 773242539, 'student04'),
('tg005', 'depICT', 'hashini', 'senarath', '2022-05-04', 'F', '112,kandy road,matale', 'hasini@gmail.com', 706791123, 'student05'),
('tg006', 'depICT', 'kasuni', 'nimesha', '2022-05-04', 'F', '66,First Lane,Karandeniya', 'kasuninimesha@gmail.com', 779783255, 'student06'),
('tg007', 'depICT', 'sadun', 'gamage', '2022-05-06', 'M', '23,main road,Rathnapura', 'sadungemage@gmail.com', 788756723, 'student07'),
('tg008', 'depICT', 'tharusha', 'nimana', '2022-05-14', 'F', 'Ambelegoda,Padeniya,Kurunegala', 'Tharushanimna@gmail.com', 775123783, 'student08'),
('tg009', 'depICT', 'dasuni', 'kaveesha', '2022-05-04', 'F', '10,Gajaba Road,Galle', 'dasunikaveesha@gmail.com', 713497134, 'student09'),
('tg010', 'depICT', 'nimesh', 'dilshan', '2022-05-07', 'F', '112,kandy road,matale', 'nimeshdilshan@gmail.com', 706791123, 'student10');

-- --------------------------------------------------------

--
-- Table structure for table `subject`
--

DROP TABLE IF EXISTS `subject`;
CREATE TABLE IF NOT EXISTS `subject` (
  `sub_id` char(7) NOT NULL,
  `sub_co_id` char(4) NOT NULL,
  `sub_name` varchar(50) NOT NULL,
  PRIMARY KEY (`sub_id`),
  KEY `sub_co_id` (`sub_co_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `subject`
--

INSERT INTO `subject` (`sub_id`, `sub_co_id`, `sub_name`) VALUES
('ICT2113', 'co01', 'Data Structures and Algorithms'),
('ICT2123', 'co01', 'Object Oriented Development'),
('ICT2133', 'co01', 'Object Oriented Analysis'),
('ICT2142', 'co01', 'Professional Issues in IT'),
('ICT2153', 'co01', 'internet Application'),
('TCS2112', 'co01', 'Business Economics');

-- --------------------------------------------------------

--
-- Table structure for table `subjects`
--

DROP TABLE IF EXISTS `subjects`;
CREATE TABLE IF NOT EXISTS `subjects` (
  `sub_d_id` char(6) NOT NULL,
  `sub_id` char(7) NOT NULL,
  `sub_co_id` char(4) NOT NULL,
  `sub_name` varchar(50) NOT NULL,
  `lec_id` char(5) NOT NULL,
  PRIMARY KEY (`sub_d_id`,`sub_id`,`sub_co_id`),
  KEY `sub_co_id` (`sub_co_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `subjects`
--

INSERT INTO `subjects` (`sub_d_id`, `sub_id`, `sub_co_id`, `sub_name`, `lec_id`) VALUES
('depICT', 'ICT2113', 'co01', 'Data Structures and Algorithms', 'lec01'),
('depICT', 'ICT2123', 'co01', 'Object Oriented Development', 'lec02'),
('depICT', 'ICT2133', 'co01', 'Object Oriented Analysis', 'lec03'),
('depICT', 'ICT2142', 'co01', 'Professional Issues in IT', 'lec02'),
('depICT', 'ICT2153', 'co01', 'internet Application', 'lec01'),
('depICT', 'TCS2112', 'co01', 'Business Economics', 'lec04');

-- --------------------------------------------------------

--
-- Table structure for table `tecnical_officer`
--

DROP TABLE IF EXISTS `tecnical_officer`;
CREATE TABLE IF NOT EXISTS `tecnical_officer` (
  `TOID` varchar(255) NOT NULL,
  `fname` varchar(255) NOT NULL,
  `lname` varchar(255) NOT NULL,
  `dob` date NOT NULL,
  `gender` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `mobile` int NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`TOID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `user_id` char(5) NOT NULL,
  `fName` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `lName` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `address` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `dob` varchar(255) NOT NULL,
  `gender` varchar(25) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `mobile` int NOT NULL,
  `email` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `password` varchar(15) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`user_id`, `fName`, `lName`, `address`, `dob`, `gender`, `mobile`, `email`, `password`) VALUES
('A001', 'Chandra', 'Rathnayake', 'Kurunegala', 'YYYY-MM-DD', 'Femal', 714585256, 'chandrarathnayake@gmal.com', 'chandra@12345'),
('A002', 'Kapil', 'Gamage', 'Kandy', 'YYYY-MM-DD', 'Male', 715425865, 'kapilgamage@gmail.com', 'kapil@12345');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `attendance`
--
ALTER TABLE `attendance`
  ADD CONSTRAINT `attendance_ibfk_2` FOREIGN KEY (`sub_id`) REFERENCES `subject` (`sub_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `attendance_ibfk_3` FOREIGN KEY (`st_id`) REFERENCES `students` (`SID`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- Constraints for table `ca_marks`
--
ALTER TABLE `ca_marks`
  ADD CONSTRAINT `CA_marks_ibfk_1` FOREIGN KEY (`sub_id`) REFERENCES `subject` (`sub_id`);

--
-- Constraints for table `final_exam_marks`
--
ALTER TABLE `final_exam_marks`
  ADD CONSTRAINT `final_exam_marks_ibfk_1` FOREIGN KEY (`sub_id`) REFERENCES `subject` (`sub_id`),
  ADD CONSTRAINT `final_exam_marks_ibfk_2` FOREIGN KEY (`st_id`) REFERENCES `students` (`SID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `lecturer`
--
ALTER TABLE `lecturer`
  ADD CONSTRAINT `lecturer_ibfk_1` FOREIGN KEY (`lec_dept_id`) REFERENCES `department` (`d_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `medical`
--
ALTER TABLE `medical`
  ADD CONSTRAINT `medical_ibfk_2` FOREIGN KEY (`sub_id`) REFERENCES `subject` (`sub_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `medical_ibfk_3` FOREIGN KEY (`st_id`) REFERENCES `students` (`SID`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- Constraints for table `students`
--
ALTER TABLE `students`
  ADD CONSTRAINT `students_ibfk_1` FOREIGN KEY (`dep_id`) REFERENCES `department` (`d_id`);

--
-- Constraints for table `subject`
--
ALTER TABLE `subject`
  ADD CONSTRAINT `subject_ibfk_1` FOREIGN KEY (`sub_co_id`) REFERENCES `course` (`co_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `subjects`
--
ALTER TABLE `subjects`
  ADD CONSTRAINT `subjects_ibfk_1` FOREIGN KEY (`sub_co_id`) REFERENCES `course` (`co_id`),
  ADD CONSTRAINT `subjects_ibfk_2` FOREIGN KEY (`sub_d_id`) REFERENCES `department` (`d_id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
