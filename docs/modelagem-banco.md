# 🗄️ Modelagem de Banco de Dados - DevFit

## 📌 Tabelas e Relacionamentos

### 👤 Aluno
- id (PK)
- nome
- idade
- altura
- peso
- email
- telefone
- status
- treino_id (FK)

---

### 🏋️ Treino
- id (PK)
- nome
- objetivo
- observacoes

---

### 📊 EvolucaoFisica
- id (PK)
- aluno_id (FK)
- peso
- altura
- imc
- classificacaoIMC
- percentualGordura
- dataRegistro

---

### 💰 Pagamento
- id (PK)
- aluno_id (FK)
- valor
- dataPagamento
- status
- metodo

---

### 🥗 Nutricionista
- id (PK)
- nome
- email
- telefone
- registroProfissional

---

### 📄 Encaminhamento
- id (PK)
- aluno_id (FK)
- nutricionista_id (FK)
- data
- motivo
- status

---

## 🔗 Relacionamentos

- Aluno (1) → (N) Pagamento
- Aluno (1) → (N) EvolucaoFisica
- Treino (1) → (N) Aluno
- Aluno (1) → (N) Encaminhamento
- Nutricionista (1) → (N) Encaminhamento