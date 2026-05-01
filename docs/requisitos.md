# 📌 DevFit - Documento de Requisitos (v1.0)

## 🧠 Descrição
O DevFit é um sistema backend para gestão de academias, permitindo o controle de alunos, treinos, evolução física e financeiro básico.

---

## 👥 Usuários
- Administrador
- Instrutor (opcional)

---

## Modelagem Inicial - Entidades e Atributos


---

## ⚙️ Requisitos Funcionais

### 👤 Alunos
- Cadastrar aluno
- Listar alunos
- Atualizar dados
- Excluir aluno

### 🏋️ Treinos
- Criar treino
- Listar treinos por aluno
- Atualizar treino
- Excluir treino

### 📊 Evolução Física
- Registrar peso e altura
- Calcular IMC
- Histórico

### 💰 Financeiro
- Registrar pagamento
- Verificar inadimplência

---

## 📏 Regras de Negócio
- IMC = peso / (altura²)
- Encaminhamento ao nutricionista mediante ao IMC
- Um aluno pode ter vários treinos
- Um aluno pode ter várias evoluções
- Pagamento define status do aluno

---

## 🚫 Fora do Escopo
- Frontend
- Login/autenticação
- Relatórios avançados

---

## 🎯 Objetivo
Criar uma API REST simples e funcional para gestão de academias.