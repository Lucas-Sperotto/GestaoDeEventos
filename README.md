# Sistema de Gestão de Eventos em Java

Este repositório contém um projeto de **Sistema de Gestão de Eventos em Java** desenvolvido para o aprendizado de Programação Orientada a Objetos (POO) e prática de incrementos de funcionalidades. O projeto é organizado para guiar os alunos desde a construção inicial da hierarquia de classes até a implementação de funcionalidades adicionais, promovendo um entendimento progressivo de conceitos como herança, polimorfismo, e manipulação de interface gráfica.

## Estrutura do Repositório

O repositório está organizado em três pastas principais:

- **atividade/**: Contém a estrutura inicial do projeto com a classe de interface básica (`EventoManagerInterface.java`), o diagrama de classes (`diagrama_classe.png`), e um arquivo de instruções (`README.md`).
- **resposta/inicial**: Contém a implementação inicial da hierarquia de classes de acordo com o diagrama, mas sem incrementos.
- **resposta/completo**: Contém a solução completa com todos os incrementos de funcionalidades implementados.

### Estrutura das Pastas

```
GestaoDeEventos/
├── atividade/
│   ├── EventoManagerInterface.java
│   ├── README.md
│   └── diagrama_classe.png
├── resposta/
│   ├── inicial/
│   │   └── [Arquivos Java com a hierarquia básica]
│   └── completo/
│       └── [Arquivos Java com o sistema completo]
```

## Instruções para Configuração no VS Code

Este projeto pode ser facilmente configurado e executado no Visual Studio Code (VS Code).

### Pré-requisitos

- **Java JDK**: Certifique-se de ter o Java Development Kit (JDK) instalado em sua máquina. [Java JDK Download](https://www.oracle.com/java/technologies/javase-downloads.html)
- **VS Code**: [Visual Studio Code](https://code.visualstudio.com/)
- **Java Extension Pack**: Instale o pacote de extensão de Java no VS Code para suporte completo a projetos Java.

### Passos para Execução

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/SEU_USUARIO/GestaoDeEventos.git
   cd GestaoDeEventos
   ```

2. **Abra o projeto no VS Code**:
   - No terminal, navegue até a pasta raiz do projeto:
     ```bash
     code .
     ```
   - O VS Code abrirá o projeto com todas as pastas e arquivos listados.

3. **Compilar e Executar o Projeto**:
   - Para compilar os arquivos `.java` na pasta `atividade` ou `resposta`, navegue até a respectiva pasta no terminal integrado do VS Code:
     ```bash
     cd atividade  # ou cd resposta/inicial ou resposta/completo
     ```
   - Compile todos os arquivos Java com o comando:
     ```bash
     javac *.java
     ```
   - Para executar a interface principal:
     ```bash
     java EventoManagerInterface
     ```

### Instruções Específicas para os Alunos

- **atividade**: Inicie criando as classes descritas no diagrama de classes e complete a implementação da interface `EventoManagerInterface`.
- **resposta/inicial**: Consulte esta pasta para revisar a estrutura básica da hierarquia de classes.
- **resposta/completo**: Acesse esta pasta para estudar a solução completa com todos os incrementos.

## Funcionalidades do Sistema

O sistema de gestão de eventos permite:

1. **Adicionar, Editar e Remover Eventos**: Gerencie eventos como conferências, workshops, e exposições.
2. **Cadastrar Palestrantes e Participantes**: Inscreva palestrantes e participantes em eventos.
3. **Controle de Conflito de Agenda**: Verifique conflitos de horários ao adicionar atividades e palestrantes.
4. **Relatórios e Estatísticas**: Gere relatórios em texto e PDF com os custos e estatísticas dos eventos.

## Licença

Este projeto é distribuído sob a licença MIT. Consulte o arquivo `LICENSE` para mais detalhes.
