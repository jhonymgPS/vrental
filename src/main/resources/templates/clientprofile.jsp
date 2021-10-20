<!DOCTYPE html>
<html lang="en" xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org">
    <head >
        <meta charset="utf-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
            <meta name="viewport" content="width=device-width, initial-scale=1"/>
            <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
            <meta name="description" content="">
                <meta name="author" content="">
                    <link rel="icon" href="../../favicon.ico"/>

                    <title>VRental</title>

                    <!-- Bootstrap core CSS -->
                    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
                        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
                        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns" crossorigin="anonymous"></script>
    </head>
    <body>
        <div class="container">
            <!-- Main component for a primary marketing message or call to action -->
            <div class="row">
                <div class="col">
                    <form action="#" th:action="@{/clients/save}" th:object="${client}" method="post">
                        <div class="form-group" >
                            <label for="firstname">Nombre</label>
                            <input type="text" class="form-control"
                                   th:field="*{firstname}" id="firstname" required="true">
                                <p class="alert alert-danger" th:if="${#fields.hasErrors('firstname')}" th:errors="*{firstname}" />
                        </div>
                        <div class="form-group" >
                            <label for="lastname">Apellidos</label>
                            <input type="text" class="form-control"
                                   th:field="*{lastname}" id="lastname" required="true">
                        </div>
                        <div class="form-group" >
                            <label for="phone">Telefono</label>
                            <input type="tel" class="form-control"
                                   th:field="*{phone}" id="phone" required="true" >
                        </div>
                        <tr>
                            <button type="submit" >Guardar</button>
                        </tr>
                    </form>
                </div>
            </div>
        </div> <!-- /container -->
        <!-- Bootstrap core JavaScript
        ================================================== -->
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    </body>
</html>