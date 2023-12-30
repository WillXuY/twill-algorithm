Create table If Not Exists Department (id int, revenue int, month varchar(5))
Truncate table Department
insert into Department (id, revenue, month) values ('1', '8000', 'Jan')
insert into Department (id, revenue, month) values ('2', '9000', 'Jan')
insert into Department (id, revenue, month) values ('3', '10000', 'Feb')
insert into Department (id, revenue, month) values ('1', '7000', 'Feb')
insert into Department (id, revenue, month) values ('1', '6000', 'Mar')

/*
+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| id          | int     |
| revenue     | int     |
| month       | varchar |
+-------------+---------+
(id, month) is the primary key of this table.
The table has information about the revenue of each department per month.
The month has values in ["Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"].

Write an SQL query to reformat the table such that there is a department id
column and a revenue column for each month.
Return the result table in any order.
The query result format is in the following example.

Input:
Department table:
+------+---------+-------+
| id   | revenue | month |
+------+---------+-------+
| 1    | 8000    | Jan   |
| 2    | 9000    | Jan   |
| 3    | 10000   | Feb   |
| 1    | 7000    | Feb   |
| 1    | 6000    | Mar   |
+------+---------+-------+
Output:
+------+-------------+-------------+-------------+-----+-------------+
| id   | Jan_Revenue | Feb_Revenue | Mar_Revenue | ... | Dec_Revenue |
+------+-------------+-------------+-------------+-----+-------------+
| 1    | 8000        | 7000        | 6000        | ... | null        |
| 2    | 9000        | null        | null        | ... | null        |
| 3    | null        | 10000       | null        | ... | null        |
+------+-------------+-------------+-------------+-----+-------------+
Explanation: The revenue from Apr to Dec is null.
Note that the result table has 13 columns (1 for the department id + 12 for the months).
 */

select id from Department group by id order by id

SELECT id_table.id, Jan.revenue as Jan_Revenue, Feb.revenue as Feb_Revenue,
  Mar.revenue as Mar_Revenue, Apr.revenue as Apr_Revenue,
  May.revenue as May_Revenue, Jun.revenue as Jun_Revenue,
  Jul.revenue as Jul_Revenue, Aug.revenue as Aug_Revenue,
  Sep.revenue as Sep_Revenue, Oct.revenue as Oct_Revenue,
  Nov.revenue as Nov_Revenue, Dece.revenue as Dec_Revenue
FROM (select id from Department group by id order by id) id_table
Left join Department Jan on id_table.id = Jan.id and Jan.month = 'Jan'
Left join Department Feb on id_table.id = Feb.id and Feb.month = 'Feb'
Left join Department Mar on id_table.id = Mar.id and Mar.month = 'Mar'
Left join Department Apr on id_table.id = Apr.id and Apr.month = 'Apr'
Left join Department May on id_table.id = May.id and May.month = 'May'
Left join Department Jun on id_table.id = Jun.id and Jun.month = 'Jun'
Left join Department Jul on id_table.id = Jul.id and Jul.month = 'Jul'
Left join Department Aug on id_table.id = Aug.id and Aug.month = 'Aug'
Left join Department Sep on id_table.id = Sep.id and Sep.month = 'Sep'
Left join Department Oct on id_table.id = Oct.id and Oct.month = 'Oct'
Left join Department Nov on id_table.id = Nov.id and Nov.month = 'Nov'
Left join Department Dece on id_table.id = Dece.id and Dece.month = 'Dec'
