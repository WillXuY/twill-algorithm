Create table If Not Exists Seat (id int, student varchar(255))
    Truncate table Seat
    insert into Seat (id, student) values ('1', 'Abbot')
    insert into Seat (id, student) values ('2', 'Doris')
    insert into Seat (id, student) values ('3', 'Emerson')
    insert into Seat (id, student) values ('4', 'Green')
    insert into Seat (id, student) values ('5', 'Jeames')

/*
Table: Seat

+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| id          | int     |
| student     | varchar |
+-------------+---------+
id is the primary key (unique value) column for this table.
Each row of this table indicates the name and the ID of a student.
id is a continuous increment.

Write a solution to swap the seat id of every two consecutive students.
If the number of students is odd, the id of the last student is not
swapped.

Return the result table ordered by id in ascending order.

The result format is in the following example.

Example 1:

Input:
Seat table:
+----+---------+
| id | student |
+----+---------+
| 1  | Abbot   |
| 2  | Doris   |
| 3  | Emerson |
| 4  | Green   |
| 5  | Jeames  |
+----+---------+
Output:
+----+---------+
| id | student |
+----+---------+
| 1  | Doris   |
| 2  | Abbot   |
| 3  | Green   |
| 4  | Emerson |
| 5  | Jeames  |
+----+---------+
Explanation:
Note that if the number of students is odd, there is no need to change
the last one's seat.
 */

SELECT id, student
FROM (
         SELECT s.id, s_next.student as student
         FROM Seat s, Seat s_next
         WHERE s.id = (s_next.id - 1)
           AND mod(s.id, 2) = 1
         UNION
         SELECT s.id, s_odd.student as student
         FROM Seat s, Seat s_odd
         WHERE s.id = (s_odd.id + 1)
           AND mod(s.id, 2) = 0
         UNION
         SELECT id, student
         FROM Seat
         WHERE mod(id, 2) = 1
           AND (id + 1) not in (
             SELECT id FROM Seat
         )
     ) id_stu
ORDER BY id
;
