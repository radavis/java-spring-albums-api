-- Create_Table_Albums

create table albums (
  id serial,
  artist varchar(255) not null,
  title varchar(255) not null,
  year varchar(255) not null
);
