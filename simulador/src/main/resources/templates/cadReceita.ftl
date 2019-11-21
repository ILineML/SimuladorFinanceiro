<#import "commons/nav.ftl" as nav/>
<#import "commons/components.ftl" as comp/>

<@comp.head/>
<@nav.profile/>

    <div class="col-md-9">
        <div class="profile-content">
            Receitas são todos os recursos resultantes da venda de uma mercadorias ou de uma prestação de serviços, porém nem
            todas as receitas vem de vendas ou prestações de serviços. Alugueis, rendimentos de uma aplicação
            financeira, juros e etc, podem ser uma forma de receitas.

            <br><br>

                <p>
                    Aqui você pode cadastrar tudo o que entra em dinheiro em cada mês do ano.
                </p>

                Temos nossas opções padrões:

                <select class="form-control" id="cmbReceita" onchange="btnTroca(cmbReceita, txtReceitaPad, teste)">
                    <option value="" disabled selected>Selecione uma receita</option>
                    <option value="1">Salário</option>
                    <option value="2">Aluguel</option>
                    <option value="3">Horas Extras</option>
                    <option value="4">13º Salário</option>
                </select>

                <br>

            <form action="/cadReceitas" method="POST">
                <div class="form-group">
                    <div class="form-label-group">
                        <input type="text" id="txtReceitaPad" name="txtReceita" readonly class="form-control" placeholder="Nova receita" required="required">
                    </div>
                </div>
                <input name="cmbReceita" id="teste">
                <input name = "idUser" value="${login.idUsu}">
                <!-- Valor Receita padrão-->
                <div class="form-group">
                    <div class="form-label-group">
                        <input type="number" name="txtValor" class="form-control" placeholder="Valor receita" required="required">
                    </div>
                </div>

                <!-- Receita padrão -->
                <div class="form-group">
                    <div class="form-label-group">
                        <button type="submit" class="btn btn-primary">
                            Adicionar receita
                        </button>
                    </div>
                </div>
            </form>

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
                        <input type="number" id="txtValor" class="form-control" placeholder="Valor receita" required="required">
                    </div>
                </div>

            <button type="submit" class="btn btn-primary">Confirmar</button>

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

<script src="js/config.js"></script>

<br>
<br>
