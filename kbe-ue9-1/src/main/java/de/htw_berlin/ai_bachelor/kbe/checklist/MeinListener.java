package de.htw_berlin.ai_bachelor.kbe.checklist;

import java.util.List;

import javax.faces.component.UIComponent;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class MeinListener implements PhaseListener{

	public void afterPhase(PhaseEvent arg0) {
		System.out.println("After Phase: " + arg0.getPhaseId() + ":");
		if (arg0.getPhaseId() == PhaseId.RESTORE_VIEW) {
			System.out.println("  Postback? " + arg0.getFacesContext().isPostback());
		} 
		if (arg0.getPhaseId() == PhaseId.RENDER_RESPONSE || arg0.getPhaseId() == PhaseId.RESTORE_VIEW) {
			System.out.println("  ID der Wurzel des Komponentenbaums:" + getAllTreeComponents(arg0));
			System.out.println("  Anzahl der Elemente im zum View gehörenden Komponentenbaum:" + getAllTreeComponents(arg0));
		} 
	}

	public void beforePhase(PhaseEvent arg0) {
		System.out.println("-----------------------");
		System.out.println("Before Phase: " + arg0.getPhaseId());
	}

	public PhaseId getPhaseId() {
		return PhaseId.ANY_PHASE;
	}
	
	private int getAllTreeComponents(PhaseEvent arg0) {
		int count = 1;
		count += arg0.getFacesContext().getViewRoot().getChildCount();
		count += getComponentsFromChilds(arg0.getFacesContext().getViewRoot().getChildren());
		return count;
	}
	
	private int getComponentsFromChilds(List<UIComponent> li) {
		int count = 0;
		for (int i = 0; i < li.size(); i++) {
			count += li.get(i).getChildCount();
			count += getComponentsFromChilds(li.get(i).getChildren());
		}
		return count;
	}


}
