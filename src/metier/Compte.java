package metier;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.util.Date;

@XmlRootElement(name = "compte")
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {
    private Long code;
    private double montant;
    @XmlTransient
    private Date dateCreation;

    public Compte(Long code, double montant, Date dateCreation) {
        this.code = code;
        this.montant = montant;
        this.dateCreation = dateCreation;
    }

    public Long getCode() {
        return code;
    }

    public double getMontant() {
        return montant;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}
