
package move.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.1.6
 * Thu Feb 16 14:22:51 EST 2017
 * Generated source version: 3.1.6
 */

@XmlRootElement(name = "investmentValueResponse", namespace = "http://move/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "investmentValueResponse", namespace = "http://move/")

public class InvestmentValueResponse {

    @XmlElement(name = "return")
    private java.lang.String _return;

    public java.lang.String getReturn() {
        return this._return;
    }

    public void setReturn(java.lang.String new_return)  {
        this._return = new_return;
    }

}

