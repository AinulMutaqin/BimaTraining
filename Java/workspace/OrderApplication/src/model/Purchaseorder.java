package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the PURCHASEORDER database table.
 * 
 */
@Entity
@Table(name="PURCHASEORDER")
@NamedQuery(name="Purchaseorder.findAll", query="SELECT p FROM Purchaseorder p")
public class Purchaseorder implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int poid;

	private double poamount;

	@Column(length=255)
	private String potiitle;

	public Purchaseorder() {
	}

	public int getPoid() {
		return this.poid;
	}

	public void setPoid(int poid) {
		this.poid = poid;
	}

	public double getPoamount() {
		return this.poamount;
	}

	public void setPoamount(double poamount) {
		this.poamount = poamount;
	}

	public String getPotiitle() {
		return this.potiitle;
	}

	public void setPotiitle(String potiitle) {
		this.potiitle = potiitle;
	}

}