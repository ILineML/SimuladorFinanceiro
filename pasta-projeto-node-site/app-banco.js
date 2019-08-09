var desenvolvimento = false;

var configuracoes = {
    producao: {
        server: "startec-fire.database.windows.net",
        user: "Gf01191014",
        password: "#Gf37762756850",
        database: "BancoPorjeto",
        options: {
            encrypt: false
        },
        pool: {
            max: 4,
            min: 1,
            idleTimeoutMillis: 30000,
            connectionTimeout: 5000
        }
    },
    desenvolvimento: {
        server: "BASETESTE.database.windows.net",
        user: "root",
        password: "Thei1611",
        database: "BancoDevFinanceiro",
        options: {
            encrypt: true
        }
    }
}
 
var sql = require('mssql');
sql.on('error', err => {
    console.error(`Erro de Conexão: ${err}`);
});

var perfil = desenvolvimento ? 'desenvolvimento' : 'producao';

function conectar() {
  sql.close();
  return sql.connect(configuracoes[perfil])
  // return new sql.ConnectionPool();  
} 

module.exports = {
    conectar: conectar,
    sql: sql
}
