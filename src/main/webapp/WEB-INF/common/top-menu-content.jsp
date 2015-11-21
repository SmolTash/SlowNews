<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="user" scope="session" class="com.infopuls.tash.user.User" />
<%--<jsp:useBean id="users" scope="application" class="net.tash.infopuls.UsersMap" />--%>

<div class="templatemo-logo "> <!--visible-xs-block-->
  <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12 white-bg logo-left-container">
    <h1 class="logo-left">Slow</h1>
  </div>
  <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12 black-bg logo-right-container">
    <h1 class="logo-right">News</h1>
    <div class="top-menu-right">
      <c:if test="${user.login == null}">
        <ul>
          <li class = "top-menu">
            <a class = "top-menu-a" href="login" class="active">Log in</a>
          </li>
          <li class = "top-menu">
            <a class = "top-menu-a" href="registration">Registration</a>
          </li>
        </ul>
      </c:if>

      <c:if test="${user.login != null}">
        <div class = "top-menu-a">${user.firstName.concat(" ").concat(user.lastName)} </div>

        <ul>
          <li class = "top-menu">
            <a class = "top-menu-a" href="logout" class="active">Log out</a>
          </li>
        </ul>
      </c:if>
      </div>



      <%--<ul>--%>
        <%--<li class = "top-menu">--%>
          <%--<a class = "top-menu-a" href="login" class="active">Log in</a>--%>
        <%--</li>--%>
        <%--<li class = "top-menu">--%>
          <%--<a class = "top-menu-a" href="sigin">Sign in</a>--%>
        <%--</li>--%>
      <%--</ul>--%>
    </div>
  </div>
</div>