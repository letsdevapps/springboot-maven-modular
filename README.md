# Springboot Maven Modular

Demonstração de construção de uma aplicação modular via configuração maven, separados conforme responsabilidades, em módulos:

* Service
* Web
* Application

## Service

Camada que retorna os serviços, neste momento não depende de outros módulos, hipoteticamente dependeria da camada de Persistencia JPA

## Web

Camada que implementa o frontend e API, depende de module-service

## Application

Camada que inicializa a aplicação, depende de module-web
