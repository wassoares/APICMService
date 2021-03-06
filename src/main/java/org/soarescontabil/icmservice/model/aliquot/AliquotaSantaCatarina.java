package org.soarescontabil.icmservice.model.aliquot;

import org.soarescontabil.icmservice.model.Aliquota;
import org.soarescontabil.icmservice.model.Uf;

public class Aliquota17Padrao7 implements Aliquota {
	
	@Override
	public double getPorcentagem(Uf origem, Uf destino) {
		if (origem.equals(destino)) {
			return 17;
		} else if (destino.equals(Uf.IM)) {
			return 4;
		} else if (destino.equals(Uf.MG)
				|| destino.equals(Uf.PR) 
				|| destino.equals(Uf.RS) 
				|| destino.equals(Uf.RJ) 
				|| destino.equals(Uf.SP)) {
			return 12; 
		}
		return 7;
	}

}
