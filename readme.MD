##MarketplaceNata


###Funcionalidades Principais
1. **Autenticação de Funcionarios**
  - Paginação, Cadastro, login,atualização da senha com envio de email, atulização do dados do funcionario e autenticação com security.
       <br> Employee {
       <br> Id,
       <br>nome,
       <br> email,
       <br>password,
       <br>data_de_aniversario,
       <br>foto,
       <br> Skill
       <br> Feedbacks
  <br>}

2. **Criação de Habilidades**
  - Cadastro,atualizar,deletar,paginação e buscar por id.
      <br> Skill {
      <br> Id,
      <br> Area,
      <br> formação,
      <br> tecnologias,
      <br> certificados,
      <br> descrição,
<br>}

3. **Criação de Trabalho**
 - Cadastro,atualizar,listar works, buscar work por id.
   <br> Work {
   <br> Id,
   <br> Nome,
   <br> data_de_inicio,
   <br> data_de_finalização,
   <br> id_client,
   <br> id_funcionario,
   <br>}

4. **Criação de feedbacks**
  - Cadastro,deletar,atualizar.
  <br> feedback {
  <br> Id,
  <br> texto,
  <br> data,
  <br> id_client
  <br> id_funcionario
  <br>}

5. **Cadastro de Clientes**
  - Cadastro,login,atualização da senha com envio de email,atulização do dados do cliente e autenticação com security.
  <br> Client {
  <br> id,
  <br> nome,
  <br> email,
  <br> password,
  <br>}

###Funcionalidades extras###
  <br>
   <br> **Buscar um perfil de Funcionario por nome**
   <br>
   <br> **Buscar um Trabalho de um funcionario pelo nome do trabalho**  
   <br>
   <br> **Listar funcionarios por x tecnologia**
   <br>
   <br> **Listar funcionarios com feedbacks positivos**
    <br>
   <br> **Chat em real-time ultima opção**
    <br>
   <br> **Metodo de pagamentos**
