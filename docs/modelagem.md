# 📘 Modelagem Inicial do Sistema DevFit

## 📌 Entidades

### 👤 Aluno
- id
- nome
- idade
- altura
- peso
- email
- telefone
- status

---

### 🏋️ Treino
- id
- nome
- objetivo
- observacoes

---

### 📊 EvolucaoFisica
- id
- peso
- altura
- imc
- classificacaoIMC
- percentualGordura
- dataRegistro

---

### 💰 Pagamento
- id
- valor
- dataPagamento
- status
- metodo

---

### 🥗 Nutricionista
- id
- nome
- email
- telefone
- registroProfissional

---

### 📄 Encaminhamento
- id
- data
- motivo
- status

---

## 🔗 Relacionamentos

- Um Aluno possui vários Pagamentos (1:N)
- Um Aluno possui várias Evoluções Físicas (1:N)
- Um Aluno possui um Treino (N:1)
- Um Aluno pode ter vários Encaminhamentos (1:N)
- Um Encaminhamento está ligado a um Nutricionista (N:1)

---

## 🧠 Regra de Negócio

- Se IMC >= 25 → gerar encaminhamento automático ao nutricionista