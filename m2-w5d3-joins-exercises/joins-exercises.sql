-- The following queries utilize the "dvdstore" database.

-- 1. All of the films that Nick Stallone has appeared in
-- (30 rows)
select film.title
from film
join film_actor on film.film_id = film_actor.film_id
join actor on actor.actor_id = film_actor.actor_id
where actor.last_name like ('STALLONE');
-- 2. All of the films that Rita Reynolds has appeared in
-- (20 rows)
SELECT film.title 
from film
JOIN film_actor on film_actor.film_id = film.film_id
join actor on actor.actor_id = film_actor.actor_id
where actor.last_name like ('REYNOLDS')
and actor.first_name like ('RITA');
-- 3. All of the films that Judy Dean or River Dean have appeared in
-- (46 rows)
SELECT film.title
from film
join film_actor on film_actor.film_id = film.film_id
join actor on actor.actor_id = film_actor.actor_id
where actor.first_name in ('JUDY', 'RIVER')
AND actor.last_name like ('DEAN')
-- 4. All of the the ‘Documentary’ films
-- (68 rows)
SELECT film.title
from film
JOIN film_category on film_category.film_id = film.film_id
join category on category.category_id = film_category.category_id
where category.name like ('Documentary');
-- 5. All of the ‘Comedy’ films
-- (58 rows)
SELECT film.title
from film
JOIN film_category on film_category.film_id = film.film_id
join category on category.category_id = film_category.category_id
where category.name like ('Comedy')
-- 6. All of the ‘Children’ films that are rated ‘G’
-- (10 rows)
SELECT film.title
from film
join film_category on film_category.film_id = film.film_id
join category on category.category_id = film_category.category_id
where film.rating like ('G')
and category.name like ('Children');
-- 7. All of the ‘Family’ films that are rated ‘G’ and are less than 2 hours in length
-- (3 rows)
SELECT film.title
from film
join film_category on film_category.film_id = film.film_id
join category on category.category_id = film_category.category_id
where film.rating like ('G')
and category.name like ('Family')
and film.length < 120
-- 8. All of the films featuring actor Matthew Leigh that are rated ‘G’
-- (9 rows)
select film.title
from film

join film_actor on film_actor.film_id = film.film_id

join actor on actor.actor_id = film_actor.actor_id

join film_category on film_category.film_id = film.film_id

join category on category.category_id = film_category.category_id

where actor.last_name like ('LEIGH')
and actor.first_name like ('MATTHEW')
and film.rating like ('G')
-- 9. All of the ‘Sci-Fi’ films released in 2006
-- (61 rows)
SELECT film.title
from film
join film_category on film_category.film_id = film.film_id
join category on category.category_id = film_category.category_id
where category.name like ('Sci-Fi')
and film.release_year = '2006'
-- 10. All of the ‘Action’ films starring Nick Stallone
-- (2 rows)
select film.title
from film

join film_category on film_category.film_id = film.film_id

join film_actor on film_actor.film_id = film.film_id
join actor on actor.actor_id = film_actor.actor_id
join category  on category.category_id = film_category.category_id
where category.name like ('Action')
and actor.first_name like ('NICK')
and actor.last_name like ('STALLONE')
-- 11. The address of all stores, including street address, city, district, and country
-- (2 rows)
select store.store_id, address.address, address.address2, address.district, city.city, country.country
from store
join address on store.address_id = address.address_id
join city on address.city_id = city.city_id
join country on city.country_id = country.country_id
-- 12. A list of all stores by ID, the store’s street address, and the name of the store’s manager
-- (2 rows)
select store.store_id, address.address, staff.last_name
from store
join address on address.address_id = store.address_id
join staff on staff.store_id = store.store_id

// The below line does not work.
// join staff on staff.address_id = address.address_id
-- 13. The first and last name of the top ten customers ranked by number of rentals 
-- (#1 should be “ELEANOR HUNT” with 46 rentals, #10 should have 39 rentals)
select customer.first_name, customer.last_name, count(rental.customer_id) as "count"
from customer
join rental on rental.customer_id = customer.customer_id
group by customer.last_name, customer.first_name
order by count(rental.customer_id) desc
limit 10
-- 14. The first and last name of the top ten customers ranked by dollars spent 
-- (#1 should be “KARL SEAL” with 221.55 spent, #10 should be “ANA BRADLEY” with 174.66 spent)
select customer.first_name, customer.last_name, sum(payment.amount) as "Total Amount Spent"
from customer
join payment on customer.customer_id = payment.customer_id
group by customer.last_name, customer.first_name
order by sum(payment.amount) desc
limit 10
-- 15. The store ID, street address, total number of rentals, total amount of sales (i.e. payments), and average sale of each store 
-- (Store 1 has 7928 total rentals and Store 2 has 8121 total rentals)



-- 16. The top ten film titles by number of rentals
-- (#1 should be “BUCKET BROTHERHOOD” with 34 rentals and #10 should have 31 rentals)
select film.title, count(rental.inventory_id) as "Number of times rented"
from film
join inventory on inventory.film_id = film.film_id
join rental on rental.inventory_id = inventory.inventory_id
group by film.title
order by count(rental.inventory_id) desc
limit 10
-- 17. The top five film categories by number of rentals 
-- (#1 should be “Sports” with 1179 rentals and #5 should be “Family” with 1096 rentals)
select category.name, count(category.category_id)
from category
join film_category on film_category.category_id = category.category_id
join film on film.film_id = film_category.film_id

join inventory on inventory.film_id = film.film_id
join rental on rental.inventory_id = inventory.inventory_id

group by category.name
order by count(category.category_id) desc
-- 18. The top five Action film titles by number of rentals 
-- (#1 should have 30 rentals and #5 should have 28 rentals)
select film.title, count(rental.inventory_id)
from film
join film_category on film_category.film_id = film.film_id
join category on category.category_id = film_category.category_id
join inventory on inventory.film_id = film.film_id
join rental on rental.inventory_id = inventory.inventory_id

where category.name like ('Action')
group by film.title

order by count(rental.inventory_id) desc
limit 5
-- 19. The top 10 actors ranked by number of rentals of films starring that actor 
-- (#1 should be “GINA DEGENERES” with 753 rentals and #10 should be “SEAN GUINESS” with 599 rentals)
select actor.first_name, actor.last_name, count(rental.inventory_id)
from actor
join film_actor on film_actor.actor_id = actor.actor_id
join inventory on film_actor.film_id = inventory.film_id
join rental on rental.inventory_id = inventory.inventory_id

group by actor.last_name, actor.first_name

order by count(rental.inventory_id) desc
limit 10

-- 20. The top 5 “Comedy” actors ranked by number of rentals of films in the “Comedy” category starring that actor 
-- (#1 should have 87 rentals and #5 should have 72 rentals)

select actor.first_name, actor.last_name, count(rental.inventory_id)
from actor

join film_actor on film_actor.actor_id = actor.actor_id

join film on film.film_id = film_actor.film_id

join film_category on film_category.film_id = film.film_id

join inventory on film.film_id = inventory.film_id

join rental on rental.inventory_id = inventory.inventory_id

join category on category.category_id = film_category.category_id

where category.name like ('Comedy')

group by actor.last_name, actor.first_name

order by count(rental.inventory_id) desc

limit 5;