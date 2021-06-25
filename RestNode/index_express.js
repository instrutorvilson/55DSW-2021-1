const express = require('express');

let app = express();

app.get('/', (req, res) =>{
   res.end('Ola mundo')
});

app.get('/contatos', (req, res) =>{
    res.json({users:[
        {nome: "jose", idade: 45, id: 1},
        {nome: "Maria", idade: 50, id: 2},
        {nome: "Joao", idade: 50, id: 3}
    ]})
 });

app.listen(4000, '127.0.0.1', () => {
    console.log('servidor rodando');
})