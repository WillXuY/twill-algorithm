Create table If Not Exists courses (student varchar(255), class varchar(255))
Truncate table courses
insert into courses (student, class) values ('A', 'Math')
insert into courses (student, class) values ('B', 'English')
insert into courses (student, class) values ('C', 'Math')
insert into courses (student, class) values ('D', 'Biology')
insert into courses (student, class) values ('E', 'Math')
insert into courses (student, class) values ('F', 'Computer')
insert into courses (student, class) values ('G', 'Math')
insert into courses (student, class) values ('H', 'Math')
insert into courses (student, class) values ('I', 'Math');

/*
There is a table courses with columns: student and class
Please list out all classes which have more then or equal to 5 students.
For example, the above table.

Output:
+---------+
| class   |
+---------+
| Math    |
+---------+

Note:
The students should not be counted duplicate in each course.
 */

SELECT class FROM (
SELECT class, COUNT(0) class_count
FROM
  (
  SELECT DISTINCT student, class
  FROM courses
  ) dis_stu
GROUP BY class
) count_class
WHERE class_count > 4;

/*
Wrong answer 1:
{"headers": {"courses": ["student", "class"]},
 "rows": {"courses": [
 ["A", "Math"],
 ["B", "English"],
 ["C", "Math"],
 ["D", "Biology"],
 ["E", "Math"],
 ["F", "Math"],
 ["A", "Math"]]}
}
 */
