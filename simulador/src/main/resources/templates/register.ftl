<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>SB Admin - Register</title>

  <!-- Custom fonts for this template-->
  <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">

  <!-- Custom styles for this template-->
  <link href="css/sb-admin.css" rel="stylesheet">

</head>

<body class="bg-dark">

  <div class="container">
    <div class="card card-register mx-auto mt-5">
      <div class="card-header">Criar uma conta</div>
      <div class="card-body">

        <form method="post" action="/cadastrar" id="formCad" name="formCad">
          <div class="form-group">
            <div class="form-row">
              <div class="col-md-6">
                <div class="form-label-group">
                  <input type="text" id="firstName" name="nmCliente" class="form-control" placeholder="Nome" required="required" autofocus="autofocus">
                  <label for="firstName">Nome</label>
                </div>
              </div>
              <div class="col-md-6">
                <div class="form-label-group">
                  <input type="text" id="lastName" name="nmCliente" class="form-control" placeholder="Sobrenome" required="required">
                  <label for="lastName">Sobrenome</label>
                </div>
              </div>
            </div>
          </div>

          <div class="form-group">
            <div class="form-label-group">
              <input type="text" id="nmUser" name="nmUser" class="form-control" placeholder="Nome de Usuário" required="required">
              <label for="inputUser">Nome de Usuário</label>
            </div>
          </div>

          <div class="form-group">
            <div class="form-label-group">
              <input type="email" id="email" name="email" class="form-control" placeholder="Email" required="required">
              <label for="inputEmail">Email</label>
            </div>
          </div>
          <div class="form-group">
            <div class="form-row">
              <div class="col-md-6">
                <div class="form-label-group">
                  <input type="password" id="senha" name="senha" class="form-control" placeholder="Senha" required="required">
                  <label for="inputPassword">Senha</label>
                </div>
              </div>
              <div class="col-md-6">
                <div class="form-label-group">
                  <input type="password" id="confirmPassword" class="form-control" placeholder="Confirmar Senha" required="required">
                  <label for="confirmPassword">Confirmar Senha</label>
                </div>
              </div>

            </div>
          </div>
          <button class="btn btn-primary btn-block" type="button" onclick="cadastrar()">Registrar</button>
        </form>

        <div class="text-center">
          <a class="d-block small mt-3" href="/login">Logar-se</a>
        </div>
      </div>
    </div>
  </div>

  <!-- Bootstrap core JavaScript-->
  <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

  <!-- Core plugin JavaScript-->
  <script src="vendor/jquery-easing/jquery.easing.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js"></script>

</body>

</html>

<script>

  function cadastrar() {

    if(senha.value != confirmPassword.value){
        swal({
          title: "Ops!",
          text: "As senhas não coincidem"
        });
      return;
    }

    var parametros = "nmCliente=" + firstName.value + " " + lastName.value +
    "&nmUser=" + nmUser.value + "&email=" + email.value + "&senha=" + senha.value;

    $.ajax({
      url: "/cadastrar",
      method: "POST",
      data: parametros,

      error: function(data){
        swal({
              title: "Ops!",
              text: data.responseText
        });
      },

      success: function(data){
        window.location.href = data;
      }

    })

  }


</script>
