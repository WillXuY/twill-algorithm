Create table If Not Exists Followers(user_id int, follower_id int)
    Truncate table Followers
    insert into Followers (user_id, follower_id) values ('0', '1')
    insert into Followers (user_id, follower_id) values ('1', '0')
    insert into Followers (user_id, follower_id) values ('2', '0')
    insert into Followers (user_id, follower_id) values ('2', '1')

/*
Table: Followers

+-------------+------+
| Column Name | Type |
+-------------+------+
| user_id     | int  |
| follower_id | int  |
+-------------+------+
(user_id, follower_id) is the primary key for this table.
This table contains the IDs of a user and a follower in a social media
app where the follower follows the user.

Write an SQL query that will, for each user, return the number of
followers.

Return the result table ordered by user_id.

The query result format is in the following example.

Example 1:

Input:
Followers table:
+---------+-------------+
| user_id | follower_id |
+---------+-------------+
| 0       | 1           |
| 1       | 0           |
| 2       | 0           |
| 2       | 1           |
+---------+-------------+
Output:
+---------+----------------+
| user_id | followers_count|
+---------+----------------+
| 0       | 1              |
| 1       | 1              |
| 2       | 2              |
+---------+----------------+
Explanation:
The followers of 0 are {1}
The followers of 1 are {0}
The followers of 2 are {0,1}
 */

select user_id, count(0) as followers_count
from Followers
group by user_id
order by user_id;
