-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: May 27, 2022 at 04:31 AM
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
  `AID` char(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `fname` varchar(255) NOT NULL,
  `lname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `dob` varchar(255) NOT NULL,
  `gender` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `mobile` int DEFAULT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`AID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`AID`, `fname`, `lname`, `address`, `dob`, `gender`, `mobile`, `email`, `password`) VALUES
('A001', 'Chandra', 'Rathnayake', 'Kurunegala', 'YYYY-MM-DD', 'Femal', 714585256, 'chandrarathnayake@gmal.com', 'chandra@12345');

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

-- --------------------------------------------------------

--
-- Table structure for table `course`
--

DROP TABLE IF EXISTS `course`;
CREATE TABLE IF NOT EXISTS `course` (
  `co_id` char(4) NOT NULL,
  `co_dept_id` char(6) NOT NULL,
  `co_name` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  PRIMARY KEY (`co_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `course`
--

INSERT INTO `course` (`co_id`, `co_dept_id`, `co_name`) VALUES
('C001', 'depICT', 'Computer Architecture');

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
('depBST', 'Bio Systems Technology'),
('depET', 'Engineering Technology'),
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
  `dob` varchar(255) NOT NULL,
  `address` varchar(40) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `gender` varchar(25) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `mobile` int DEFAULT NULL,
  `email` varchar(255) NOT NULL,
  `position` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`lec_id`),
  KEY `lec_dept_id` (`lec_dept_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `lecturer`
--

INSERT INTO `lecturer` (`lec_id`, `lec_dept_id`, `fName`, `lName`, `dob`, `address`, `gender`, `mobile`, `email`, `position`, `password`) VALUES
('L001', 'depICT', 'Malsha', 'Prabuddhi', 'Colombo', 'YYYY-MM-DD', 'Female', 714521528, 'malshaprabuddhi@gmail.com', 'malsha@12345', 'Probationary');

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

-- --------------------------------------------------------

--
-- Table structure for table `notice`
--

DROP TABLE IF EXISTS `notice`;
CREATE TABLE IF NOT EXISTS `notice` (
  `no` int NOT NULL AUTO_INCREMENT,
  `date` varchar(10) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `notice` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci,
  PRIMARY KEY (`no`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `notice`
--

INSERT INTO `notice` (`no`, `date`, `title`, `notice`) VALUES
(1, 'YYYY-MM-DD', 'Exam Results', 'Level 1 Semester 1 and 2 Exam result of DICT \nnow available in Techmis.'),
(2, 'YYYY-MM-DD', 'Batch Gathering', 'Thjhvwdjkvbfdklvjbwdfklvkljfvfkljvfvb\nngfnd\nfgbfgbfgebfgbfgbfgbf\nbfgbfgbfgbfgbfgbfdbdgbfgbgsbgsb');

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
  `address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `dob` varchar(255) DEFAULT NULL,
  `gender` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `mobile` int DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`SID`),
  KEY `dep_id` (`dep_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `students`
--

INSERT INTO `students` (`SID`, `dep_id`, `fname`, `lname`, `address`, `dob`, `gender`, `email`, `mobile`, `password`) VALUES
('S001', 'depICT', 'Prabhashana', 'Wijesinghe', 'Kurunegala', 'YYYY-MM-DD', 'Male', 'prabhashanawijesinghe@gmail.com', 714724234, '12345');

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

-- --------------------------------------------------------

--
-- Table structure for table `tecnical_officer`
--

DROP TABLE IF EXISTS `tecnical_officer`;
CREATE TABLE IF NOT EXISTS `tecnical_officer` (
  `TOID` varchar(255) NOT NULL,
  `fname` varchar(255) NOT NULL,
  `lname` varchar(255) NOT NULL,
  `address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `dob` varchar(255) NOT NULL,
  `gender` varchar(255) NOT NULL,
  `mobile` int DEFAULT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`TOID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `tecnical_officer`
--

INSERT INTO `tecnical_officer` (`TOID`, `fname`, `lname`, `address`, `dob`, `gender`, `mobile`, `email`, `password`) VALUES
('TO001', 'Kasun', 'Gamage', 'Kalutara', 'YYYY-MM-DD', 'Male', 714525896, 'kasungamage@gmail.com', 'kasun@12345');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `user_id` char(5) NOT NULL,
  `fName` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `lName` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `dob` varchar(255) NOT NULL,
  `gender` varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `mobile` int DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `password` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`user_id`, `fName`, `lName`, `address`, `dob`, `gender`, `mobile`, `email`, `password`) VALUES
('A001', 'Chandra', 'Rathnayake', 'Kurunegala', 'YYYY-MM-DD', 'Femal', 714585256, 'chandrarathnayake@gmal.com', 'chandra@12345'),
('L001', 'Malsha', 'Prabuddhi', 'Colombo', 'YYYY-MM-DD', 'Female', 714521528, 'malshaprabuddhi@gmail.com', 'malsha@12345'),
('L002', 'Subash', 'Jayasinghe', 'Matara', 'YYYY-MM-DD', 'Male', 714525856, 'subashjayasinghe@gmail.com', 'subash@12345'),
('S001', 'Prabhashana', 'Wijesinghe', 'Kurunegala', 'YYYY-MM-DD', 'Male', 714724234, 'prabhashanawijesinghe@gmail.com', '12345'),
('TO001', 'Kasun', 'Gamage', 'Kalutara', 'YYYY-MM-DD', 'Male', 714525896, 'kasungamage@gmail.com', 'kasun@12345');

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
