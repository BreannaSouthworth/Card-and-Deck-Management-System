drop database if exists cdm_yugioh_db;
create database cdm_yugioh_db;
use cdm_yugioh_db;

drop table if exists card;
create table card(
card_id int primary key auto_increment,
card_name varchar(50) not null,
card_text varchar(700) null,
legal boolean default '1',
tradional_format_ruling varchar(15) not null,
advance_format_ruling varchar(15) not null
);

drop table if exists monster_card;
create table monster_card(
monster_card_id int primary key auto_increment,
card_id int not null,
foreign key (card_id)
references card(card_id),
level_rank_link_rating int null,
monster_type varchar(8) not null,
tuner boolean default '0',
special_summon boolean default '0',
ability varchar(6) null,
attrubute varchar(6) not null,
type varchar(13) not null,
atk varchar(10),
def varchar(10)
);

drop table if exists spell_card;
create table spell_card(
spell_card_id int primary key auto_increment,
card_id int not null,
foreign key (card_id)
references card(card_id),
primary_type varchar(5) not null,
secondary_type varchar(10) not null
);

drop table if exists trap_card;
create table trap_card(
trap_card_id int primary key auto_increment,
card_id int not null,
foreign key (card_id)
references card(card_id),
primary_type varchar(5) not null,
secondary_type varchar(10) not null
);

drop table if exists pendulum_card;
create table pendulum_card(
pendulum_card_id int primary key auto_increment,
monster_card_id int not null,
foreign key (monster_card_id)
references monster_card(monster_card_id),
spell_effect_text varchar(700) not null,
pendulum_scale int not null
);

drop table if exists monster_material;
create table monster_material(
monster_material_id int primary key auto_increment,
monster_card_id int not null,
foreign key (monster_card_id)
references monster_card(monster_card_id),
card_property_required varchar(20) not null,
property_value varchar(50) not null
);

drop table if exists link_arrow;
create table link_arrow(
link_arrow_id int primary key auto_increment,
position varchar(12) not null
);

drop table if exists card_link_arrow;
create table card_link_arrow(
monster_card_id int not null,
foreign key (monster_card_id)
references monster_card(monster_card_id),
link_arrow_id int not null,
foreign key (link_arrow_id)
references link_arrow(link_arrow_id),
primary key card_link_arrow_pk (monster_card_id, link_arrow_id)
);

drop table if exists card_number;
create table card_number(
card_number_id int primary key auto_increment,
card_id int not null,
foreign key (card_id)
references card(card_id),
series varchar(50) not null,
artwork blob not null,
rarity varchar(30) not null
);

drop table if exists card_support;
create table card_support(
card_support_id int primary key auto_increment,
card_id int not null,
foreign key (card_id)
references card(card_id),
property varchar(20) not null,
property_value varchar(50),
anti_support boolean default '0'
);

drop table if exists deck;
create table deck(
deck_id int primary key auto_increment,
deck_name varchar(30) not null,
wins int default '0',
losses int default '0'
);

drop table if exists deck_card;
create table deck_card(
card_id int not null,
foreign key (card_id)
references card(card_id),
deck_id int not null,
foreign key (deck_id)
references deck(deck_id),
primary key deck_card_pk (card_id, deck_id)
);

drop table if exists collection;
create table collection(
collection_id int primary key auto_increment,
collection_name varchar(30) not null,
privacy varchar(50) null
);

drop table if exists collection_card;
create table collection_card(
card_id int not null,
foreign key (card_id)
references card(card_id),
collection_id int not null,
foreign key (collection_id)
references collection(collection_id),
primary key collection_card_pk (card_id, collection_id)
);