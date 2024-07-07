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
