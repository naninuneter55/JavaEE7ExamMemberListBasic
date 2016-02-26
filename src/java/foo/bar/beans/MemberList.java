package foo.bar.beans;

import foo.bar.ejb.MemberFacade;
import foo.bar.entity.Member;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.context.Flash;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class MemberList  implements Serializable{

    @EJB
    MemberFacade memberFacade;
    
    public List<Member> getData() {
        return memberFacade.findAll();
    }
    
    public String view(Member m) {
        Flash flash = FacesContext.getCurrentInstance().getExternalContext().getFlash();
        flash.put("memberId", m.getId());
        return "view.xhtml";
    }

    public String edit(Member m) {
        Flash flash = FacesContext.getCurrentInstance().getExternalContext().getFlash();
        flash.put("memberId", m.getId());
        return "edit.xhtml";
    }

}
