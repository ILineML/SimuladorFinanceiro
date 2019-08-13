<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>SB Admin - Login</title>

  <!-- Custom fonts for this template-->
  <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">

  <!-- Custom styles for this template-->
  <link href="css/sb-admin.css" rel="stylesheet">

</head>

<body class="bg-dark">

  <div class="container">
    <div class="card card-login mx-auto mt-5">
      <div class="card-header">Cadastro de Receitas</div>
      <div class="card-body">


        <form action="#" method="POST">

          <div class="form-group" id="Campos">
            <div class="form-label-group">
              <input type="number" id="inputEmail" name="inputLogin" class="form-control" placeholder="Salário" required="required" autofocus="autofocus">
              <label for="inputEmail">Salário</label>
            </div>
            <br>
          </div>

          <div class="form-group">
            <span>Nova(s) receitas</span>
            <div class="form-label-group">
              <input type="text" id="inputReceita" name="inputReceita" class="form-control" placeholder="Nova Receita" required="required" autofocus="autofocus">
              <label for="inputReceita">Adicionar nova receita</label>
            </div>
            <br>
            <div class="form-label-group">
              <input type="text" id="inputValReceita" name="inputValReceita" class="form-control" placeholder="Valor Receita" required="required" autofocus="autofocus">
              <label for="inputValReceita">Valor Receita</label>
            </div>
            <br>
            <button class="btn btn-secondary btn-block" type="button" id="btnAdi" onclick="btnAdd()">Adicionar</button>
          </div>

          <button class="btn btn-primary btn-block" type="button" id="btnAdi" onclick="btna()">Confirmar</button>

        </form>

        <script>

          function btnAdd() {

            var rec = inputReceita.value;
            var val = inputValReceita.value;

            Campos.innerHTML +=
                    "<div class='form-label-group'>" +
                    "<input type='number' id='"+rec+"' name='"+rec+"' class='form-control' placeholder='"+rec+"' value = '"+val+"' readonly focus='autofocus'>" +
                    "<label for='"+rec+"'>"+ rec +"</label>" +
                    "</div>" +
                    "<button type='button' class='btn-toolbar' onclick='btnEdit("+rec+")'>Editar</button>"+
                    "<br>"

          }

          function btnEdit(edit) {
            edit.readOnly = false;
          }



        </script>
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
