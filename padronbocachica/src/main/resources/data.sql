INSERT INTO provincia(name)
VALUES('Santo Domingo'),('Distrito Nacional'),('Santiago'),('Azua'),('Hermanas Mirabal'),('San Pedro Macorix'),('Altagracia'),('Seibo'),('Puerto Plata');

INSERT INTO municipio(name,provincia_id)
VALUES('Boca Chica',1),('La Caleta',1),('San Luis',1);

INSERT INTO sector(name,municipio_id)
VALUES('Los coquitos',1),('Bella vista',1),('Monte Rey',1),('Alto de chavon',1);

INSERT INTO USERS(username,password) VALUES
('admin','$2a$10$5e3dB36HeRcozRgp8xQfw.tfD3Qsut8xu/NT9g/DSpVKg9Kzuitrq'),
('user','$2a$10$5e3dB36HeRcozRgp8xQfw.tfD3Qsut8xu/NT9g/DSpVKg9Kzuitrq');


INSERT INTO ROLES(description) VALUES
('ADMIN'),('NORMAL');

INSERT INTO PRIVILEGE(description) VALUES
('CUENTAS'),('CLIENTE');


INSERT INTO USER_ROLES(user_id,role_id) VALUES
(1,1),(2,2);

INSERT INTO ROLES_PRIVILEGES(role_id,privilege_id) VALUES
(1,1),(1,2),(2,1);



