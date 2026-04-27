-- Last updated: 4/27/2026, 10:54:23 PM
# Write your MySQL query statement below
select p.product_name,s.year,s.price
from sales s
join
product p
on s.product_id=p.product_id