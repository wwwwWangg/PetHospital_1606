<%--
  Created by IntelliJ IDEA.
  User: hlzhang
  Date: 2018/4/11
  Time: 9:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>客户查询页面</title>
    <link href="css/styles.css" rel="stylesheet"/>
    <script type="text/javascript">
        function submit1(frm){
            if (document.frm.name.value=="") {
                alert("请输入客户姓名!");document.frm.name.focus();return false;
            }
            return true;
        }
    </script>
</head>
<body>
<div>
    <div id="header">
        <%@ include  file="inc/header.inc"%>
    </div>
    <div id="main">
        <form action="/doFindName" name="frm" method="post" onsubmit="return submit1(this);">
            <input type="hidden" name="m" value="search">
            <!-- type="hidden"  隐藏表单控件  用来传递值  这个控件在前台页面不显示 -->
            <table>
                <tr>
                    <td>客户姓名</td>
                    <td><input type="text" name="name" title="按客户姓名查询"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input  type="submit" value="查询" />
                        <input type="reset" value="清空"/>
                        <a href="customeradd.jsp">添加新客户</a></td>
                </tr>
            </table>

        </form>
        <h4 align="center" style="color:red">${msg}<%--<%=request.getAttribute("msg")==null?"":request.getAttribute("msg") %>--%></h4>
    </div>
    <div id="footer">

    </div>
</div>
</body>
</html>