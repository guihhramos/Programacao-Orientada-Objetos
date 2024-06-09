# Aula 7 (POO) - Herança e polimorfismo.

# O que é HERANÇA na POO?
Em programação orientada a objetos (POO), "herança" é um conceito fundamental que permite que uma classe (ou tipo) de objeto herde atributos e métodos de outra classe. Na herança, uma classe derivada (também chamada de subclasse ou classe filha) pode estender ou especializar uma classe base (também chamada de superclasse ou classe pai).

A herança permite a reutilização de código, já que as classes derivadas podem aproveitar os membros (atributos e métodos) da classe base sem precisar reescrevê-los. Além disso, ela facilita a organização e a hierarquia das classes em um programa.

Por exemplo, imagine uma classe "Animal" com métodos e atributos básicos, como "comer" e "dormir". Podemos ter subclasses como "Cachorro" e "Gato" que herdam esses métodos e atributos da classe "Animal", mas também podem ter métodos e atributos específicos, como "latir" para um cachorro ou "miar" para um gato. Isso ilustra como a herança permite a criação de classes mais especializadas a partir de classes mais gerais.

# Classes Abstratas
    - Classe que não pode ser instanciada, usada como base para outras classes.

# Métodos abstratos
    - Métodos sem implementação, que devem ser implementados pelas subclasses
    - Objetivo: Forçar a implementação de métodos específicos em subclasses

# Classes e métodos final
    - Classes que não podem ser herdadas.
    - Métodos que não podem ser sobrescritos.

# Polimorfismo
Polimorfismo é outro conceito-chave na programação orientada a objetos (POO). Ele se refere à capacidade de objetos de diferentes classes responderem ao mesmo método de maneira diferente. Em outras palavras, o polimorfismo permite que um método tenha várias formas, adaptando-se dinamicamente ao tipo do objeto ao qual está sendo aplicado.

Existem dois tipos principais de polimorfismo:

1. **Polimorfismo de sobrescrita (override)**: Nesse tipo de polimorfismo, uma subclasse redefine (sobrescreve) um método da classe base. Assim, quando um objeto da subclasse é criado e o método é chamado, a versão do método na subclasse é executada, em vez da versão da classe base.

2. **Polimorfismo de sobrecarga (overload)**: Esse tipo de polimorfismo ocorre quando várias versões de um método têm o mesmo nome, mas parâmetros diferentes. O compilador ou interpretador decide qual versão do método chamar com base nos parâmetros passados durante a chamada.

O polimorfismo é fundamental para escrever código flexível, genérico e reutilizável em POO. Ele permite escrever código que pode ser aplicado de maneira consistente a diferentes tipos de objetos, promovendo uma maior modularidade e manutenibilidade do código.