//	https://www.sqlite.org/download.html
//		Precompiled Binaries for Windows
//			A bundle of command-line tools for managing SQLite database files
//				sqlite3.exe
//	.help
//	.open mydb.db
//	.databases
//DDL create drop alter truncate rename
//KEYS primary foreign ////TYPES null integer real/float/numeric text char/varchar blob
//	create table mytable(col1fkto INTEGER PRIMARY KEY NOT NULL UNIQUE, col2 TEXT);
//	create table myfktable(col1 INTEGER PRIMARY KEY NOT NULL UNIQUE, col2 TEXT, col3fkfrom integer, 
//			foreign key(col3fkfrom) references mytable(col1fkto)	);
//	pragma foreign_keys=ON; // activating foreign key feature
//.tables
//DML insert delete update
//	insert into mytable(col2,col1fkto) VALUES("col2 data2",200); // special order case
//	insert into mytable VALUES(100,"col2 data1"); // usual order
//	insert into myfktable VALUES(1,"col2 data1","col3 data1",100);
//	delete from mytable WHERE col2 = 'Value';
//	update mytable SET col2 = 'NEW_Value' WHERE col1fkto = 159;

//QUERY select from where
//	select * from mytable; // * means all
//	select col2,col3 from myfktable;
//	select distinct col2 from myfktable; // remove duplicates from one column 
//	select distinct col2,col3 from myfktable; //// two columns are considered as one name
//// > >= < <= = <> AND OR NOT LIKE BETWEEN _ AND _
//	select col2,col3 from myfktable WHERE col2 = 'Value';
//	select col2,col3 from myfktable WHERE col2 <> 'Value'; // !=
//	select col2,col3 from myfktable WHERE col2 LIKE 'A%'; // begins with A
//	select col2,col3 from myfktable WHERE col2 LIKE '%Z'; // ends with Z
//	select col2,col3 from myfktable WHERE col2 LIKE '%part%'; // contains part
//	select col2,col3 from myfktable WHERE col2 IN ('Value1','Value2'); // col value equals Value1 or Value2 
//		select col2,col3 from myfktable WHERE col2 = 'Value1' AND col2 = 'Value2'; the same result  		
//	select col2,col3 from myfktable WHERE col2 NOT IN ('Value1','Value2'); // col value other than Value1 or Value2 
//	select col2,col3 from myfktable WHERE col3fkfrom > 100; 
//	select col2,col3 from myfktable WHERE col3fkfrom BETWEEN 0 AND 200; 
//	select col2,col3 from myfktable WHERE col1 ROLL 0 TO 5; 
//	select col2,col3 from myfktable WHERE col3fkfrom > 100 AND col2='Value'; 
//	select col2,col3 from myfktable WHERE col3fkfrom > 100 AND NOT (col2='Value'); 

//	select * from mytable ORDER BY col2; // a-z
//	select * from mytable ORDER BY col2 DESC; // z-a

////// 												JOINING
//	select * from mytable WHERE myfktable.col3fkfrom=mytable.col1fkto;
//	select * from myfktable FKT, mytable T WHERE FKT.col3fkfrom=T.col1fkto;
//	select * from myfktable JOIN mytable ON myfktable.col3fkfrom=mytable.col1fkto;
//	select * from myfktable FKT JOIN mytable T ON FKT.col3fkfrom=T.col1fkto;

////// 												AGGEREGATION FUNCTION
//	select col2 from myfktable GROUP BY col2
//	select COUNT(*),col2 from myfktable GROUP BY col2
//	select COUNT(*),col2 from myfktable GROUP BY col2 HAVING COUNT(*) >= 2;

//	select COUNT(*) from myfktable; // number of entries
//	select COUNT(col1) from myfktable; // number of entries
//	select COUNT(col2) from myfktable; // number of entries
//	select MAX(col1) from myfktable; // max of integer values
//	select MIN(col1) from myfktable; // min of integer values
//	select SUM(col1) from myfktable; // sum of integer values
//	select AVG(col1) from myfktable; // average of integer values

//	select MAX(col1),col2 from myfktable GROUP BY col2; // max value of grouped values
//	select SUM(col1),col2 from myfktable GROUP BY col2; // sum of grouped values
//	select COUNT(col1),col2 from myfktable GROUP BY col2; // count value of grouped values

////// 												UNION	INTERSECT	EXCEPT
//	select * from myfktable WHERE col2 = 'Value1';
//	select * from myfktable WHERE col2 = 'Value2';
//	select * from myfktable WHERE col2 = 'Value1' UNION select * from myfktable WHERE col2 = 'Value2';
//	select col2 from myfktable WHERE col2 = 'Value1' 
//		UNION select col2 from myfktable WHERE col2 = 'Value2'; // union combines duplicates
//	select col2 from myfktable WHERE col2 = 'Value1' 
//		INTERSECT select col2 from myfktable WHERE col2 = 'Value2'; // INTERSECT shows common values
//	select col2 from myfktable WHERE col2 = 'Value1' 
//		EXCEPT select col2 from myfktable WHERE col2 = 'Value2'; // EXCEPT shows values absent in the 1st condition

////// 												SUBQUERY
//	select * from myfktable WHERE col2 IN (select col2 from myfktable WHERE col2 = 'Value2');
//	select * from myfktable WHERE col2 = (select col3fkfrom from myfktable WHERE col3 = 'Value2');
//	select * from myfktable WHERE col2 = (select AVG(col3fkfrom) from myfktable );



package syntax.jdbc;

public class SQLiteDemo00 { }
