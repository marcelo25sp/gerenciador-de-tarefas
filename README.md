# 📝 Gerenciador de Tarefas (Java)

Um aplicativo simples em Java para **cadastrar, remover e listar tarefas**, utilizando **OOP, Enum, composição e manipulação de datas**.  
Projeto desenvolvido para praticar lógica, boas práticas e uso de classes separadas.

---

## 🚀 Funcionalidades

### ✔ Cadastrar nova tarefa  
Permite registrar uma tarefa com:
- **Id**
- **Título**
- **Descrição**
- **Status** (`PENDENTE`, `EM_ANDAMENTO`, `CONCLUIDO`)
- **Data limite**

---

### ✔ Remover tarefa  
Remove uma tarefa pelo ID informado.

---

### ✔ Listar todas as tarefas  
Exibe todas as tarefas com formatação organizada.

---

### ✔ Listar tarefas por status  
Filtra tarefas com base no status informado pelo usuário.

---

## 🧱 Estrutura do Projeto

```
src/
 ├── application/
 │    └── Main.java
 ├── entities/
 │    ├── GerenciadorTarefas.java
 │    ├── Tarefas.java
 │    └── enums/
 │         └── StatusTarefa.java
```

---

## 🛠 Tecnologias Utilizadas

- **Java 17+**
- **Scanner** para entrada de dados
- **LocalDate** para manipulação de datas
- **Enum** para status das tarefas
- **OOP** (classes e composição)

---

## 🧩 Enum `StatusTarefa`
```java
public enum StatusTarefa {
    PENDENTE,
    EM_ANDAMENTO,
    CONCLUIDO;
}
```

---

## ▶ Como executar o projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/seuusuario/nome-do-repo.git
   ```
2. Abra no Eclipse (ou IDE da sua preferência)
3. Execute o arquivo:
   ```
   src/application/Main.java
   ```

---

## 📌 Exemplo de uso (interface de texto)

```
=======GERENCIADOR DE TAREFAS=======

1 - Cadastrar tarefa
2 - Remover tarefa
3 - Listar tarefas
4 - Listar tarefas por status
0 - Sair
Escolha uma opção:
```

---

## 🗂 Exemplo de saída — Listagem de tarefas

```
===Todas as tarefas cadastradas===
==================================
-------------------------------
Id: 1
 - Título: Estudar Java
 - Descrição: Praticar enums e composição
 - Status: EM_ANDAMENTO
 - Data Limite: 2025-12-10
-------------------------------
```

---

## 📦 Próximas melhorias (versão 2.0)

- Atualizar status de uma tarefa já criada  
- Validar ID duplicado  
- Ordenar tarefas (por data, status, título…)  
- Persistir dados em arquivo  
- Usar tratamento de exceções em entradas do usuário  

---

## 👨‍💻 Autor

Projeto desenvolvido por **Marcelo Nascimento**, focado no aprendizado de Java, lógica e boas práticas de programação.

---


