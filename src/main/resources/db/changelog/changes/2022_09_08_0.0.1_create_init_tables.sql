CREATE TABLE brands (
    id SERIAL PRIMARY KEY NOT NULL,
    name TEXT NOT NULL
);

CREATE TABLE items (
    id SERIAL PRIMARY KEY NOT NULL,
    name TEXT NOT NULL,
    price INT DEFAULT 0,
    amount INT DEFAULT 0,
    brand_id INT DEFAULT 0,
    CONSTRAINT fk_items_brands
        FOREIGN KEY (brand_id)
        REFERENCES brands (id)
);