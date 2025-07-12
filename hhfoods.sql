-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3310
-- Generation Time: Jul 05, 2025 at 04:01 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hhfoods`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` int(11) NOT NULL,
  `username` varchar(200) DEFAULT NULL,
  `name` varchar(200) DEFAULT NULL,
  `email` varchar(200) DEFAULT NULL,
  `mobileNumber` varchar(11) DEFAULT NULL,
  `password` varchar(200) DEFAULT NULL,
  `securityQuestion` varchar(200) DEFAULT NULL,
  `answer` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `username`, `name`, `email`, `mobileNumber`, `password`, `securityQuestion`, `answer`) VALUES
(1, 'admin', 'Shehnsha', 'admin@gmail.com', '03404386437', '123', 'me?', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `bills`
--

CREATE TABLE `bills` (
  `id` int(11) NOT NULL,
  `purchaseID` int(10) DEFAULT NULL,
  `name` varchar(200) DEFAULT NULL,
  `mobileNumber` varchar(200) DEFAULT NULL,
  `email` varchar(200) DEFAULT NULL,
  `date` varchar(50) DEFAULT NULL,
  `total` varchar(200) DEFAULT NULL,
  `createdBy` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `bills`
--

INSERT INTO `bills` (`id`, `purchaseID`, `name`, `mobileNumber`, `email`, `date`, `total`, `createdBy`) VALUES
(1, 81329, 'Husnain', '03404386378', 'hasnain@gmail.com', 'Tuesday, 17-06-2025', '487.2', 'husnain'),
(2, 22061, 'Husnain', '03404386378', 'hasnain@gmail.com', 'Tuesday, 17-06-2025', '661.2', 'husnain'),
(3, 16715, 'Husnain', '03404386378', 'hasnain@gmail.com', 'Friday, 20-06-2025', '4640.0', 'husnain'),
(4, 36731, 'Husnain', '03404386378', 'hasnain@gmail.com', 'Friday, 20-06-2025', '1635.6', 'husnain'),
(6, 26218, 'Rayan', '12345678901', 'rayan@gmail.com', 'Friday, 20-06-2025', '18397.6', 'wbRAYYAN'),
(7, 94226, 'Hasnain', '03404386478', 'hasnain21@gmail.com', 'Friday, 04-07-2025', '1914.0', 'hasnain12');

-- --------------------------------------------------------

--
-- Table structure for table `items`
--

CREATE TABLE `items` (
  `id` int(11) NOT NULL,
  `name` varchar(200) DEFAULT NULL,
  `price` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `items`
--

INSERT INTO `items` (`id`, `name`, `price`) VALUES
(1, 'Cheese Burger', '400'),
(2, 'Sandwich', '200'),
(3, 'Hot Dog', '180'),
(4, 'Fried Chicken (6pcs)', '450'),
(5, 'French Fries', '150'),
(6, 'Doner Kebab', '300'),
(7, 'Zinger Burger', '270'),
(8, 'Jumbo Zinger', '350'),
(9, 'Beef Burger', '320'),
(10, 'Vegetable Roll', '120'),
(11, 'Chicken Roll', '150'),
(12, 'Zinger Roll', '200'),
(13, 'Cheese Stick (6pcs)', '220'),
(14, 'Chicken Stick (6pcs)', '240'),
(15, 'Crispy Wings (6pcs)', '300'),
(16, 'Chicken Nuggets (6pcs)', '260'),
(17, 'Buffalo Wings (6pcs)', '320'),
(18, 'Any Liter Drinks', '180');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `username` varchar(200) DEFAULT NULL,
  `name` varchar(200) DEFAULT NULL,
  `email` varchar(200) DEFAULT NULL,
  `mobileNumber` varchar(11) DEFAULT NULL,
  `password` varchar(200) DEFAULT NULL,
  `securityQuestion` varchar(200) DEFAULT NULL,
  `answer` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `username`, `name`, `email`, `mobileNumber`, `password`, `securityQuestion`, `answer`) VALUES
(1, 'husnain', 'Husnain', 'hasnain@gmail.com', '03404386378', '123', 'my name?', 'shehnsha'),
(2, 'wbRAYYAN', 'Rayan', 'rayan@gmail.com', '12345678901', 'you', 'Me', 'myself'),
(3, 'rayyan', 'rayyan', 'rayyan@gmail.com', '03404386378', '123', 'me?', 'Shanto'),
(4, 'muneeb', 'muneeb', 'muneeb@gmail.com', '03404386378', '123', 'naam', 'muneeb'),
(5, 'Hassaan', 'Hassaan', 'Hassaan@gmail.com', '03404386378', '123456', 'me?', 'Hassaan'),
(6, 'hasnain12', 'Hasnain', 'hasnain21@gmail.com', '03404386478', '123456', 'me?', 'Hasnain');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `username` (`username`);

--
-- Indexes for table `bills`
--
ALTER TABLE `bills`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `purchaseID` (`purchaseID`);

--
-- Indexes for table `items`
--
ALTER TABLE `items`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `username` (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `bills`
--
ALTER TABLE `bills`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `items`
--
ALTER TABLE `items`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
