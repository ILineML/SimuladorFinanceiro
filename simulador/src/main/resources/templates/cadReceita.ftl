<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">


    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
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
                Receitas são todos os recursos resultantes da venda de uma mercadorias ou de uma prestação de serviços, porém nem
                todas as receitas vem de vendas ou prestações de serviços. Alugueis, rendimentos de uma aplicação
                financeira, juros e etc, podem ser uma forma de receitas.

                <br><br>

                <p>
                    Aqui você pode cadastrar tudo o que entra em dinheiro mensalmente.
                </p>

                Temos nossas opções padrões:

                <select class="form-control" id="cmbReceita" onchange="changeText()">
                    <option value="" disabled selected>Selecione uma receita</option>
                    <option value="1">Salário</option>
                    <option value="2">Aluguel</option>
                    <option value="3">Horas Extras</option>
                    <option value="4">13º Salário</option>
                </select>

                <br>

                    <div class="form-group">
                        <div class="form-label-group">
                            <input type="text" id="txtReceitaPad" name="txtReceita" readonly class="form-control" placeholder="Nova receita" required="required">
                        </div>
                    </div>

                    <!-- Valor Receita padrão-->
                    <div class="form-group">
                        <div class="form-label-group">
                            <input type="number" id="txtValorPad" class="form-control" placeholder="Valor receita" required="required" min="1"
                            onchange="changeValue(txtValorPad)">
                        </div>
                    </div>

                    <!-- Receita padrão -->
                    <div class="form-group">
                        <div class="form-label-group">
                            <button type="button" class="btn btn-primary" onclick="btnConfirm(txtValorPad, txtReceitaPad, 0, 0)" data-toggle="modal" data-target="#myModal">
                                Adicionar receita
                            </button>
                        </div>
                    </div>

                <br><br>

                <p>
                    Ou você pode adicionar uma receita que ainda não existe:
                </p>

                <!-- Nova Receita-->
                <div class="form-group">
                    <div class="form-label-group">
                        <input type="text" id="txtReceita" class="form-control" placeholder="Nova receita" required="required">
                    </div>
                </div>

                <!-- Valor Receita-->
                <div class="form-group">
                    <div class="form-label-group">
                        <input type="number" id="txtValor" class="form-control" placeholder="Valor receita" required="required" min="1"
                               onchange="changeValue(txtValor)">
                    </div>
                </div>

                <button type="submit" class="btn btn-primary" onclick="btnConfirm(txtValor, txtReceita, 1, 1)">Confirmar</button>

                <br><br>

                <table class="table" id="tableRec">
                    <thead>
                    <tr class="thead-dark">
                        <th>#</th>
                        <th>Receita</th>
                        <th>Valor Receita</th>
                        <th>Edições</th>
                    </tr>
                    </thead>

                    <tbody id="tbReceitas" name="tbReceitas">
                    </tbody>

                </table>

                <br><br>

            </div>
        </div>

        <br>
        <br>

    </div>

</div>

<div class="modal" tabindex="-1" role="dialog">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title">Confirmação de cadastro receita</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Fechar">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <p>
                    Receita: <b class="recipe"></b>
                </p>
                <p>
                    Valor: <b class="value"></b>
                </p>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Fechar</button>
                <button type="button" class="btn btn-primary">Salvar mudanças</button>
            </div>
        </div>
    </div>
</div>

</body>
</html>
<script src="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js"></script>
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<script src ="js/receitas/cadastrarReceitas.js"></script>
<script src="vendor/jquery/jquery.min.js"></script>
<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

<script src="vendor/jquery-easing/jquery.easing.min.js"></script>
<script src="vendor/jquery/jquery.min.js"></script>
<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
<script src="vendor/jquery-easing/jquery.easing.min.js"></script>
