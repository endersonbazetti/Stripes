<%@include file="/WEB-INF/jsp/common/taglibs.jsp"%> 

<stripes:layout-render name="/WEB-INF/jsp/common/layout_main.jsp" title="Contact List">
	<stripes:layout-component name="body">
		<stripes:messages />
		<table>
			<tr>
				<th>First name</th>
				<th>Last name</th>
				<th>Email</th>
				<th>Acao</th>
			</tr>

			<core:forEach var="contact" items="${actionBean.contacts}">
				<tr>
					<td>${contact.firstName}</td>
					<td>${contact.lastName}</td>
					<td>${contact.email}</td>
					<td>
						<stripes:link beanclass="action.ContactListActionBean" event="view">
							<stripes:param name="contactId" value="${contact.id}" />
							View
						</stripes:link>
						 | 
						<stripes:link beanclass="action.ContactListActionBean" event="delete" onclick="return confirm('Delete ${caontact}');">
							<stripes:param name="contactId" value="${contact.id}" />
							Delete
						</stripes:link>
					</td>
				</tr>
			</core:forEach>
		</table>
		<stripes:link beanclass="action.ContactFormActionBean"> Create a New Contact </stripes:link>
	</stripes:layout-component>
</stripes:layout-render>