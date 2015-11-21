<?xml version="1.0" encoding="UTF-8" ?>
<jsp:useBean id="news" scope="application" class="com.infopuls.tash.news.News" />
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <%@ include file="common/head-content.jsp"%>
</head>
<body>
<%@ include file="common/top-menu-content.jsp"%>
<div class="templatemo-container">
    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12 black-bg left-container">
        <div class="tm-left-inner-container">
            <ul class="nav nav-stacked templatemo-nav">
                <li><a href="news" >News</a></li>
                <li><a href="archive" class="active">Archive</a></li>
            </ul>
        </div>
    </div> <!-- left section -->
    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12 white-bg right-container">
        <div class="tm-right-inner-container">
            <div class="row">
                <div class="col-sm-12 col-md-12">
                    <form action="#" method="post">
                        <c:forEach items="${news.archivNewsList}" var="list">
                            <article>
                                <h2>
                                    <c:out value="${list.title}"/>
                                </h2>
                                <img src="${list.imagePath}" alt="" class="img-thumbnail">
                                <c:out value="${list.content}"/>
                            </article>
                        </c:forEach>
                    </form>
                </div>
                <div class="clearfix"></div>
            </div>
            <footer>
                <p class="col-lg-6 col-md-6 col-sm-12 col-xs-12 templatemo-copyright">
                    Copyright &copy; 2015 TashKa
                </p>
            </footer>
        </div>
    </div> <!-- right section -->
</div>
</body>
</html>