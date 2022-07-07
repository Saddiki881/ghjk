<%@ include file="../static/common/header.jspf"%>
<%@ include file="../static/common/navigation.jspf"%>
<div class="container">
    <div class="row">
        <div class="col-md-6 col-md-offset-3 ">
            <div class="panel panel-primary">
                <div class="panel-heading">Ajouter un personne</div>
                <div class="panel-body">
                    <%--@elvariable id="personne" type=""--%>
                    <form:form method="post" modelAttribute="personne">
                        <form:hidden path="id" />
                        <fieldset class="form-group">
                            <form:label path="Cin">Cin</form:label>
                            <form:input path="Cin" type="text" class="form-control"
                                        required="required" />
                            <form:errors path="description" cssClass="text-warning" />
                        </fieldset>

                        <fieldset class="form-group">
                            <form:label path="Nom">Nom</form:label>
                            <form:input path="Nom" type="text" class="form-control"
                                        required="required" />
                            <form:errors path="Nom" cssClass="text-warning" />
                        </fieldset>
                        <fieldset class="form-group">
                            <form:label path="Prenom">Prenom</form:label>
                            <form:input path="Prenom" type="text" class="form-control"
                                        required="required" />
                            <form:errors path="Prenom" cssClass="text-warning" />
                        </fieldset>
                        <button type="submit" class="btn btn-success">Enregistrer</button>
                    </form:form>
                </div>
            </div>
        </div>
    </div>
</div>
<%@ include file="../static/common/footer.jspf"%>