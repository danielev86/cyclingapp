create table if not exists countries (
 	id BIGINT UNIQUE AUTO_INCREMENT,
    country_code VARCHAR(8) NOT NULL,
    country_name VARCHAR(80) NOT NULL,
    PRIMARY KEY (id)
)

create table if not exists divisions(
	id BIGINT UNIQUE AUTO_INCREMENT,
    division_name VARCHAR(32) NOT NULL,
    position BIGINT NOT NULL,
    PRIMARY KEY(id)
)

CREATE TABLE IF NOT EXISTS team (
   id              BIGINT  NOT NULL PRIMARY KEY AUTO_INCREMENT
  ,team_name       VARCHAR(64) NOT NULL
  ,general_manager VARCHAR(64)
  ,country_id      BIGINT  NOT NULL
  ,id_division     BIGINT  NOT NULL
  ,FOREIGN KEY (country_id) REFERENCES countries(id) 
  ,FOREIGN KEY (id_division) REFERENCES divisions(id) 
);

CREATE TABLE IF NOT EXISTS cyclist (
   id         BIGINT  NOT NULL PRIMARY KEY AUTO_INCREMENT
  ,first_name VARCHAR(64) NOT NULL
  ,last_name  VARCHAR(64) NOT NULL
  ,born       DATE  NOT NULL
  ,team_id    BIGINT  NOT NULL
  ,country_id BIGINT  NOT NULL
  ,FOREIGN KEY (country_id) REFERENCES countries(id)  
  ,FOREIGN KEY (team_id) REFERENCES team(id) 
);
