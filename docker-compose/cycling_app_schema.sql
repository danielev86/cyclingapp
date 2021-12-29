create table if not exists countries (
 	id BIGINT UNIQUE AUTO_INCREMENT,
    country_code VARCHAR(8) NOT NULL,
    country_name VARCHAR(80) NOT NULL,
    code VARCHAR(8) NOT NULL,
    PRIMARY KEY (id)
)

create table if not exists divisions(
	id BIGINT UNIQUE AUTO_INCREMENT,
    division_name VARCHAR(32) NOT NULL,
    position BIGINT NOT NULL,
    PRIMARY KEY(id)
)

create table if not exists cyclists(
  	id   BIGINT AUTO_INCREMENT UNIQUE,
    first_name VARCHAR(80) NOT NULL,
    last_name VARCHAR(80) NOT NULL,
    BORN DATE NOT NULL,
    country_id BIGINT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (country_id) REFERENCES countries(id)    
);
