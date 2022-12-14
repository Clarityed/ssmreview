<%--
  Created by IntelliJ IDEA.
  User: Clarity
  Date: 2022/8/9
  Time: 14:37
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改书籍</title>
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css"rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改书籍</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/book/updateBook" method="post">
        <input type="hidden" name="bookID" value="${book.getBookID()}">
        书籍名称：<input type="text" name="bookName" value="${book.getBookName()}"/><br><br><br>
        书籍数量：<input type="text" name="bookCounts" value="${book.getBookCounts()}"/><br><br><br>
        书籍详情：<input type="text" name="detail" value="${book.getDetail()}"/><br><br><br>
        <input type="submit" value="提交"/>
    </form>
</div>
</body>
</html>
