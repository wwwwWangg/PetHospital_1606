<%--  
  Created by IntelliJ IDEA.  
  User: Administrator  
  Date: 2018/3/13  
  Time: 8:44  
  To change this template use File | Settings | File Templates.  
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html>--%>
<%--<head>--%>
<%--<title>$Title$</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--<h1><%out.println("Hello World");%></h1>--%>
<%--<h2><%out.println("Welcome To JSP World");%></h2>--%>
<%--</body>--%>
<%--</html>--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>登录页面</title>
  <link href="<%=basePath%>css/styles.css" rel="stylesheet"/>
  <script type="text/javascript" src="js/jquery-1.5.1.min.js"></script>
  <!-- 软键盘控件start -->
  <link href="css/keypad/css/framework/form.css" rel="stylesheet" type="text/css"/>
  <!-- 软键盘控件end -->
  <script>

  </script>
</head>
<body>
<div>
  <div id="header">
    <h1>社区宠物诊所</h1>
  </div>
  <div id="main">
    <form action="LoginServlet" method="post">
      <table>
        <tr>
          <td>姓名</td>
          <td><input name="username" /></td>
        </tr>
        <tr>
          <td>密码</td>
          <td><input  type="password" name="pwd" placeholder="请输入密码" class="keypad" keypadMode="full" allowKeyboard="true" value=""/></td>
        </tr>
        <tr>
          <td>验证码</td>
          <td><input name="usercode" /></td>
        </tr>
        <tr>
          <td>点击刷新</td>
          <!-- 为了避免IE的缓存bug  需要每次请求带上不一样的参数 这个参数可以没有任何意义  关键是要不一样 -->
          <td><img src="CheckCode"   onclick="this.src='CheckCode?rand='+Math.random()"/></td><!-- /在html和转发Dispatcher里面的含义不同  前者表示服务器根目录  8080:/   后者表示当前应用根目录 8080/ph/ -->
        </tr>
        <tr>
          <td></td>
          <td><input  type="submit" value="登录" /> <input type="reset" value="重置"/></td>
        </tr>
      </table>
    </form>
    <h4 align="center" style="color:red"><%=request.getAttribute("msg")==null?"":request.getAttribute("msg") %>
      <%=request.getParameter("para")==null?"":request.getParameter("para") %></h4>
  </div>
  <div id="footer">

  </div>
</div>
<script type="text/javascript" src="css/keypad/js/form/keypad.js"></script>
<script type="text/javascript" src="css/keypad/js/framework.js"></script>
</body>
</html>