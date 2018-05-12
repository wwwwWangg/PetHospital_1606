<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: hlzhang
  Date: 2018/4/11
  Time: 9:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="ph.po.User"%>
<%@page import="ph.po.Speciality"%>
<%@page import="ph.po.Vet"%>
<%@page import="java.util.List"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>客户查询结果页面</title>
    <link href="css/styles.css" rel="stylesheet"/>
    <SCRIPT type="text/javascript">
        function confirmDialog()
        {
            if(confirm("确定要删除该客户信息吗?"))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    </SCRIPT>
</head>
<body>
<div>
    <div id="header"><%@include file="/inc/header.inc" %></div>
    <div id="main">
        <table>
            <tr>
                <td align="center">客户姓名</td>
                <td align="center">客户电话</td>
                <td align="center">客户地址</td>
            </tr>

            <c:forEach items="${cs}" var="a">
                <tr  class="result">
                    <td>${a.name}</td>
                    <td>${a.tel}</td>
                    <td>${a.address}</td>
                    <td>
                        <form action="/doDel" method="post"><input type="hidden" value="${a.id}" name="id">
                            <input type="submit" value="删除" onclick=" return confirmDialog();"></form>
                    </td>
                </tr>
            </c:forEach>

            <tr>
                <td></td>
                <td><input value="返回" type="button" onclick="location.href='customersearch.jsp'" /></td>
            </tr>
        </table>

        <h4 align="center" style="color:red"><%=request.getAttribute("msg") == null ? "" : request.getAttribute("msg")%></h4>
    </div>
    <div id="footer"></div>
</div>
</body>
</html>
