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

                Existem dois tipos de rendas, as fixas e as variáveis. As rendas fixas são todas aqueles gastos que temos
                mensalmente com algo e sabemos que esse valor não se altera, já as rendas variáveis são aqueles gastos que
                temos e que podem ser alterados, seja com seu valor diminuindo ou aumentando, normalmente são as rendas que
                mais nos prejudicam e que temos que tentar diminuir.
                <br><br>
                <p>
                    Para começar, você pode escolher em cadastrar uma renda fixa ou variável.
                </p>

                <br><br>

                <ul class="nav nav-tabs">
                    <li class="active"><a>Todas as Rendas</a></li>
                    <li><a>Renda Fixa</a></li>
                    <li><a>Renda Variável</a></li>
                </ul>

                <br><br>

                <div id="rendasP">
                    <table class="table">
                        <thead>
                        <tr class="thead-dark">
                            <th>#</th>
                            <th>Rendas</th>
                            <th>Tipo</th>
                            <th>Valor Renda</th>
                            <th>Edições</th>
                        </tr>
                        </thead>

                        <tbody id="tbReceitas">
                        </tbody>
                    </table>
                </div>

                <!--
                RENDAS VARIAVEIS
                 -->
                <div id="variaP" style="display: none">
                    Temos nossas opções padrões:

                    <select class="form-control" id="cmbRendVar">
                        <option value="" disabled selected>Selecione uma renda variável</option>
                        <option value="1">Luz</option>
                        <option value="2">Água</option>
                        <option value="3">Internet</option>
                        <option value="4">Metro</option>
                        <option value="5">Ônibus</option>
                    </select>

                    <br>

                    <div class="form-group">
                        <div class="form-label-group">
                            <input type="text" id="txtRendPadVar" readonly class="form-control" placeholder="Nova renda variável" required="required">
                        </div>
                    </div>

                    <!-- Valor Receita padrão-->
                    <div class="form-group">
                        <div class="form-label-group">
                            <input type="number" id="txtValorRVPad" class="form-control" placeholder="Valor renda variável" required="required">
                        </div>
                    </div>

                    <!-- Receita padrão -->
                    <div class="form-group">
                        <div class="form-label-group">
                            <button type="button" class="btn btn-primary">
                                Adicionar Renda variável
                            </button>
                        </div>
                    </div>

                    <br><br>

                    <p>
                        Ou você pode adicionar uma renda variável que ainda não existe:
                    </p>

                    <!-- Nova Receita-->
                    <div class="form-group">
                        <div class="form-label-group">
                            <input type="text" id="txtRendVar" class="form-control" placeholder="Nova renda variável" required="required">
                        </div>
                    </div>

                    <!-- Valor Receita-->
                    <div class="form-group">
                        <div class="form-label-group">
                            <input type="number" id="txtValor" class="form-control" placeholder="Valor renda variável" required="required">
                        </div>
                    </div>

                    <button type="submit" class="btn btn-primary">Confirmar</button>

                </div>

                <!--
                    RENDAS FIXAS
                 -->
                <div id="fixaP" style="display: none">
                    Temos nossas opções padrões:

                    <select class="form-control" id="cmbRendaFix">
                        <option value="" disabled selected>Selecione uma renda fixa</option>
                        <option value="1">Aluguel</option>
                        <option value="2">Faculdade</option>
                        <option value="3">Curso</option>
                    </select>

                    <br>

                    <div class="form-group">
                        <div class="form-label-group">
                            <input type="text" id="txtRendFixPad" readonly class="form-control" placeholder="Nova renda fixa" required="required">
                        </div>
                    </div>

                    <!-- Valor Receita padrão-->
                    <div class="form-group">
                        <div class="form-label-group">
                            <input type="number" id="txtValorRFPad" class="form-control" placeholder="Valor renda fixa" required="required">
                        </div>
                    </div>

                    <!-- Receita padrão -->
                    <div class="form-group">
                        <div class="form-label-group">
                            <button type="button" class="btn btn-primary">
                                Adicionar renda fixa
                            </button>
                        </div>
                    </div>

                    <br><br>

                    <p>
                        Ou você pode adicionar uma renda fixa que ainda não existe:
                    </p>

                    <!-- Nova Receita-->
                    <div class="form-group">
                        <div class="form-label-group">
                            <input type="text" id="txtRendFix" class="form-control" placeholder="Nova renda fixa" required="required">
                        </div>
                    </div>

                    <!-- Valor Receita-->
                    <div class="form-group">
                        <div class="form-label-group">
                            <input type="number" id="txtRendFixValor" class="form-control" placeholder="Valor renda fixa" required="required">
                        </div>
                    </div>

                    <button type="submit" class="btn btn-primary">Confirmar</button>

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





