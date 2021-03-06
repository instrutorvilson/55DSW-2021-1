const express = require('express');
let routeHome = require('./rotas/home');
let routeContato = require('./rotas/contato')

const bodyParser = require('body-parser');

let app = express();
app.use(bodyParser.urlencoded({extended: false}));
app.use(bodyParser.json());
app.use(routeHome);
app.use(routeContato);

app.listen(4000, '127.0.0.1', () => {
    console.log('servidor rodando');
})