<%@page import="javax.swing.text.StyledEditorKit.ForegroundAction"%>
<%@page import="com.jsp.hibernat_one_to_one_mapping.dto.Person"%>
<%@page import="java.util.List"%>
<%@page import="com.jsp.hibernat_one_to_one_mapping.dao.PersonAdharDao"%>
<html>
<body>
<h2>Hello World!</h2>
<div>
    <%
    PersonAdharDao dao=new PersonAdharDao();
    List<Person> person=dao.getAllPersonwithAdhar();
    for(Person person2: person){
    	%>
    	<h1><%=person2.getName()%></h1>
    	<h1><%=person2.getAdhar() %></h1>
    	<%
    }
    %>
</div>
</body>
</html>
