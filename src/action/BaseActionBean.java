package action;

import net.sourceforge.stripes.action.ActionBean;
import net.sourceforge.stripes.action.ActionBeanContext;

public abstract class BaseActionBean implements ActionBean {
	
	private ActionBeanContext context;

	public void setContext(ActionBeanContext context) {
		this.context = context;
	}

	public ActionBeanContext getContext() {
		return context;
	}
}
