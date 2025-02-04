# Atividade de Herança de Classes

```mermaid
classDiagram

Pessoa <|-- Aldeao
Pessoa <|-- Arqueiro
Pessoa <|-- Cavaleiro

class Pessoa {
    # vida : double
    # ataque : double
    # velocidae : double
    
    + atacar() String
    + mover() String
}

class Aldeao {
    
}

class Arqueiro {
    
}

class Cavaleiro {
    
}

```

# Jogo de Corrida

```mermaid
classDiagram
    
class Carro {
    <<abstract>>
    
    #marca: String
    #cor: String
    #modelo: String
    
    acelerar() String*
    freiar() String*
    ligar() String*
    desligar() String*

}
```