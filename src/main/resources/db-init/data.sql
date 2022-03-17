INSERT INTO VECTORS (id, name) VALUES (1, 'Auto');

INSERT INTO DRIVERS (id, name, firstname, vector_id) VALUES (1, 'Castel', 'Frédéric', 1);


INSERT INTO RIDES (id, average_speed, date, consumption, range, trip, driver_id) VALUES (1, '73', now(), '5.9', '66', 'CARANTEC-BREST', 1);


// IL FAUT FAIRE LE CRUD SUR RIDES ET VECTOR