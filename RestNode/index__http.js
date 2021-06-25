var http = require('http');

http.createServer(function (req, res) {
 
    if(req.url=='/'){
        res.writeHead(200, {'Content-Type': 'text/plain'});
        res.end('Home');
    }

    if(req.url=='/contato'){
        res.writeHead(200, {'Content-Type': 'text/plain'});
        res.end('Página de contatos');
    }

    if(req.url=='/contato/altera'){
        res.writeHead(200, {'Content-Type': 'text/plain'});
        res.end('Alterar de contatos');
    }

}).listen(4000);