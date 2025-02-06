# Herança múltipla com Interfaces

```mermaid
classDiagram

Animal <|-- Avestruz
Animal <|-- Gato
Animal <|-- Leao
Animal <|-- Lobo
Animal <|-- Macaco
Animal <|-- Cachorro
Arara --|> Animal
Morcego --|> Animal
Baleia --|> Animal
Pinguim --|> Animal
Ornitorrinco --|> Animal

Avestruz ..|> HabilidadeChutar
Avestruz ..|> HabilidadeCorrer

Cachorro ..|> HabilidadeCorrer  
Cachorro ..|> HabilidadeLatir

HabilidadeCorrer <|.. Gato
Gato .. HabilidadeMiar

HabilidadeCorrer <|.. Leao
Leao ..|> HabilidadeRugir

HabilidadeCorrer <|.. Lobo
Lobo ..|> HabilidadeUivar

HabilidadeFalar <|.. Arara
HabilidadeVoar <|.. Arara

HabilidadeVoar <|.. Morcego
HabilidadeEcoLocalizar <|.. Morcego

HabilidadeEcoLocalizar <|.. Baleia
HabilidadeMergulhar <|.. Baleia

HabilidadeMergulhar <|.. Pinguim
HabilidadeSurfar <|.. Pinguim

HabilidadeCorrer <|.. Macaco
Macaco ..|> HabilidadeEscalar

HabilidadeEnvenenar <|.. Ornitorrinco
HabilidadeVestirChapeu <|.. Ornitorrinco

class Animal {
    <<abstract>>
    
    #nome: String
}

class HabilidadeVoar {
    <<interface>>
    
    +voar() String
}

class HabilidadeCorrer {
    <<interface>>
    
    +correr() String
}

class HabilidadeFalar {
        <<interface>>

    +falar() String
}

class HabilidadeRugir {
        <<interface>>

        +rugir() String 
}

class HabilidadeMergulhar {
        <<interface>>

        +mergulhar() String
}

class HabilidadeEcoLocalizar {
    <<interface>>

    +ecoLocalizar() String
}

class HabilidadeChutar {
    <<interface>>

    +chutar() String
}

class HabilidadeLatir {
    <<interface>>

    +latir() String 
}

class HabilidadeMiar {
    <<interface>>

    +miar() String 
}

class HabilidadeUivar {
    <<interface>>
    
    +uivar() String
}

class HabilidadeSurfar {
    <<interface>>

    +surfar() String
}

class HabilidadeEscalar {
    <<interface>>

    +escalar() String
}

class HabilidadeEnvenenar {
    <<interface>>

    +envenenar() String
}

class HabilidadeVestirChapeu {
    <<interface>>
    
    +vestirChapeu() String
}

class Arara {
    
}

class Avestruz {
    
}

class Baleia {
    
}

class Cachorro {
    
}

class Gato {
    
}

class Leao {
    
}

class Lobo {
    
}

class Macaco {
    
}

class Morcego {
    
}

class Pinguim {
    
}

class Ornitorrinco {
    
}
```