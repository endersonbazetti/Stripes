<%@include file="/WEB-INF/jsp/common/taglibs.jsp"%>

<stripes:layout-render name="/WEB-INF/jsp/common/layout_main.jsp" title="Contact Information">
	<stripes:layout-component name="body">
		<table class="view">
			<tr>
				<td class="label">First name:</td>
				<td class="value">${actionBean.contact.firstName}</td>
			</tr>
			<tr>
				<td class="label">Last name:</td>
				<td class="value">${actionBean.contact.lastName}</td>
			</tr>
			<tr>
				<td class="label">Email:</td>
				<td class="value">${actionBean.contact.email}</td>
			</tr>
			<tr>
				<td class="label">Phone number:</td>
				<td class="value">${actionBean.contact.phoneNumber}</td>
			</tr>
			<tr>
				<td class="label">Birth date:</td>
				<td class="value">${actionBean.contact.birthDate}</td>
			</tr>
		</table>
		<p>
			<stripes:link beanclass="action.ContactListActionBean"> Back to List </stripes:link>
		</p>
	</stripes:layout-component>
</stripes:layout-render>