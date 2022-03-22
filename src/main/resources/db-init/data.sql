-- DB init

-- Vectors DB tables
INSERT INTO VECTORS (id, name) VALUES (1, 'CAR');
INSERT INTO VECTORS (id, name) VALUES (2, 'MOTORCYCLE');
INSERT INTO VECTORS (id, name) VALUES (3, 'BOAT');

-- Drivers DB tables
INSERT INTO DRIVERS (id, name, firstname, vector_id) VALUES (1, 'CASTEL', 'Frédéric', 1);
INSERT INTO DRIVERS (id, name, firstname, vector_id) VALUES (2, 'DUBOIS', 'Magdalena', 2);
INSERT INTO DRIVERS (id, name, firstname, vector_id) VALUES (3, 'DOE', 'John', 2);

-- Rides DB tables
INSERT INTO RIDES (id, trip, driver_id) VALUES (1, 'CARANTEC-BREST', 1);
INSERT INTO RIDES (id, trip, driver_id) VALUES (2, 'PARIS-MORLAIX', 2);
INSERT INTO RIDES (id, trip, driver_id) VALUES (3, 'BREST-NEW_YORK', 3);
