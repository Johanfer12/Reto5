create table obratitere(

    oti_id  int primary key,
	oti_presentaciones int,	
	oti_duracion int,
	FOREIGN KEY (oti_id) REFERENCES obra (ob_id)

);

insert into obratitere values (3001,5,120);
insert into obratitere values (3002,6,60);
insert into obratitere values (3003,7,40);
insert into obratitere values (3004,8,45);
insert into obratitere values (3006,9,60);
insert into obratitere values (3007,3,70);
insert into obratitere values (3008,4,80);
insert into obratitere values (3005,5,90);