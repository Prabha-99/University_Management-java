-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: May 10, 2022 at 07:32 AM
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
-- Database: `techmis`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
CREATE TABLE IF NOT EXISTS `admin` (
  `AID` varchar(255) NOT NULL,
  `fName` varchar(255) NOT NULL,
  `lName` varchar(255) NOT NULL,
  `DOB` date NOT NULL,
  `Gender` varchar(255) NOT NULL,
  `Address` varchar(255) NOT NULL,
  `Email` varchar(255) NOT NULL,
  `Mobile` int NOT NULL,
  `userName` varchar(255) NOT NULL,
  `Password` varchar(255) NOT NULL,
  PRIMARY KEY (`AID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`AID`, `fName`, `lName`, `DOB`, `Gender`, `Address`, `Email`, `Mobile`, `userName`, `Password`) VALUES
('A001', 'Nimal ', 'Perera', '1997-05-10', 'Male', 'Kalutara', 'nimalperera@gmail.com', 764589562, '', '');

-- --------------------------------------------------------

--
-- Table structure for table `attendance`
--

DROP TABLE IF EXISTS `attendance`;
CREATE TABLE IF NOT EXISTS `attendance` (
  `ATDID` varchar(255) NOT NULL,
  `Date` date NOT NULL,
  `Status` varchar(255) NOT NULL,
  PRIMARY KEY (`ATDID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `course`
--

DROP TABLE IF EXISTS `course`;
CREATE TABLE IF NOT EXISTS `course` (
  `CID` varchar(255) NOT NULL,
  `Cname` varchar(255) NOT NULL,
  `Credit` int NOT NULL,
  PRIMARY KEY (`CID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `department`
--

DROP TABLE IF EXISTS `department`;
CREATE TABLE IF NOT EXISTS `department` (
  `DID` varchar(255) NOT NULL,
  `Dname` varchar(255) NOT NULL,
  `noOfStudents` int NOT NULL,
  PRIMARY KEY (`DID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `exam_result`
--

DROP TABLE IF EXISTS `exam_result`;
CREATE TABLE IF NOT EXISTS `exam_result` (
  `EID` varchar(255) NOT NULL,
  `Etype` varchar(255) NOT NULL,
  `Marks` int NOT NULL,
  PRIMARY KEY (`EID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `lecturer`
--

DROP TABLE IF EXISTS `lecturer`;
CREATE TABLE IF NOT EXISTS `lecturer` (
  `LID` varchar(255) NOT NULL,
  `fName` varchar(255) NOT NULL,
  `lName` varchar(255) NOT NULL,
  `DOB` date NOT NULL,
  `Gender` varchar(255) NOT NULL,
  `Position` varchar(255) NOT NULL,
  `Address` varchar(255) NOT NULL,
  `Email` varchar(255) NOT NULL,
  `Mobile` int NOT NULL,
  `Password` varchar(255) NOT NULL,
  PRIMARY KEY (`LID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `lecturer`
--

INSERT INTO `lecturer` (`LID`, `fName`, `lName`, `DOB`, `Gender`, `Position`, `Address`, `Email`, `Mobile`, `Password`) VALUES
('L001', 'Subash', 'jayasinghe', '1963-05-10', 'Male', 'Head', 'Matara', 'subashjayasinghe@gmail.com', 715485692, ''),
('L002', 'Ravihari', 'Liyanage', '1991-05-12', 'Female', 'Probationary', 'Matara', 'ravihariliyanage@gmail.com', 754512569, ''),
('L003', 'Nuwan ', 'Laksiri', '1990-04-12', 'Male', 'Probationary', 'Matara', 'nuwanlaksiri@gmail.com', 715469546, ''),
('L004', 'Malsha', 'Prabuddhi', '1993-02-01', 'Female', 'Probationary', 'Galle', 'malshaprabuddhi@gmail.com', 718956324, '');

-- --------------------------------------------------------

--
-- Table structure for table `medical`
--

DROP TABLE IF EXISTS `medical`;
CREATE TABLE IF NOT EXISTS `medical` (
  `MID` varchar(255) NOT NULL,
  `Start_date` date NOT NULL,
  `End_date` date NOT NULL,
  PRIMARY KEY (`MID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `notice`
--

DROP TABLE IF EXISTS `notice`;
CREATE TABLE IF NOT EXISTS `notice` (
  `NID` varchar(255) NOT NULL,
  `Cname` varchar(255) NOT NULL,
  PRIMARY KEY (`NID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
CREATE TABLE IF NOT EXISTS `student` (
  `SID` varchar(255) NOT NULL,
  `Level` int NOT NULL,
  `DID` varchar(255) NOT NULL,
  `fName` varchar(255) NOT NULL,
  `lName` varchar(255) NOT NULL,
  `DOB` date NOT NULL,
  `Gender` varchar(255) NOT NULL,
  `Address` varchar(255) NOT NULL,
  `Email` varchar(255) NOT NULL,
  `Mobile` int NOT NULL,
  `userName` varchar(255) NOT NULL,
  `Password` varchar(255) NOT NULL,
  PRIMARY KEY (`SID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`SID`, `Level`, `DID`, `fName`, `lName`, `DOB`, `Gender`, `Address`, `Email`, `Mobile`, `userName`, `Password`) VALUES
('S001', 1, 'D1', 'Kasun', 'Tharaka', '2000-05-11', 'Male', 'Rathnapura', 'kasuntharaka@gmail.com', 714586923, '', '12345'),
('S002', 1, 'D1', 'kavindu', 'Lakshan', '2000-04-11', 'Male', 'Colombo', 'kavindulakshan@gmail.com', 764582136, '', '678910'),
('S003', 2, 'D1', 'Nethmi', 'Rashmika', '1999-05-09', 'Female', 'Galle', 'nethmirashmika@gmail.com', 714582632, '', '54321'),
('S004', 2, 'D1', 'Lashan', 'ravindu', '1999-08-10', 'Male', 'Negombo', 'lashanravindu@gmail.com', 774589653, '', ''),
('S005', 2, 'D2', 'Kavindya', 'Adhikari', '1997-03-08', 'Female', 'Colombo', 'kavindyaadhikari@gmail.com', 754689534, '', ''),
('S006', 3, 'D2', 'Sithumi', 'Ayesha', '1997-05-18', 'Female', 'Malabe', 'sithumiayesha@gmail.com', 754623596, '', ''),
('S007', 3, 'D3', 'Janidu', 'Nimsara', '1996-08-16', 'Male', 'Panadura', 'janidunimsara@gmail.com', 754876569, '', ''),
('S008', 2, 'D3', 'Chamara', 'Ranawaka', '1996-05-23', 'Male', 'Matara', 'chamararanawaka@gmail.com', 784512365, '', ''),
('S009', 2, 'D3', 'Senuri', 'Gurusinghe', '1997-07-10', 'Female', 'Kurunegala', 'senurigurusinghe@gmail.com', 754685963, '', ''),
('S010', 4, 'D2', 'kelum', 'dassanayake', '1995-05-12', 'Male', 'Gampaha', 'kelumdassanayake@gmail.com', 718956234, '', '');

-- --------------------------------------------------------

--
-- Table structure for table `technical_officer`
--

DROP TABLE IF EXISTS `technical_officer`;
CREATE TABLE IF NOT EXISTS `technical_officer` (
  `TOID` varchar(255) NOT NULL,
  `fName` varchar(255) NOT NULL,
  `lName` varchar(255) NOT NULL,
  `DOB` date NOT NULL,
  `Gender` varchar(255) NOT NULL,
  `Address` varchar(255) NOT NULL,
  `Email` varchar(255) NOT NULL,
  `Mobile` int NOT NULL,
  `Password` varchar(255) NOT NULL,
  PRIMARY KEY (`TOID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `technical_officer`
--

INSERT INTO `technical_officer` (`TOID`, `fName`, `lName`, `DOB`, `Gender`, `Address`, `Email`, `Mobile`, `Password`) VALUES
('TO001', 'Sarath', 'Kumara', '1973-05-16', 'Male', 'Kegalle', 'sarathkumara@gmail.com', 764589653, ''),
('TO002', 'Thusitha', 'Madhushan', '1997-05-11', 'Male', 'Anuradhapura', 'thusithmadhushan@gmail.com', 718695326, '');

-- --------------------------------------------------------

--
-- Table structure for table `timetable`
--

DROP TABLE IF EXISTS `timetable`;
CREATE TABLE IF NOT EXISTS `timetable` (
  `TTID` varchar(255) NOT NULL,
  `Dname` varchar(255) NOT NULL,
  `Time` time(6) NOT NULL,
  `Date` date NOT NULL,
  PRIMARY KEY (`TTID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `userID` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL,
  `dob` date NOT NULL,
  `gender` varchar(255) NOT NULL,
  `mobile` int NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`ID`, `userID`, `name`, `address`, `dob`, `gender`, `mobile`, `email`, `password`) VALUES
(1, 'S001', 'Prabhashana Wijesinghe', 'Kurunegala', '1999-06-01', 'Male', 714724234, 'prabhashana77@gmail.com', '12345'),
(2, 'L001', 'Malsha Prabuddhi', 'Colombo', '1994-05-10', 'Female', 714585236, 'malshaprabuddhi@gmail.com', '54321'),
(3, 'A001', 'Amal Perera', 'Colombo', '2022-05-04', 'Male', 715689563, 'amalperera@gmail.com', '678910'),
(4, 'TO001', 'Lal Pathirana', 'Matara', '1971-05-15', 'Male', 765485695, 'lalpathirana@gmail.com', '019876'),
(5, 'S002', 'Chamod Rashmitha', 'Kurunegala', '2005-03-21', 'Male', 715869523, 'chamodrashmitha@gmail.com', 'chamod@12345'),
(6, 'A002', 'Kamala Haris', 'Colombo', '1971-05-15', 'Female', 756485695, 'kamalaharis@gmail.com', 'kamala@54321');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
