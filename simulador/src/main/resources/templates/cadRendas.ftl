<#import "commons/nav.ftl" as nav/>
<#import "commons/components.ftl" as comp/>

<@comp.head/>
<@nav.profile/>


<script src="js/config.js"></script>

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
                    <li class="active" id="tdRend" onclick="btnTrocaP(tdRend, rendasP)"><a>Todas as Rendas</a></li>
                    <li id="fixa" onclick="btnTrocaP(fixa, fixaP)"><a>Renda Fixa</a></li>
                    <li id="variavel" onclick="btnTrocaP(variavel, variaP)"><a>Renda Variável</a></li>
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

                <select class="form-control" id="cmbRendVar" onchange="btnTroca(cmbRendVar, txtRendPadVar)">
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
                        <button type="button" class="btn btn-primary" onclick="btnNew(txtRendPadVar, txtValorRVPad, tbRendVar,tableVar)">
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

                <select class="form-control" id="cmbRendaFix" onchange="btnTroca(cmbRendaFix, txtRendFixPad)">
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
                        <button type="button" class="btn btn-primary" onclick="btnNew(txtRendFixPad, txtValorRFPad, tbRendaFix, tableFix)">
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




