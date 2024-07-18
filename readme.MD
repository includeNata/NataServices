# MarketplaceNata

## Funcionalidades Principais

1. **Autenticação de Funcionários**
   - Paginação, cadastro, login, atualização de senha com envio de e-mail, atualização dos dados do funcionário e autenticação com segurança.
   - **Employee**
     - Id
     - Nome
     - Email
     - Password
     - Data de aniversário
     - Foto
     - Skill
     - Feedbacks

2. **Criação de Habilidades**
   - Cadastro, atualização, deleção, paginação e busca por ID.
   - **Skill**
     - Id
     - Descrição
     - IdÁrea
     - IdFormação
     - IdTecnologia
     - IdCertificado

2. **Criação de Áreas**
   - Cadastro, atualização, deleção, paginação e busca por ID.
   - **Área**
     - Id
     - Área

2. **Criação de Formação**
   - Cadastro, atualização, deleção, paginação e busca por ID.
   - **Formação**
     - Id
     - Formação

2. **Criação de Tecnologias**
   - Cadastro, atualização, deleção, paginação e busca por ID.
   - **Tecnologias**
     - Id
     - Tecnologia

2. **Criação de Certificados**
   - Cadastro, atualização, deleção, paginação e busca por ID.
   - **Certificados**
     - Id
     - Certificado

3. **Criação de Trabalhos**
   - Cadastro, atualização, listagem de trabalhos e busca por ID.
   - **Work**
     - Id
     - Nome
     - Data de início
     - Data de finalização
     - Id do cliente
     - Id do funcionário

4. **Criação de Feedbacks**
   - Cadastro, deleção e atualização.
   - **Feedback**
     - Id
     - Texto
     - Data
     - Id do cliente
     - Id do funcionário

5. **Cadastro de Clientes**
   - Cadastro, login, atualização de senha com envio de e-mail, atualização dos dados do cliente e autenticação com segurança.
   - **Client**
     - Id
     - Nome
     - Email
     - Password

## Funcionalidades Extras

- Buscar um perfil de funcionário por nome.
- Buscar um trabalho de um funcionário pelo nome do trabalho.
- Listar funcionários por determinada tecnologia.
- Listar funcionários com feedbacks positivos.
- Chat em tempo real.
- Método de pagamentos.
- Configurar a biblioteca para envio de e-mails.
- Login com Google ou GitHub.
