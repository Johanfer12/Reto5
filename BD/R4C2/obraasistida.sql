create table obraasistida(

    oa_id int primary key,
    oa_user char(40),
    oa_obra  int,
    oa_fecha datetime,
	FOREIGN KEY (oa_obra) REFERENCES obra (ob_id),
	FOREIGN KEY (oa_user) REFERENCES asistente (asi_login)
);

insert into obraasistida values (1, "rortiz", 2001, '2021-08-10  20:00:00' );
insert into obraasistida values (2, "rortiz", 2004, '2021-08-15  18:30:00');
insert into obraasistida values (3, "rortiz", 3004, '2021-08-20  20:30:00');
insert into obraasistida values (4, "pabloper", 2001, '2021-08-10  20:30:00');
insert into obraasistida values (5, "pabloper", 3004, '2020-08-20 20:30:00');
insert into obraasistida values (6, "nataper", 2002, '2021-08-14  20:30:00');
insert into obraasistida values (7, "nataper", 2003, '2021-08-15  21:30:00');
insert into obraasistida values (8, "nataper", 3001, '2021-08-04  15:30:20');
insert into obraasistida values (9, "jaironi", 3001, '2021-08-14 15:30:20');
insert into obraasistida values (10, "jaironi", 3002, '2021-0-13  18:30:20');
insert into obraasistida values (11, "jairve", 3003, '2021-0-16  20:30:20');
insert into obraasistida values (12, "jairve", 3004, '2021-08-20  20:30:000');
insert into obraasistida values (13, "jairve", 3006, '2021-08-14  18:30:20');
insert into obraasistida values (14, "renego", 3005, '2021-08-12  21:30:20');
insert into obraasistida values (15, "camiru", 2002, '2021-08-13  17:30:20');
insert into obraasistida values (16, "camiru", 2004, '2021-08-15  18:30:00');
insert into obraasistida values (17, "camiru", 2005, '2021-08-16  18:30:20');