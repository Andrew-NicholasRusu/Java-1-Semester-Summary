-- Create the table:
CREATE TABLE coin_countdown (
    new_coins INT NOT NULL,
    days_left INT NOT NULL
);

-- Insert the data:
INSERT INTO coin_countdown (new_coins, days_left) VALUES
(16, 5), 
(8, 4),
(4, 3),
(2, 2),
(1, 1),
(0, 0);

-- Query the data:

-- See all the record
SELECT * FROM coin_countdown;

-- Find coins available when 3+ days left
SELECT * FROM coin_countdown WHERE days_left >= 3;

-- Calculate coins per day ratio
SELECT days_left, new_coins, ROUND(new_coins * 1.0 / days_left, 2) AS coins_per_day
FROM coin_countdown
WHERE days_left > 0;