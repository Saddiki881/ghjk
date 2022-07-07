<%@ include file="../static/common/header.jspf"%>
<%@ include file="../static/common/navigation.jspf"%>

<div class="container">
    <div>
        <a type="button" class="btn btn-primary btn-md" href="/add">Ajouter une Personne</a>
    </div>
    <br>
    <div class="panel panel-primary">
        <div class="panel-heading">
            <h3>Listes des personnes</h3>
        </div>
        <div class="panel-body">
            <table class="table table-striped">
                <thead>
                <tr>
                    <th width="40%">Cin</th>
                    <th width="40%">Prenom|Nom</th>
                    <th width="20%"></th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${personne}" var="personne">
                    <tr>
                        <td>${personne.Cin}</td>
                        <td>"${personne.Prenom} ${personne.Nom}"</td>
                        <td><a type="button" class="btn btn-success"
                               href="/updatepersonne?id=${personne.id}">Modifier</a>
                            <a type="button" class="btn btn-warning"
                               href="/updatepersonne?id=${personne.id}">Supprimer</a></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>

</div>
<%@ include file="../static/common/footer.jspf"%>