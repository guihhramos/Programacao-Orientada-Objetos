# Tipos de list:
    Em programação orientada a objetos (POO), o conceito de "list" refere-se a estruturas de dados que permitem armazenar uma coleção de elementos. Cada linguagem de programação pode ter suas próprias implementações de listas ou estruturas similares. Vou abordar alguns tipos comuns de listas em POO, considerando principalmente o contexto de Java, mas esses conceitos são geralmente aplicáveis a outras linguagens também:

### 1. ArrayList
    - O ArrayList em Java é uma implementação da interface List que armazena elementos em uma estrutura de array dinâmico. Ele é redimensionável automaticamente conforme os elementos são adicionados ou removidos. A principal característica é que permite acesso rápido aos elementos por índice.

### 2. LinkedList
    - A LinkedList em Java implementa a interface List e utiliza uma estrutura de lista duplamente encadeada. Cada elemento na lista é armazenado em um nó que possui referências para o próximo e o anterior. É eficiente para operações de inserção e remoção no meio da lista, mas pode ser mais lenta para acessos aleatórios.

### 3. Vector 
    - Vector é uma classe em Java que também implementa a interface List. Similar ao ArrayList, armazena elementos em um array dinâmico, porém é sincronizado, o que significa que é seguro para uso em ambientes concorrentes (threads). No entanto, devido à sincronização, pode ser mais lento em comparação com ArrayList para operações não concorrentes.