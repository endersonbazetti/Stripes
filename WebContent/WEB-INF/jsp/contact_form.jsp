<%@include file="/WEB-INF/jsp/common/taglibs.jsp"%>

<stripes:layout-render name="/WEB-INF/jsp/common/layout_main.jsp" title="Create Contact">
	<stripes:layout-component name="body">
		<stripes:errors />
		<stripes:form beanclass="action.ContactFormActionBean">
			<div><stripes:hidden name="contact.id" /></div>
			<table class="form">
				<tr>
					<td>Email:</td>
					<td><stripes:text name="contact.email" class="required" /></td>
				</tr>
				<tr>
					<td>First name:</td>
					<td><stripes:text name="contact.firstName" /></td>
				</tr>
				<tr>
					<td>Last name:</td>
					<td><stripes:text name="contact.lastName" /></td>
				</tr>
				<tr>
					<td>Phone number:</td>
					<td><stripes:text name="contact.phoneNumber" /></td>
				</tr>
				<tr>
					<td>Birth date:</td>
					<td><stripes:text name="contact.birthDate" /></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><stripes:password name="contact.password" /></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td>
						<stripes:submit name="save" value="Save" />
						<stripes:submit name="cancel" value="Cancel" />
					</td>
				</tr>
			</table>
		</stripes:form>
	</stripes:layout-component>
</stripes:layout-render>