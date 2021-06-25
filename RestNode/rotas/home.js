let express = require('express');
let routes = express.Router();

routes.get('/', (req, res) =>{
    res.end('Home')
 });

 module.exports = routes;