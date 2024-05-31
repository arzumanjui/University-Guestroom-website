-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Apr 05, 2022 at 07:39 PM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bauet_guestroom`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `username` varchar(500) NOT NULL,
  `password` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`username`, `password`) VALUES
('admin', '1234');

-- --------------------------------------------------------

--
-- Table structure for table `rooms`
--

CREATE TABLE `rooms` (
  `id` int(1) NOT NULL,
  `gender` varchar(500) NOT NULL,
  `information` varchar(1000) DEFAULT NULL,
  `fee` varchar(500) NOT NULL,
  `isEmpty` varchar(500) NOT NULL DEFAULT '0',
  `current_guest` varchar(500) NOT NULL DEFAULT 'N/A'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `rooms`
--

INSERT INTO `rooms` (`id`, `gender`, `information`, `fee`, `isEmpty`, `current_guest`) VALUES
(1, 'Male', 'Room for nothingh', '200', '0', 'N/A'),
(2, 'Female', 'Room for coadding', '600', '0', 'N/A'),
(3, 'Female', 'there is a room named jkdosen \njdsoier os\nfdofie', '700', '0', 'N/A'),
(4, 'Female', 'Ac room\nAll are set', '1200', '0', 'N/A'),
(5, 'Male', 'dfjseom \nfsopf unweor ks;\nfsfin so', '700', '1', '4'),
(6, 'Male', 'ki obostha mamu?', '1500', '0', 'N/A'),
(7, 'Male', 'ki obostha mimi\namaker vule geso?', '824729', '1', '2'),
(8, 'Male', 'dsl\nfsoi e\nfkspoifk', '2000', '0', 'N/A'),
(9, 'Male', 'ac room', '3000', '0', 'N/A');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(1) NOT NULL,
  `name` varchar(500) DEFAULT NULL,
  `phone_no` varchar(100) DEFAULT NULL,
  `email` varchar(500) DEFAULT NULL,
  `address` varchar(1000) DEFAULT NULL,
  `professional` varchar(500) DEFAULT NULL,
  `gender` varchar(100) DEFAULT NULL,
  `isAlloted` int(11) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `name`, `phone_no`, `email`, `address`, `professional`, `gender`, `isAlloted`) VALUES
(1, 'Suvash Kumar', '01717601509', 'suvashkumarsumon@yahoo.com', 'Binodpur, Rajshahi', 'SWE, Tinkers Technologies Limited', 'Male', 0),
(2, 'Anik Modok', '794792384', 'sfjdjfslk@kfjs.com', 'sdfjoen seiro s', 'dfesofsojuioe', 'Male', 1),
(3, 'Anamika Mondol Mimi', '72947298', 'anamikamondolmimi@gmail.com', 'Mirjapur, Binodpur', 'Member, RUEC', 'Female', 0),
(4, 'Anik Modok', '034089402934', 'anik@gmail.com', 'Hellojseo jiodfs', 'dfjoeri slkjfoisdjfos', 'Male', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `rooms`
--
ALTER TABLE `rooms`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `rooms`
--
ALTER TABLE `rooms`
  MODIFY `id` int(1) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(1) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
