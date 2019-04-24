
#URL - local
-------------

http://localhost:8080/api/generateRequest

#monitoring - probe
-------------------

LOC: http://localhost:8080/monitoring/alive

	
#health, info, metrics, trace
LOC: https://localhost:8080/health   
LOC: https://localhost:8080/info   
LOC: https://localhost:8080/metrics
LOC: https://localhost:8080/trace   

DEV: https://security-gov-pt-dev.appls.boaw.paas.gsnetcloud.corp/health
PRE: https://security-gov-pt-pre.appls.boaw.paas.gsnetcloud.corp/health


Services: securityGovPt
-----------------

gerarPedido:
------------

LOC: http://localhost:8080/api/securitygovpt/gerarPedido?var=91111111111

DEV: https://security-gov-pt/api/securitygovpt/gerarPedido?var=1111111111

validarPedido:
------------

LOC: http://localhost:8080/api/securitygovpt/validarPedido?var=91111111111

DEV: https://security-gov-pt/api/securitygovpt/validarPedido?var=1111111111



==================================================================================================

TOKEN GERAR DEV
---------------

Gerar um timestamp:
http://www.timestampgenerator.com

gerar um token
https://jwt.io/

1 - HEADER

HEADER
{
  "alg": "RS256",
  "typ": "JWT"
}

2 - PAYLOAD

PAYLOAD:DATA
{
"iss": "0018NetbancoEmpresas",
"sub": "NBE01",
"iat": "1517496001",
"nbf": "1517496001",
"exp": "1525185601", -------> timestamp 
"jti": "xadadfjeso9327r023r32r329unb2qgl",
"sid": "B46578C20D9F7E000870F6A2"
}



TOKEN DEV:
----------
-----BEGIN PUBLIC KEY-----
MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQC1h0muvb3q08sfCoxW2qs3N4lc
lZxr4xCar5dDRHJe8dgacEoHKMxWiYW1OEfdCSm8rqXdsl3mWicza15OY/OWx+2N
GQEdSA7DSBdX68mF5VNDyV9O8QNXj6ogIsdeeYg9Fr0PFNq20jAcv2s56ziljmUI
Kr3qub0VtMlrL4Py7wIDAQAB
-----END PUBLIC KEY-----

-----BEGIN RSA PRIVATE KEY-----
MIICXQIBAAKBgQC1h0muvb3q08sfCoxW2qs3N4lclZxr4xCar5dDRHJe8dgacEoH
KMxWiYW1OEfdCSm8rqXdsl3mWicza15OY/OWx+2NGQEdSA7DSBdX68mF5VNDyV9O
8QNXj6ogIsdeeYg9Fr0PFNq20jAcv2s56ziljmUIKr3qub0VtMlrL4Py7wIDAQAB
AoGAG8VIpmzsowInruYENj1ZuCbM4tcYiQDBx4hZUbck8BV7g//ts06whASh6elk
RRJjyjPFuDbTWqwsFxez47Yyy3pNeD3AgXCLlKQpbq6joOa40Rl0cEEb8Ind9z4D
fXqBfgFYr/54uokYFT1zaNesFAEdzjE5ZNxMXG8aS65mwGECQQDmDTBhfy7rpaZ+
1aXKbR45jFA6gnCJtvQnQM2GytY+qlDWgBbfSlXLUKvpzWlkLbBDH6AQnabCBnWN
G1+m9j5XAkEAygD68WYRrDPevv1/4NrpA+0nfIqbXSGNSbUG7Z/OmcasmYl8MDwK
kxZuf0vYG+FYvhM5p9kgbsVdhqVyHBNhKQJAO4xGbbZCKvUh98rNs2wzWqobSknh
X4RgBpkbmjx+4JGtgxh80yemtY4YMdjd4vSAn59cC3EDbU3Gt9PSGqG62QJBAJhM
guZr4RknBmKS984M3i/Sprm0OwzNVhvjO3T+zqKL8ufTi2lGa2aYO/kHssjabrDo
B8kv388ESM5SgKUAS3kCQQCpEC9R9ANYn92Z2QPBxorU1cLJ1DHpJ1PlJZSdvW9t
PPFs3MhmHSQOgx1IvX6eFCblQwJoZbuhn4EYBW9wikzP
-----END RSA PRIVATE KEY-----

==================================================================================================
