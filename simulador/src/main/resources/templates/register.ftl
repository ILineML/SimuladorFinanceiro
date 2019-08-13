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

        <form method="post" action="/cadastrar">
          <div class="form-group">
            <div class="form-row">
              <div class="col-md-6">
                <div class="form-label-group">
                  <input type="text" id="firstName" name="firstName" class="form-control" placeholder="Nome" required="required" autofocus="autofocus">
                  <label for="firstName">Nome</label>
                </div>
              </div>
              <div class="col-md-6">
                <div class="form-label-group">
                  <input type="text" id="lastName" name="lastName" class="form-control" placeholder="Sobrenome" required="required">
                  <label for="lastName">Sobrenome</label>
                </div>
              </div>
            </div>
          </div>

          <div class="form-group">
            <div class="form-label-group">
              <input type="text" id="inputUser" name="inputUser" class="form-control" placeholder="Nome de Usuário" required="required">
              <label for="inputUser">Nome de Usuário</label>
            </div>
          </div>

          <div class="form-group">
            <div class="form-label-group">
              <input type="email" id="inputEmail" name="inputEmail" class="form-control" placeholder="Email" required="required">
              <label for="inputEmail">Email</label>
            </div>
          </div>
          <div class="form-group">
            <div class="form-row">
              <div class="col-md-6">
                <div class="form-label-group">
                  <input type="password" id="inputPassword" name="inputPassoword" class="form-control" placeholder="Senha" required="required">
                  <label for="inputPassword">Senha</label>
                </div>
              </div>
              <div class="col-md-6">
                <div class="form-label-group">
                  <input type="password" id="confirmPassword" class="form-control" placeholder="Confirmar Senha" required="required">
                  <label for="confirmPassword">Confirmar Senha</label>
                </div>
              </div>

              <div class="col-md-6" style="margin-top: 25px;">
                <label>Foto de Perfil</label>
              <div class="input-group">
                <div class="input-group-prepend">
                  <span class="input-group-text" id="inputGroupFileAddon01">Upload</span>
                </div>
                <div class="custom-file">
                  <input type="file" class="custom-file-input" id="inputGroupFile01"
                         aria-describedby="inputGroupFileAddon01" name="ftPerfil">
                  <label class="custom-file-label" for="inputGroupFile01">Escolher Foto</label>
                </div>
              </div>

              </div>

            </div>
          </div>
          <button class="btn btn-primary btn-block" type="submit">Registrar</button>
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

</body>

</html>
