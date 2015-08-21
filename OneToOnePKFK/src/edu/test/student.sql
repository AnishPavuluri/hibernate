alter table studentxtra add(constraint studentxtra_pk primary key (sno));
alter table studentxtra add (constraint studentxtra_sno_fk foreign key(sno) references student (sno) on delete cascade);