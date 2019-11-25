<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">


    <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <link rel="stylesheet" href="/css/profile.css">
    <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">

</head>

<!DOCTYPE html>
<html class="no-js" lang="">

<body>


<div class="container">
    <div class="row profile">
        <div class="col-md-3">
            <div class="profile-sidebar">
                <!-- SIDEBAR USERPIC -->
                <div class="profile-userpic">
                    <img src="" class="img-responsive" id="ftPerfil" alt="">
                </div>
                <!-- END SIDEBAR USERPIC -->
                <!-- SIDEBAR USER TITLE -->
                <div class="profile-usertitle">
                    <div class="profile-usertitle-name">
                        ${userLogado.nmUser}
                    </div>
                    <div class="profile-usertitle-job">
                        ${userLogado.nmCliente}
                    </div>
                    <input name = "idUser" type="hidden" value="${userLogado.idUsu}">
                </div>
                <!-- END SIDEBAR USER TITLE -->
                <!-- SIDEBAR BUTTONS -->
                <div class="profile-userbuttons">
                    <button type="button" class="btn btn-success btn-sm">Follow</button>
                    <button type="button" class="btn btn-danger btn-sm">Message</button>
                </div>
                <!-- END SIDEBAR BUTTONS -->
                <!-- SIDEBAR MENU -->
                <div class="profile-usermenu">
                    <ul class="nav">
                        <li id="charts">
                            <a href="/charts">
                                <i class="glyphicon glyphicon-home"></i>
                                Gráficos
                            </a>
                        </li>
                        <li>
                            <a href="/cadReceita">
                                <i class="glyphicon glyphicon-edit"></i>
                                Configuração de receitas
                            </a>
                        </li>
                        <li>
                            <a href="/cadRendas">
                                <i class="glyphicon glyphicon-edit"></i>
                                Configuração de rendas
                            </a>
                        </li>
                        <li>
                            <a href="/cadInvestimento">
                                <i class="glyphicon glyphicon-edit"></i>
                                Configuração de investimentos
                            </a>
                        </li>
                        <li>
                            <a href="/cadUrgencias">
                                <i class="glyphicon glyphicon-edit"></i>
                                Configuração de urgências
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                <i class="glyphicon glyphicon-user"></i>
                                Configuração de Conta
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                <i class="glyphicon glyphicon-flag"></i>
                                Ajuda
                            </a>
                        </li>
                        <li>
                            <a href="/sair">
                                <i class="glyphicon glyphicon-log-out"></i>
                                Sair
                            </a>
                        </li>
                    </ul>
                </div>
                <!-- END MENU -->

            </div>

        </div>

        <div class="col-md-9">
            <div class="profile-content">

                <br>
                <ul class="nav nav-tabs">
                    <li class="active"><a>Todas as urgências</a></li>
                </ul>
                <br>

                Urgências são todos os recursos que você irá guardar para caso ocorra algo inesperado no seu mês, urgências podem
                ser um dinheiro guardado para um remédio, uma consulta de última hora ou até mesmo um empréstimo a ser feito.
                <br><br>

                <p>
                    Aqui você pode cadastrar suas urgências
                </p>

                Temos nossas opções padrões:

                <select class="form-control" id="cmbUrgen">
                    <option value="" disabled selected>Selecione uma urgência</option>
                    <option value="1">Uniforme</option>
                    <option value="2">Material Escolar</option>
                    <option value="3">Manutenção Casa</option>
                    <option value="4">Manuteção Carro</option>
                </select>

                <br>

                <div class="form-group">
                    <div class="form-label-group">
                        <input type="text" id="txtUrgenPad" readonly class="form-control" placeholder="Nova urgência" required="required">
                    </div>
                </div>

                <!-- Valor Receita padrão-->
                <div class="form-group">
                    <div class="form-label-group">
                        <input type="number" id="txtValorUrgenPad" class="form-control" placeholder="Valor urgência" required="required">
                    </div>
                </div>

                <!-- Receita padrão -->
                <div class="form-group">
                    <div class="form-label-group">
                        <button type="button" class="btn btn-primary">
                            Adicionar urgência
                        </button>
                    </div>
                </div>

                <br><br>

                <p>
                    Ou você pode adicionar uma urgência que ainda não existe:
                </p>

                <!-- Nova Receita-->
                <div class="form-group">
                    <div class="form-label-group">
                        <input type="text" id="txtUrgen" class="form-control" placeholder="Nova urgência" required="required">
                    </div>
                </div>

                <!-- Valor Receita-->
                <div class="form-group">
                    <div class="form-label-group">
                        <input type="number" id="txtValor" class="form-control" placeholder="Valor urgência" required="required">
                    </div>
                </div>

                <button type="submit" class="btn btn-primary">Confirmar</button>

                <br><br>
                <table class="table">

                    <thead>
                    <tr class="thead-dark">
                        <th>#</th>
                        <th>Urgência</th>
                        <th>Valor Urgência</th>
                        <th>Edições</th>
                    </tr>
                    </thead>

                    <tbody>
                    </tbody>

                </table>
                <br><br>
            </div>
        </div>

        <br>
        <br>

    </div>

</div>

</body>
</html>

<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<script src="vendor/jquery/jquery.min.js"></script>
<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

<script src="vendor/jquery-easing/jquery.easing.min.js"></script>
<script src="vendor/jquery/jquery.min.js"></script>
<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
<script src="vendor/jquery-easing/jquery.easing.min.js"></script>