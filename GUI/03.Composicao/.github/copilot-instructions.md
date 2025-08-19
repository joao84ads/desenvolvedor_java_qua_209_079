# Copilot Instructions for AI Agents

## Visão Geral do Projeto
Este projeto Java utiliza uma estrutura clássica de separação entre código-fonte (`src`), dependências externas (`lib`) e arquivos compilados (`bin`). O foco é demonstrar composição de objetos, com as principais entidades localizadas em `src/com/composicao/model`.

## Componentes Principais
- **Modelos:**
  - `Conta.java` e `Pessoa.java` representam entidades centrais do domínio.
- **Interfaces:**
  - `IConta.java` define contratos para operações de conta.
- **Aplicação:**
  - `App.java` é o ponto de entrada e orquestra a execução.

## Fluxo de Dados
- Objetos de `Pessoa` e `Conta` são instanciados e manipulados via métodos definidos em suas classes e interfaces.
- A interface `IConta` pode ser usada para abstrair operações sobre contas, facilitando extensões futuras.

## Convenções Específicas
- **Estrutura de Pastas:**
  - Siga o padrão: `src/com/composicao/{model,interfaces,app}`.
- **Compilação:**
  - Os arquivos `.class` são gerados em `bin/` mantendo a mesma hierarquia de pacotes.
- **Dependências:**
  - Adicione bibliotecas externas em `lib/`.
  - Gerencie dependências pelo painel `JAVA PROJECTS` do VS Code.

## Workflows de Desenvolvimento
- **Compilar:**
  - Compile manualmente com:
    ```powershell
    javac -d bin -cp lib/* src/com/composicao/model/*.java src/com/composicao/interfaces/*.java src/com/composicao/app/App.java
    ```
- **Executar:**
  - Execute a aplicação principal:
    ```powershell
    java -cp bin;lib/* com.composicao.app.App
    ```
- **Debug:**
  - Utilize o depurador do VS Code para breakpoints e inspeção de variáveis.

## Padrões de Código
- **Uso de Interfaces:**
  - Prefira abstrações via interfaces para facilitar testes e extensibilidade.
- **Composição:**
  - Classes modelo podem conter referências a outras classes modelo, exemplificando composição.

## Exemplos de Integração
- Para adicionar uma nova funcionalidade, crie uma interface em `interfaces/`, implemente em `model/` e integre via `App.java`.

## Referências Importantes
- Consulte `README.md` para instruções básicas e links úteis.
- Estruture novos arquivos conforme o padrão de pacotes existente.

---

> Atualize este documento conforme novas convenções ou fluxos forem adotados.
