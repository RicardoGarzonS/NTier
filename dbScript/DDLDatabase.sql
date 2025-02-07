--database: ../database/Database.sqlite

DROP TABLE IF EXISTS Tabla;

CREATE TABLE Tabla (
     IdTabla                INTEGER PRIMARY KEY AUTOINCREMENT
    ,IdFK                   INTEGER NOT NULL REFERENCES Tabla(IdTabla)

    ,Nombre                 VARCHAR(10) NOT NULL UNIQUE

    ,Estado                 VARCHAR(1) NOT NULL
    ,FechaCrea              DATETIME NOT NULL
    ,FechaModifica          DATETIME
);