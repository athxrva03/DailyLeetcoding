# Write your MySQL query statement below
Select * 
From Cinema
Where id % 2 != 0
    AND description != 'boring'
Order BY rating DESC