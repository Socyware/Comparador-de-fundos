package percentualRentabilidade.entities;

import java.util.Objects;

public class Percentual {
	
	private Double vci;
	private Double vcf;
	private Double percentual;
	
	public Percentual () {
		
	}

	public Percentual(Double vci, Double vcf, Double percentual) {
		super();
		this.vci = vci;
		this.vcf = vcf;
		this.percentual = percentual;
	}

	public Double getVci() {
		return vci;
	}

	public void setVci(Double vci) {
		this.vci = vci;
	}

	public Double getVcf() {
		return vcf;
	}

	public void setVcf(Double vcf) {
		this.vcf = vcf;
	}

	public Double getPercentual() {
		return percentual;
	}

	public void setPercentual(Double percentual) {
		this.percentual = percentual;
	}
	
	public double  periodo ( ) {
		return percentual = (vci - vcf) / vci * 100;
	}

	@Override
	public int hashCode() {
		return Objects.hash(percentual, vcf, vci);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Percentual other = (Percentual) obj;
		return Objects.equals(percentual, other.percentual) && Objects.equals(vcf, other.vcf)
				&& Objects.equals(vci, other.vci);
	}

	
}
