-- Create the table:
CREATE TABLE coin_countdown (
    new_coins INT NOT NULL,
    total_minted INT NOT NULL
);

-- Insert the data:
INSERT INTO coin_countdown (new_coins, days_left) VALUES
(16, 31), 
(8, 15),
(4, 7),
(2, 3),
(1, 1),
(0, 0);

-- Query the data:

-- See all the record
SELECT * FROM coin_countdown;

-- Find coins available when 3+ days left
SELECT * FROM coin_countdown WHERE total_minted >= 3;

-- Calculate coins per day ratio
SELECT total_minted, new_coins, ROUND(new_coins * 1.0 / total_minted, 2) AS coins_per_day
FROM coin_countdown
WHERE total_minted > 0;