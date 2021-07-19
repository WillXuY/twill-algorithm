-- 175. Combine Two Tables
select Person.FirstName, Person.LastName, Address.City, Address.State
from Person
left join Address
on Person.PersonId = Address.PersonId

-- 176. Second Highest Salary
SELECT
    IFNULL(
      (SELECT DISTINCT Salary
       FROM Employee
       ORDER BY Salary DESC
        LIMIT 1 OFFSET 1),
    NULL) AS SecondHighestSalary

-- 181. Employees Earning More Than Their Managers
select nn.Name as Employee from
  (select * from employee where Managerid is not null) nn, employee
where nn.Managerid = employee.Id
and nn.salary > employee.Salary

-- 182. Duplicate Emails
select Email from Person
group by Email
having count(*) > 1

-- 183. Customers Who Never Order
Select Name as Customers
from Customers
where Id not in
(select CustomerId from Orders
group by CustomerId)

-- 196. Delete Duplicate Emails
delete from Person
where Id in
(select Id from
(select Id from
  (select Email
  from Person
  group by Email
  having count(*) > 1
  ) same, Person
where same.Email = Person.Email
)allsame)
and Id not in
(select MIN(Id) from
(select Id, Person.Email from
  (select Email
  from Person
  group by Email
  having count(*) > 1
  ) same, Person
where same.Email = Person.Email
) onesame group by Email)

-- 197. Rising Temperature
select today.id  from Weather today, Weather yesterday
where today.recordDate = date_add(yesterday.recordDate, interval 1 DAY)
and today.temperature > yesterday.temperature
order by id
