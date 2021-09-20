create table obrateatro(

    ot_id  int primary key,
    ot_resumen  char(250),	
	ot_anio int,	
	ot_compañia int,
	FOREIGN KEY (ot_id) REFERENCES obra (ob_id),
	FOREIGN KEY (ot_compañia) REFERENCES compañia (com_id)

);

insert into obrateatro values (2001,"Mujeres y niñas son víctimas de la violencia sexual",2021,101);
insert into obrateatro values (2002,"Homenaje a las mujeres excepcionales",2020,102);
insert into obrateatro values (2003,"En la Atenas del rey Agamenón se convoca una guerra",2021,103);
insert into obrateatro values (2004,"Una familia exiliada durante la dictadura chilena",2020,104);
insert into obrateatro values (2005,"Granja de Piratas lleva su característico estilo roquero",2021,105);