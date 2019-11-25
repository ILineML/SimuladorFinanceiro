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
                TEXTOS SOBRE INVESTIMENTOS

                <br><br>

                <ul class="nav nav-tabs">
                    <li class="active"><a>Todas os investimentos</a></li>
                    <li id="tdCadPad"><a>Simulador de investimentos</a></li>
                </ul>

                <br><br>

                <div id="tdPage">
                    Temos nossas opções padrões:

                    <select class="form-control" id="cmbInv">
                        <option value="" disabled selected>Selecione um investimento</option>
                        <option value="1">Tesouro Direto</option>
                        <option value="2">LCI e LCA</option>
                        <option value="3">Ações</option>
                    </select>

                    <br>

                    <div class="form-group">
                        <div class="form-label-group">
                            <input type="text" id="txtInvPad" readonly class="form-control" placeholder="Novo investimento" required="required">
                        </div>
                    </div>

                    <div class="form-group">
                        <div class="form-label-group">
                            <input type="number" id="txtEntradaPad" class="form-control" placeholder="Valor de entrada" required="required">
                        </div>
                    </div>

                    <!-- Valor Receita padrão-->
                    <div class="form-group">
                        <div class="form-label-group">
                            <input type="number" id="txtMensalPad" class="form-control" placeholder="Valor mensal" required="required">
                        </div>
                    </div>

                    <!-- Receita padrão -->
                    <div class="form-group">
                        <div class="form-label-group">
                            <button type="button" class="btn btn-primary">
                                Adicionar Investimentos
                            </button>
                        </div>
                    </div>

                    <p>
                        Ou você pode adicionar um investimento que ainda não existe:
                    </p>

                    <!-- Nova Receita-->
                    <div class="form-group">
                        <div class="form-label-group">
                            <input type="text" id="txtInv" class="form-control" placeholder="Novo investimento" required="required">
                        </div>
                    </div>

                    <div class="form-group">
                        <div class="form-label-group">
                            <input type="number" id="txtEntrada" class="form-control" placeholder="Valor de entrada" required="required">
                        </div>
                    </div>

                    <!-- Valor Investimento-->
                    <div class="form-group">
                        <div class="form-label-group">
                            <input type="number" id="txtMensal" class="form-control" placeholder="Valor mensal" required="required">
                        </div>
                    </div>

                    <!-- Adiciona receita-->
                    <button type="button" class="btn btn-primary">
                        Adicionar novo investimento
                    </button>
                    <br><br>
                    <table class="table">
                        <thead>
                        <tr class="thead-dark">
                            <th>#</th>
                            <th>Investimento</th>
                            <th>Valor Entrada</th>
                            <th>Valor Mensal</th>
                            <th>Edições</th>
                        </tr>
                        </thead>

                        <tbody>
                        </tbody>
                    </table>
                </div>

                <!--
                    Simulador
                 -->
                <div id="cadPage" style="display: none">
                    Logo logo teremos atualizações por aqui
                </div>

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



