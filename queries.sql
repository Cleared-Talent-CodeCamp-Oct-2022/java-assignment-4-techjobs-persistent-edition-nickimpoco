-- Part 1: Test it with SQL

--  Table: job
--  Columns:
--  id int PK
--  employer varchar(255)
--  name varchar(255)
--  skills varchar(255)

-- Part 2: Test it with SQL

SELECT name FROM techjobs.employer
WHERE location = 'St. Louis City';

-- Part 3: Test it with SQL

DROP table job;

-- Part 4: Test it with SQL

SELECT s.name FROM skill as s
JOIN job_skills as js ON s.id = js.skills_id
JOIN job as j ON js.jobs_id = j.id
ORDER BY s.name ASC;