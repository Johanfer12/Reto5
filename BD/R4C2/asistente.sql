create table asistente(

    asi_login  char(20) primary key,	
	asi_nombre  char(20),	
	asi_apellido  char(20),	
	usr_email  char(30),	
	asi_celular bigint, 
	asi_clave  char(20),	
	asi_fecha_nto DATE

);

insert into asistente values ("rortiz", "Roberto", "Ortiz", "rortiz@gmail.com", 3130000001,"pass1", '2021-08-10');
insert into asistente values ("pabloper", "Pablo", "Perez", "pabloper@gmail.com", 3130000002,"pass2", '2021-08-11');
insert into asistente values ("nataper", "Natali", "Perez", "nataper@gmail.com", 3130000003,"pass3", '2021-08-12');
insert into asistente values ("jaironi", "Jairo", "Nieto", "jaironi@gmail.com", 3130000004,"pass4", '2021-08-13');
insert into asistente values ("jairve", "Jair", "Velasco", "Jairve@gmail.com", 3130000005,"pass5", '2021-08-14');
insert into asistente values ("luisco", "Luis", "Cortez", "luisco@gmail.com", 3130000006,"pass6", '2021-08-15');
insert into asistente values ("renegó", "Rene", "Gómez", "renegó@gmail.com", 3130000007,"pass7", '2021-08-16');
insert into asistente values ("camiru", "Camilo", "Rueda", "camiru@gmail.com", 3130000008,"pass8", '2021-08-17');