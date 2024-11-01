### Atividade: Desenvolvimento de um Sistema de Gerenciamento de Biblioteca em C++

#### Objetivo
O objetivo desta atividade é desenvolver um sistema de gerenciamento de biblioteca em C++ que permita operações como adicionar, remover, listar, reservar, retirar e devolver livros. O sistema deve armazenar as informações dos livros em um arquivo de texto (`livros.txt`), de modo que as alterações realizadas pelos usuários sejam salvas e persistam entre as execuções do programa.

### Descrição da Atividade
Os alunos deverão criar um programa que realize o gerenciamento de um acervo de livros utilizando a linguagem C++. O programa deverá possibilitar que um operador da biblioteca (usuário) possa consultar, inserir e gerenciar livros, bem como realizar operações de reserva, retirada e devolução de acordo com regras específicas de status dos livros.

### Funcionalidades do Sistema

1. **Estrutura de Dados do Livro**:
   - Cada livro deve conter:
     - **ID**: número único que identifica o livro. Este ID será gerado automaticamente, sendo sequencial e ajustado após operações de remoção.
     - **Título**: título do livro.
     - **Autor**: nome do autor do livro.
     - **Status**: estado atual do livro, que pode ser:
       - **Disponível**: o livro está na biblioteca e pode ser reservado.
       - **Reservado**: o livro foi reservado e pode ser retirado.
       - **Retirado**: o livro foi retirado e pode ser devolvido.

2. **Operações Básicas**:
   - **Listar Livros**: exibir todos os livros cadastrados com seus respectivos ID, título, autor e status.
   - **Adicionar Livro**: adicionar um novo livro ao sistema com as informações fornecidas pelo usuário (título e autor). O ID deve ser gerado automaticamente como o próximo número sequencial após o último livro na lista.
   - **Remover Livro**: remover um livro específico com base no ID fornecido pelo usuário. Após a remoção, todos os IDs dos livros restantes devem ser atualizados para manter a sequência.
   - **Reservar Livro**: alterar o status de um livro para "Reservado" se ele estiver "Disponível".
   - **Retirar Livro**: alterar o status de um livro para "Retirado" se ele estiver "Reservado".
   - **Devolver Livro**: alterar o status de um livro para "Disponível" se ele estiver "Retirado".

3. **Armazenamento em Arquivo**:
   - O sistema deve ler os dados dos livros a partir de um arquivo `livros.txt` ao iniciar. Se o arquivo não existir, o sistema deve criá-lo vazio.
   - Após qualquer alteração no acervo (adição, remoção, alteração de status), a lista de livros deve ser salva novamente no arquivo `livros.txt` para garantir que as mudanças persistam.

### Regras e Restrições
- **ID Automático**: O ID deve ser sequencial e único. Cada novo livro inserido deve receber o próximo ID disponível.
- **Atualização de IDs**: Após a remoção de um livro, os IDs dos livros restantes devem ser atualizados para manter a sequência, iniciando de 1.
- **Restrições de Status**:
  - Apenas livros com status "Disponível" podem ser reservados.
  - Apenas livros com status "Reservado" podem ser retirados.
  - Apenas livros com status "Retirado" podem ser devolvidos.

### Exemplo de Fluxo do Programa

1. **Menu Principal**: Ao iniciar o programa, o sistema exibe um menu com as seguintes opções:

   ```
   Escolha uma opção:
   1. Listar Livros
   2. Adicionar Livro
   3. Remover Livro
   4. Reservar Livro
   5. Retirar Livro
   6. Devolver Livro
   0. Sair
   ```

2. **Listar Livros**: O sistema exibe todos os livros cadastrados com suas informações.

3. **Adicionar Livro**: O usuário informa o título e o autor do livro. O sistema cria um novo livro com o próximo ID disponível e o status "Disponível", salvando-o no arquivo.

4. **Remover Livro**: O usuário informa o ID do livro a ser removido. O sistema exclui o livro correspondente, ajusta os IDs dos livros restantes e salva a lista atualizada no arquivo.

5. **Reservar, Retirar e Devolver**: O sistema solicita o ID do livro e realiza a operação correspondente, seguindo as regras de status definidas.

### Estrutura do Arquivo `livros.txt`
O arquivo `livros.txt` armazenará as informações dos livros no seguinte formato:

```
ID;Título;Autor;Status
```

Exemplo de conteúdo do arquivo:

```
1;A Jornada do Herói;John Smith;Disponível
2;O Mistério da Casa Abandonada;Jane Doe;Reservado
3;Programação para Iniciantes;Alan Turing;Retirado
...
```

### Implementação

#### Classe `Biblioteca`
Os alunos deverão implementar uma classe `Biblioteca`, que será responsável por armazenar a lista de livros e implementar os métodos para realizar as operações descritas. A classe deve conter:

1. **Métodos de Manipulação**:
   - `adicionarLivro`: insere um novo livro com o próximo ID e status "Disponível".
   - `removerLivro`: remove o livro pelo ID e atualiza a lista de IDs dos livros restantes.
   - `listarLivros`: exibe a lista completa de livros no console.
   - `reservarLivro`, `retirarLivro` e `devolverLivro`: alteram o status de um livro conforme as regras estabelecidas.
   
2. **Método `carregarLivros`**:
   - Carrega os dados dos livros do arquivo `livros.txt` ao iniciar o programa.

3. **Método `salvarLivros`**:
   - Salva a lista de livros no arquivo `livros.txt` após cada operação que modifica o acervo.

4. **Método `atualizarIds`**:
   - Atualiza os IDs dos livros restantes na lista após uma remoção para garantir uma sequência contínua.

#### Estrutura `Livro`
A estrutura `Livro` deve representar as informações de cada livro, incluindo ID, título, autor e status.

### Critérios de Avaliação

1. **Funcionalidade Completa**: O programa deve atender a todos os requisitos descritos.
2. **Persistência de Dados**: As alterações nos livros devem ser salvas corretamente no arquivo `livros.txt`.
3. **Boas Práticas de Programação**: Organização do código, uso adequado de variáveis e funções, e clareza na estrutura do programa.
4. **Teste e Validação**: O sistema deve ser testado com casos de uso para verificar o funcionamento das operações de acordo com as regras.

### Exemplo de Saída Esperada

1. Listagem dos livros ao iniciar:
   ```
   Lista de Livros:
   1 - A Jornada do Herói (John Smith) - Disponível
   2 - O Mistério da Casa Abandonada (Jane Doe) - Reservado
   ...
   ```

2. Operação de Adição:
   ```
   Digite o título do livro: Programação Avançada
   Digite o autor do livro: Ada Lovelace
   Livro adicionado com sucesso! ID: 51
   ```

3. Operação de Remoção:
   ```
   Digite o ID do livro a ser removido: 3
   Livro removido com sucesso e IDs atualizados!
   ```

4. Operação de Reserva, Retirada e Devolução:
   ```
   Digite o ID do livro para reserva: 5
   Livro reservado com sucesso!
   ```

### Entrega
Os alunos devem entregar:
- O código-fonte completo do sistema.
- O arquivo `livros.txt` gerado após a execução de algumas operações para demonstração.
