# LEGODB

Mysql v 8

password: lego

To set up a database with the folowing:
Database: lego
table: pieces
	Columns:
		id 			varchar(7)
		type 		varchar(30)
		colour 		varchar(30)
		width 		int(2)		//as number of studs
		length 		int(2)		//as number of studs
		stock 		int(3)
		used 		int(3)
		remaining 	int(3)

Go to mysql command line and paste these in order:
CREATE DATABASE lego;
USE lego;
CREATE TABLE pieces(id varchar(7), type varchar(30), colour varchar(30), width int(2), length int(2), stock int(3), used int(3), remaining(3));