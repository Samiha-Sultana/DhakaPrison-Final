CREATE DATABASE  IF NOT EXISTS `projecttopup` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `projecttopup`;
-- MySQL dump 10.13  Distrib 5.5.16, for Win32 (x86)
--
-- Host: localhost    Database: projecttopup
-- ------------------------------------------------------
-- Server version	5.5.29

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `doctor`
--

DROP TABLE IF EXISTS `doctor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `doctor` (
  `Doctor_ID` varchar(45) NOT NULL,
  `Doctor_Name` varchar(45) DEFAULT NULL,
  `Prisoner_ID` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Doctor_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `doctor`
--

LOCK TABLES `doctor` WRITE;
/*!40000 ALTER TABLE `doctor` DISABLE KEYS */;
INSERT INTO `doctor` VALUES ('011','Suraiya Tairin Pakhi','1'),('012','Depankar Chaki','2'),('013','Nikita Nazeefa','3'),('014','Rubaiyat Sir','4'),('015','Lady Sherlock','5'),('016','Habiba Jannat','6');
/*!40000 ALTER TABLE `doctor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `executioner`
--

DROP TABLE IF EXISTS `executioner`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `executioner` (
  `National_ID` varchar(45) NOT NULL,
  `Executioner_ID` varchar(45) DEFAULT NULL,
  `Executioner_Name` varchar(45) DEFAULT NULL,
  `Prisoner_ID` varchar(45) DEFAULT NULL,
  `Duty_Date` date DEFAULT NULL,
  PRIMARY KEY (`National_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `executioner`
--

LOCK TABLES `executioner` WRITE;
/*!40000 ALTER TABLE `executioner` DISABLE KEYS */;
INSERT INTO `executioner` VALUES ('7','001','Kopa Samsu','5','2019-02-05'),('8','002','Koala Murara','6','2019-01-01');
/*!40000 ALTER TABLE `executioner` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `guard`
--

DROP TABLE IF EXISTS `guard`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `guard` (
  `Guard_ID` varchar(45) NOT NULL,
  `Guard_Name` varchar(45) DEFAULT NULL,
  `Cell_No` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Guard_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `guard`
--

LOCK TABLES `guard` WRITE;
/*!40000 ALTER TABLE `guard` DISABLE KEYS */;
INSERT INTO `guard` VALUES ('100','Nafeefa Miss','2'),('200','Faisal Sir','1');
/*!40000 ALTER TABLE `guard` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `login` (
  `Admin_Username` varchar(45) NOT NULL,
  `Admin_Name` varchar(45) DEFAULT NULL,
  `Password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Admin_Username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES ('Farjiya125','Farjiya Binte Mahbub Oishee','125'),('Raysrmr','Mohammad Raffic Rasul','rays'),('Samiha123','Samiha Sabrin Shukur','123'),('Samiha124','Samiha Sultana','124'),('Shreyashee126','Farhana Azad Shreyashee','126');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prisoner`
--

DROP TABLE IF EXISTS `prisoner`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `prisoner` (
  `National_ID` varchar(100) NOT NULL,
  `Prisoner_ID` varchar(100) DEFAULT NULL,
  `Prisoner_Name` varchar(100) DEFAULT NULL,
  `Entry_Date` date DEFAULT NULL,
  `Release_Date` date DEFAULT NULL,
  `Address` varchar(100) DEFAULT NULL,
  `Crime_Name` varchar(100) DEFAULT NULL,
  `Cell_No` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`National_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prisoner`
--

LOCK TABLES `prisoner` WRITE;
/*!40000 ALTER TABLE `prisoner` DISABLE KEYS */;
INSERT INTO `prisoner` VALUES ('1','1','Samiha','2019-02-03','2019-02-03','Narshindi ','Stalking','1'),('2','2','Shreyashee','2016-08-31','2018-09-20','Noakhali','Stealing Food','2'),('3','3','Sabrin','2016-09-25','2018-10-20','Barisal','Driving Too fast','2'),('4','4','Farjiya','2018-01-01','2018-12-12','Comilla','Pickpocketing','1');
/*!40000 ALTER TABLE `prisoner` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prisonertype2`
--

DROP TABLE IF EXISTS `prisonertype2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `prisonertype2` (
  `National_ID` varchar(45) NOT NULL,
  `Prisoner_ID` varchar(45) DEFAULT NULL,
  `Prisoner_Name` varchar(45) DEFAULT NULL,
  `Entry_Date` date DEFAULT NULL,
  `Execution_Date` date DEFAULT NULL,
  `Address` varchar(45) DEFAULT NULL,
  `Crime_Name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`National_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prisonertype2`
--

LOCK TABLES `prisonertype2` WRITE;
/*!40000 ALTER TABLE `prisonertype2` DISABLE KEYS */;
INSERT INTO `prisonertype2` VALUES ('5','5','Sherlock Homes','2019-01-03','2019-02-05','Gabtoli','Con Artist'),('6','6','Osama Bin Laden','2018-01-01','2019-01-01','Barisal','Murder');
/*!40000 ALTER TABLE `prisonertype2` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-04-17 12:08:54
